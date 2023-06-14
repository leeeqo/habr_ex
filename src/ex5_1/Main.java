package ex5_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("E:\\учеба\\Алгоритмы\\test.txt");

        try {
            HashMap<Character, Integer> dictionary = createDict(path);

            for (Character key : dictionary.keySet()) {
                System.out.printf("Character: %c, Num = %d \n", key, dictionary.get(key));
            }
        }
        catch(IOException e) {
            System.out.println("Exception was caught!");
        }

    }

    public static HashMap<Character, Integer> createDict(Path path) throws IOException {
        HashMap<Character, Integer> dict = new HashMap<>();

        List<String> content = Files.readAllLines(path, UTF_8);

        for (String row : content) {
            //System.out.println(row);
            for (Character symbol : row.toCharArray()) {
                dict.put(symbol, (dict.containsKey(symbol)) ? dict.get(symbol) + 1 : 1);
            }
        }

        return dict;
    }
}
