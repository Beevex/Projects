
/*This small program was created by Samir Bioud "Beevex" To calculate the Fibonacci sequence*/

package com.company;


public class Main {

    public static void main(String[] args) {
        long current = 1;
        long prior = 1;
        long temp =0;
        long runtime = 0;
        while(runtime<100) {
            //Change the above value to change the amount of numbers printed
            temp = current;
            current += prior;
            prior = temp;
            System.out.println(current);
            runtime+=1;
        }
    }
}
