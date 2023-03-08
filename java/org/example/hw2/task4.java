package org.example.hw2;

import java.util.HashSet;
import java.util.Set;

/**
 * (*) Отвалидировать доску судоку
 */
public class task4 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("Validete:" + isValidSudoku(board));
    }

    /**
     *
     * @param board Судоку
     * @return Валидна или нет
     */
    private static boolean isValidSudoku(char[][] board) {
        boolean flag = true;
        Set set = new HashSet();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!set.add(board[i][j]) && board[i][j] != '.') {
                    flag = false;
                }
                if (!set.add(board[j][i]) && board[i][j] != '.' && j != i) {
                    flag = false;
                }
                set.clear();
            }
        }
        for (int countI = 0; countI < 9; countI+=3) {
            for (int countJ = 0; countJ < 9; countJ+=3) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (!set.add(board[i + countI][j + countJ]) && board[i + countI][j + countJ] != '.') {
                            flag = false;
                        }
                    }
                }
                set.clear();
            }
        }
        return flag;
    }
}



