package com.ga;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] Array = {2,3,4};

        try{
            System.out.println(Array[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        Main main = new Main();

        try {
            main.withdraw();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public void withdraw() throws Exception {
        int bankBalance = 1000;
        int withdraw  = 2000;

        if(withdraw>bankBalance){
            throw new Exception("You can't withdraw");
        }

    }


}
