package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        // for now, return a random result
        boolean flag = false;

        for(long i = (n-1); i>1; i--){
            if(n%i != 0){
                flag = true;
            }
        }

        if(n == 2){
            flag =  true;
        }
        else if(n == ''){
            flag = false;
        }

        return flag;
        
    }
}
