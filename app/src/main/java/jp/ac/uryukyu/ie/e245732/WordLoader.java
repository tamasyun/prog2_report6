package jp.ac.uryukyu.ie.e245732;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class WordLoader {
    public static List<String> loadWords(String file) {
        try {
            return Files.readAllLines(Paths.get(file));
        } catch (IOException e) {
            e.printStackTrace();
            return List.of("test");
        }
    }
}