package com.gmail.seliverstova.hanna;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        List<Letter> list = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c+=1) {
            list.add(new Letter(c));
        }
        File file = new File("test_letters.txt");
        LetterReader lr = new LetterReader();
        String text = "";
        try {
            text = lr.readText(file);
        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
        for (Letter letter : list) {
            letter.setCount(lr.countLetter(letter.getLetter(), text));
        }
        list.sort(new LetterCountComparator());
        System.out.println(list);
    }
}
