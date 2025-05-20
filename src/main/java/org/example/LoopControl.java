package org.example;

/**
 * This class demonstrates proper and improper usage of loops in Java,
 * focusing on Checkstyle rules for variable declaration usage distance,
 * empty blocks, and modified control variables.
 */
public class LoopControl {

    /**
     * Calculates the sum of squares of the first 10 positive integers.
     * Demonstrates proper variable declaration usage distance.
     * @return The sum of squares
     */
    public int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        return sum;
    }

    /**
     * Prints a right-angled triangle made of asterisks.
     * Demonstrates proper handling of empty blocks.
     */
    public void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Demonstrates incorrect modification of loop control variable.
     * This method violates the ModifiedControlVariable rule.
     */
    public void modifyIndexIncorrectly() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Modifying index at: " + i);
                i += 2; // Violation: Modifying control variable inside loop
                System.out.println("New index value: " + i);
            }
        }
    }

    /**
     * Demonstrates incorrect variable usage distance.
     * This method violates the VariableDeclarationUsageDistance rule.
     */
    public void incorrectVariableUsage() {
        int index;
        // Some other code
        System.out.println("Preparing to loop...");
        // Loop starts much later after declaration
        index = 0;
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }

    /**
     * Demonstrates proper handling of empty blocks.
     * This method follows the EmptyBlock rule.
     */
    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            }
            // No empty else block
        }
    }

    /**
     * Demonstrates incorrect modification of control variable.
     * This method violates the ModifiedControlVariable rule.
     */
    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3; // Violation: Modifying control variable inside loop
                System.out.println("to " + m);
            }
        }
    }
}
