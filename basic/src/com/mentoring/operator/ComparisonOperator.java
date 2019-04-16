package com.mentoring.operator;

class ComparisonOperator {

/*
    ==	Equal to	x == y
    !=	Not equal	x != y
    >	Greater than	x > y
    <	Less than	x < y
    >=	Greater than or equal to	x >= y
    <=	Less than or equal to	x <= y
*/

    boolean equality(int x, int y) {
        return x == y;
    }

    boolean inequality(int x, int y) {
        return x != y;
    }

    boolean greater(int x, int y) {
        return x > y;
    }

    boolean less(int x, int y) {
        return x < y;
    }

    boolean greaterAndEqual(int x, int y) {
        return x >= y;
    }

    boolean lessAndEqual(int x, int y) {
        return x <= y;
    }
}
