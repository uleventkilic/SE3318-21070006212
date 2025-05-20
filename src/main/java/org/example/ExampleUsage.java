package org.example;

/**
 * This class demonstrates practical usage of loops for data manipulation
 * while adhering to Checkstyle rules.
 */
public class ExampleUsage {

    /**
     * Filters and counts even numbers in an array of integers from 1 to 20.
     * Uses a foreach loop and adheres to Checkstyle rules.
     * @return The count of even numbers
     */
    public int filterAndCountEvenNumbers() {
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = i + 1;
        }

        int evenCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
                System.out.println("Even number found: " + number);
            }
        }
        return evenCount;
    }

    /**
     * Calculates the sum of diagonal elements in a 3x3 matrix.
     * Demonstrates proper loop variable usage and scope.
     * @return The sum of diagonal elements
     */
    public int matrixDiagonalSum() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    /**
     * Displays even numbers from an array.
     * Demonstrates proper loop usage.
     */
    public void displayEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
        }
    }

    /**
     * Sums an array of integers demonstrating proper variable scope.
     * @return The sum of array elements
     */
    public int sumArray() {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum);
        return sum;
    }

    /**
     * Processes a matrix using nested loops.
     * Demonstrates proper loop variable usage.
     */
    public void processMatrix() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] is " + matrix[i][j]);
            }
        }
    }
}
