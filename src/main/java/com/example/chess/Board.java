package com.example.chess;

public class Board {
    private char[][] board;

    public Board() {
        board = new char[8][8];
        initialize();
    }

    private void initialize() {
        // Simple setup: P = Pawn, K = King
        for (int i = 0; i < 8; i++) {
            board[1][i] = 'P';
            board[6][i] = 'P';
        }
        board[0][4] = 'K';
        board[7][4] = 'K';
    }

    public void display() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char piece = board[i][j];
                System.out.print((piece == 0 ? '.' : piece) + " ");
            }
            System.out.println();
        }
    }
}
