package com.company.lec22;

import java.util.Arrays;
import java.util.Scanner;

public class SudokuSolver {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int board[][]={{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};

//        for (int i = 0; i <9 ; i++) {
//            for (int j = 0; j <9 ; j++) {
//                board[i][j]=s.nextInt();
//            }
//        }

        sudoku(board,0,0);
    }

    private static void sudoku(int[][] board, int row, int col) {

        if(row==board.length){
            display(board);
            return;
        }

        if(col==board.length){
            sudoku(board,row+1,0);
            return;
        }

        if(board[row][col]==0){
            for (int val = 1; val <=9 ; val++) {

                if(isSafe(board,row,col,val)){
                    board[row][col]=val;
                    sudoku(board,row,col+1);
                    board[row][col]=0;
                }
            }
        }
        else{
            sudoku(board,row,col+1);
        }

    }

    private static boolean isSafe(int[][] board, int row, int col, int val) {

        for (int i = 0; i <board.length ; i++) {

            if(board[i][col]==val){
                return false;
            }
        }

        for (int i = 0; i <board.length ; i++) {
            if(board[row][i]==val){
                return false;
            }
        }

        int rno=row/3;
        int cno=col/3;

        for (int i = 3*rno; i <3*(rno+1) ; i++) {

            for (int j = 3*cno; j <3*(cno+1) ; j++) {

                if(board[i][j]==val){
                    return false;
                }
            }
        }

   return true;
    }

    private static void display(int[][] board) {

        for (int i = 0; i <board.length ; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
}
