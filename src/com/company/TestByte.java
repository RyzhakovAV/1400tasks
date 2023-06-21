package com.company;

import java.util.Random;
public class TestByte {
    static public void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 4};
        double array[] = {3, 5, 8};
        boolean results[] = new boolean[]{true, false, true};
        String cats[] = {"Fluffy", "Spot", "Zeus"};
        int[] scores = {3, 5, 7};

        short numPets = 5;
        //int numGrains = 5.6;
        String name = "Scruffy";
        //numPets.length();
        //numGrains.length();
        name.length();
        

        boolean x = true;
        boolean z = true;
        int y = 20;
        x = (y != 10) ^ (z = false);
        System.out.println(x + ", " + y + ", " + z);

        int number = scores.length;

        for(int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        for(int num : nums) {
            System.out.print(num);
        }


    }
}
