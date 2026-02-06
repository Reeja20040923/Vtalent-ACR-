package com.vtalent;

public class CountPrime {

        public static void main(String[] args) {
            int[] a = {2, 5, 8, 11, 15};
            int count = 0;

            for (int num : a) {
                if (isPrime(num)) {
                    count++;
                }
            }

            System.out.println("Number of prime numbers in the array: " + count);
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

}
