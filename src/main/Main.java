package main;

import main.util.Parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Moroz
 * @since 13.09.2019
 */

public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> timeLines = new ArrayList<>();
            String line = reader.readLine();
            while (!(line = reader.readLine()).isEmpty()) {
                timeLines.add(line);
            }
            System.out.println(Parsing.parse(timeLines));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
