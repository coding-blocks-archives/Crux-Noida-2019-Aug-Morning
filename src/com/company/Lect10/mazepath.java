package com.company.Lect10;

import java.util.ArrayList;

public class mazepath {

    public static void main(String[] args) {

    }

    public static int mazecount(int row, int col){

        if(row==1 && col==1){
            return 1;
        }


        int cnt=0;

        if(row>1){
            cnt+= mazecount(row-1,col);
        }

        if(col>1){
            cnt+= mazecount(row,col-1);
        }

        return cnt;
    }
    public static ArrayList mazepath(String processed,int row,int col){

        if(row==1 && col==1){
            ArrayList list = new ArrayList();
            list.add(processed);
            return list;
        }
        ArrayList list = new ArrayList();
        if(row>1){
            list.addAll(mazepath(processed+"V",row-1,col));
        }
        if(col>1){
            list.addAll(mazepath(processed+"H",row,col-1));
        }
        return list;
    }
}
