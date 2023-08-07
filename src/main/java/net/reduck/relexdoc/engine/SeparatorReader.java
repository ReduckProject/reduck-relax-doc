package net.reduck.relexdoc.engine;

/**
 * @author Gin
 * @since 2023/8/7 13:20
 */
public class SeparatorReader {
    private final char[] expectChars;
    private final int expectLength;

    private final String content;

    private int latestIndex = 0;

    public SeparatorReader(String separator, String content) {
        this.expectChars = separator.toCharArray();
        this.expectLength = separator.length();
        this.content = content;
    }

    public String next() {
        if(latestIndex >= content.length()) {
            return null;
        }

        for(int i = latestIndex; i < content.length(); i++) {
            if(i + (expectLength - 1) < content.length()) {
                boolean expected = true;
                for(int j = 0; j < expectLength; j++) {
                    if(expectChars[j] != content.charAt(i  + j)) {
                        expected = false;
                        break;
                    }
                }

                if(expected) {
                    String valid = content.substring(latestIndex, i);
                    latestIndex = i + expectLength;
                    return valid;
                }
            }
        }

        String valid =  content.substring(latestIndex);
        latestIndex = content.length();
        return valid;
    }

    public String nextTrim() {
        String next = next();
        return next == null ? next : next.trim();
    }
}
