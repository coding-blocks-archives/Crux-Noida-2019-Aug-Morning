package com.company.Lec26;

public class MazePathDp {


    public static void main(String[] args) {

//        System.out.println(mazepath(3,3));

        long mem[][] =new long[4][4];
//        System.out.println(mazepathDP(3,3,mem));
        System.out.println(mazePathItr(3,3,mem));
    }

    public static int mazepath(int row, int col){

        if(row==1 || col==1){
            return 1;
        }
        return mazepath(row-1,col)+mazepath(row,col-1);
    }

    public static int mazepathDP(int row, int col, Integer mem[][]){

        if(row==1 || col==1){
            return 1;
        }

        if(mem[row][col]!=null){
            return mem[row][col];
        }

        mem[row][col]= mazepathDP(row-1,col,mem)+mazepathDP(row,col-1,mem);

        return mem[row][col];
    }

    public static long mazePathItr(int row, int col, long mem[][]){



        for (int i = 1; i <=row ; i++) {
            for (int j =1; j<=col; j++) {

                if(i==1 || j==1){
                    mem[i][j]=1;
                }

                else{
                    mem[i][j]=mem[i-1][j]+mem[i][j-1];
                }
            }
        }
        return mem[row][col];
    }

}
