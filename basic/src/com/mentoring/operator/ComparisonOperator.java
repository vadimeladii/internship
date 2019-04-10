package com.mentoring.operator;

public class ComparisonOperator {

/*
    ==	Equal to	x == y
    !=	Not equal	x != y
    >	Greater than	x > y
    <	Less than	x < y
    >=	Greater than or equal to	x >= y
    <=	Less than or equal to	x <= y
*/

    public boolean equality(int x, int y) {
        return x == y;
    }

    public boolean inequality(int x, int y) {
        return x != y;
    }

    public boolean greater(int x, int y) {
        return x > y;
    }

    public boolean less(int x, int y) {
        return x < y;
    }

    public boolean greaterAndEqual(int x, int y) {
        return x >= y;
    }

    public boolean lessAndEqual(int x, int y) {
        return x <= y;
    }
}
