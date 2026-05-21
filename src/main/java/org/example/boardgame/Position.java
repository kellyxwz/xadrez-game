package org.example.boardgame;

public class Position {

    private int row;
    private int conlumn;

    public Position(int row, int conlumn) {
        this.row = row;
        this.conlumn = conlumn;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getConlumn() {
        return conlumn;
    }

    public void setConlumn(int conlumn) {
        this.conlumn = conlumn;
    }

    @Override
    public String toString() {
        return row + "," + conlumn;
    }
}
