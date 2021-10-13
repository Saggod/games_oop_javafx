package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board[row].length; cell++) {
                if (monoHorizontal(board, row) || monoVertical(board, cell)) {
                    rsl = true;
                    break;
                }
            }
        }

        return rsl;
    }


    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

}
