package com.example.chess;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ChessGameTest {

    @Test
    void testBoardInitialization() {
        Board board = new Board();
        assertNotNull(board);
    }
}
