package org.example;

/**
 * Main application class that demonstrates the functionality of LoopControl and ExampleUsage classes.
 */
public class App {
    public static void main(String[] args) {
        LoopControl loopControl = new LoopControl();
        ExampleUsage exampleUsage = new ExampleUsage();

        // Task 1: Sum of squares
        System.out.println("\nTask 1: Sum of squares of first 10 positive integers");
        int sumOfSquares = loopControl.sumOfSquares();
        System.out.println("Sum of squares: " + sumOfSquares);

        // Task 2: Print triangle
        System.out.println("\nTask 2: Printing right-angled triangle");
        loopControl.printTriangle();

        // Task 3: Demonstrate incorrect index modification
        System.out.println("\nTask 3: Demonstrating incorrect index modification");
        loopControl.modifyIndexIncorrectly();

        // Task 4: Filter and count even numbers
        System.out.println("\nTask 4: Filtering and counting even numbers");
        int evenCount = exampleUsage.filterAndCountEvenNumbers();
        System.out.println("Total even numbers found: " + evenCount);

        // Task 5: Matrix diagonal sum
        System.out.println("\nTask 5: Calculating matrix diagonal sum");
        int diagonalSum = exampleUsage.matrixDiagonalSum();
        System.out.println("Sum of diagonal elements: " + diagonalSum);

        // Additional demonstrations
        System.out.println("\nAdditional Demonstrations:");
        
        // Displaying even numbers
        System.out.println("\nDisplaying even numbers:");
        exampleUsage.displayEvenNumbers();

        // Summing an array
        System.out.println("\nSumming an array:");
        int sum = exampleUsage.sumArray();
        System.out.println("Total Sum: " + sum);

        // Processing a matrix
        System.out.println("\nProcessing a matrix:");
        exampleUsage.processMatrix();
    }
}
