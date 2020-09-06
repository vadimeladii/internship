package com.mentoring.operator;

class MainClass {

    public static void main(String[] args) {

        ArithmeticOperator arithmeticOperator = new ArithmeticOperator();

        int addition = arithmeticOperator.addition(2, 4);
        int subtraction = arithmeticOperator.subtraction(4, 3);
        int multiplication = arithmeticOperator.multiplication(3, 5);
        int division = arithmeticOperator.division(6, 3);
        int modulus = arithmeticOperator.modulus(7, 3);
        int increment = arithmeticOperator.increment(4);
        int decrement = arithmeticOperator.decrement(4);

        System.out.println("----------------- Arithmetic Operators --------------------------");
        System.out.println("Addition (2 + 4) -> " + addition);
        System.out.println("Subtraction (4 - 3) -> " + subtraction);
        System.out.println("Multiplication (3 * 5) -> " + multiplication);
        System.out.println("Division (6 / 3) -> " + division);
        System.out.println("Modulus (7 % 3) -> " + modulus);
        System.out.println("Increment 4 -> " + increment);
        System.out.println("Decrement 4 -> " + decrement);

        ComparisonOperator comparisonOperator = new ComparisonOperator();

        boolean equality = comparisonOperator.equality(3, 3);
        boolean inequality = comparisonOperator.inequality(5, 8);
        boolean greater = comparisonOperator.greater(7, 2);
        boolean less = comparisonOperator.less(1, 4);
        boolean greaterAndEqual = comparisonOperator.greaterAndEqual(8, 8);
        boolean lessAndEqual = comparisonOperator.lessAndEqual(6, 6);

        System.out.println("----------------- Comparison Operators --------------------------");
        System.out.println("Equal to (3 == 3) -> " + equality);
        System.out.println("Not equal (5 != 8) -> " + inequality);
        System.out.println("Greater than (7 > 2) -> " + greater);
        System.out.println("Less than (1 < 4) -> " + less);
        System.out.println("Greater than or equal to (8 >= 8) -> " + greaterAndEqual);
        System.out.println("Less than or equal to (6 <= 6) -> " + lessAndEqual);

        LogicalOperator logicalOperator = new LogicalOperator();
        boolean logicalAnd = logicalOperator.logicalAnd(5, 3, 8, 6);
        boolean logicalOr = logicalOperator.logicalOr(2, 6, 8, 7);
        boolean logicalNot = logicalOperator.logicalNot(3, 4, 3, 9);

        System.out.println("----------------- Logical Operators --------------------------");
        System.out.println("Logical And (5 > 3 && 8 > 6) -> " + logicalAnd);
        System.out.println("Logical Or (2 > 6 || 8 > 7) -> " + logicalOr);
        System.out.println("Logical Not !(3 > 4 && 3 > 9) -> " + logicalNot);
    }
}
