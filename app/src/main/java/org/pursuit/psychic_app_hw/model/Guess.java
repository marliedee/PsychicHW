package org.pursuit.psychic_app_hw.model;

public class Guess {

    private int right;
    private int wrong;

    public Guess(int right, int wrong) {
        this.right = right;
        this.wrong = wrong;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }
}
