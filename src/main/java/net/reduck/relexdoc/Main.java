package net.reduck.relexdoc;

import java.io.IOException;
import java.util.List;

import static net.reduck.relexdoc.util.StatisticUtils.getAllUrl;

/**
 * @author Gin
 * @since 2023/7/18 11:26
 */
public class Main {

    public static void main(String[] args) throws IOException {
//        String path = "/Volumes/T7/macos_back/workspace/dsm/frontend/src/main/java/com/secsmart/dsm/frontend/controller";
        String path = "/Volumes/T7/macos_back/workspace/dsm/frontend/src/main/java/com/secsmart/dsm/frontend";
        String path2 = "/Users/zhanjinkai/.m2/repository/org/springframework/spring-web/5.1.3.RELEASE/spring-web-5.1.3.RELEASE-sources.jar";

        List<String> urls = getAllUrl(path);

        urls.forEach(System.out::println);
    }
}
