package org.example.tictactoe.strategy.winningstrategy;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Move move);

    void handleUndo(Board board, Move move);
}
