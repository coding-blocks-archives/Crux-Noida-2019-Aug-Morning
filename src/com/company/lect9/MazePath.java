package com.company.lect9;

public class MazePath {

    public static void main(String[] args) {
        mazepath("",3,3);
    }

    public static void mazepath(String processed,int row,int col){

        if(row==1 && col==1){
            System.out.println(processed);
            return;
        }

        if(row>1){
            mazepath(processed+"V",row-1,col);
        }
        if(col>1){
            mazepath(processed+"H",row,col-1);
        }
    }
}
