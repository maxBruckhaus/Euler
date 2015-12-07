package com.company;

public class Euler3 {

//    The isPrime factors of 13195 are 5, 7, 13 and 29.
//    What is the largest isPrime factor of the number 600851475143?

    public static void main(String[] args) {
        System.out.println("The largest prime factor of that number is " +
                Euler3.largestPrimeFactor(600851475143L));
    }

    public static long largestPrimeFactor(long number) {
        // Find first divisor
        // Check if divisor is prime
        // Keep track of largest prime
        // Divide number by divisor

        long largestPrime = 0;
        long i = 2;
        while (i <= number) {
            if (number % i == 0) {
                if (Prime.isPrime(i)){
                    if (i > largestPrime){
                        largestPrime = i;
                    }
                }
                number /= i;
                i = 2;
            }
            i++;
        }
        return largestPrime;
    }
}