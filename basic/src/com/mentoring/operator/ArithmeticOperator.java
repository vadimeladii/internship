package com.mentoring.operator;

public class ArithmeticOperator {

/*
    +	Addition	Adds together two values	x + y
    -	Subtraction	Subtracts one value from another	x - y
    *	Multiplication	Multiplies two values	x * y
    /	Division	Divides one value from another	x / y
    %	Modulus	Returns the division remainder	x % y
    ++	Increment	Increases the value of a variable by 1	++x
    --	Decrement	Decreases the value of a variable by 1	--x
*/

    public int addition(int x, int y) {
        return x + y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public int division(int x, int y) {
        return x / y;
    }

    public int modulus(int x, int y) {
        return x % y;
    }

    public int increment(int x) {
        return ++x;
    }

    public int decrement(int x) {
        return --x;
    }
}
