package com.gmail.seliverstova.hanna;

import java.util.Comparator;

public class LetterCountComparator implements Comparator<Letter> {
    public LetterCountComparator() {
        super();
    }

    @Override
    public int compare(Letter o1, Letter o2) {
        return o2.getCount() - o1.getCount();
    }
}
