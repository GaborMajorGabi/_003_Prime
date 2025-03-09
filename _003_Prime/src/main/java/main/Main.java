package main;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (isPrimeMethod(i)) {
                System.out.print( " -> prime");
            }
            System.out.println();
        }
    }

    private static boolean isPrimeMethod(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/**
 ** Write Java programs to list the first Prim numbers! The IDE project should be named _03_Prim.
 * *
 * * In mathematics, natural numbers that have exactly two divisors - one and
 * * themselves - are called prime numbers.
 * *
 * * Write the numbers from 1 to 100 one below the other, and write next to the number, separated by a space,
 * if it is a prime number!
 */
