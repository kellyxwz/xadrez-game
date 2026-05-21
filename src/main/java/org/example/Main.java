package org.example;

import org.example.boardgame.Board;
import org.example.chess.ChessMatch;

public class Main {
    static void main() {

        ChessMatch chessMatch =  new ChessMatch();

        UI.printBoard(chessMatch.getPieces());

    }
}
