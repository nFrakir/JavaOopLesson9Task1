package com.gmail.seliverstova.hanna;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LetterReader {
    public String readText(File file) throws IllegalArgumentException, IOException {
        if (file == null) {
            throw new IllegalArgumentException("File not exists");
        }
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String text = "";
            for (; ((text = br.readLine()) != null);) {
                sb.append(text);
            }
        } catch (IOException e) {
            throw e;
        }
        return sb.toString();
    }

    public int countLetter(char letter, String text) {
        char[] array = text.toCharArray();
        int cnt = 0;
        for (char c : array) {
            if (c == letter) {
                cnt += 1;
            }
        }
        return cnt;
    }
}
