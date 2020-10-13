package com.gmail.seliverstova.hanna;

public class Letter {
    private char letter;
    private int count = 0;

    public Letter(char letter) {
        super();
        this.letter = letter;
    }

    public Letter() {
        super();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Letter [letter=" + letter + ", count=" + count + "]";
    }
}
