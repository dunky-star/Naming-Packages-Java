package com.dunky.challenge;

/**
 *  Write a small program to read an integer from the keyboard
 *  (using Scanner) and print out the times table for that number.
 *  The table should run from 1 to 12.
 *
 *  You are allowed to use one variable called scanner for your
 *  Scanner instance. You can use as many other variables as you
 *  need, but they must all be called x. That includes any
 *  class instances and loop control variables that you may decide
 *  to use.
 */

public class X {

    private int x;
    public X(int x){
        this.x = x;
    }

    public void x(){
        for (int x = 1; x < 13; x++ ){
            System.out.println(x + "times" + this.x + " equals " + x * this.x);
        }
    }
}
