package com.mentoring.operator;

class LogicalOperator {

/*
    && 	Logical and	Returns true if both statements are true  (x > a && y > b);
    || 	Logical or	Returns true if one of the statements is true	(x > a || y > b)
    !	Logical not	Reverse the result, returns false if the result is true	!(x > a && y > b)
*/

    boolean logicalAnd(int x, int a, int y, int b) {
        return x > a && y > b;
    }

    boolean logicalOr(int x, int a, int y, int b) {
        return x > a && y > b;
    }

    boolean logicalNot(int x, int a, int y, int b)   {
        return !(x > a && y > b);
    }
}
