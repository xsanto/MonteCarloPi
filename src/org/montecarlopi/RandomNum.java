package org.montecarlopi;

import java.util.Random;

public class RandomNum {


    static Random randnum;

    public RandomNum() {
        randnum = new Random();
        randnum.setSeed(123456);
    }

    public static int random(int max,int min){
    	
        return randnum.nextInt((max-min)+1)+min;
    }
}