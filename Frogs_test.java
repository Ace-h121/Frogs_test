package Java_tests;

import java.util.function.Function;

/*
 * This is your real test as programmers, all of your groups have distinct problems in your code causing it not to properlly function.
 * This project is your orginial FIZZBUZZ challenge here is a reminder on the rules
 * 
 * 
 * 1) If a number is divible by 3 you print fizz
 * 2) If a number id divisible by 5 you print buzz
 * 3) Finally, if it is not divisble by either, you will print the number 
 * 4) ensure the value goes up to the passed in length varible
 */

class Frogs_test{
    public static void main (String[] args){
        fizzBuzz(10);
    }

 public static void fizzBuzz(int length){
    String map = "";
    for (int i = 0; i <=length; i++){
        if (i % 3 == 0){
            map += "fizz";
        }
        if (i % 5 == 0){
            map += "buzz";
        }

        System.out.println(map);
        map = "";
    }
 }
}