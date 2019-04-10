package com.mentoring.operator;

public class LogicalOperator {

/*
    && 	Logical and	Returns true if both statements are true  (x > a && y > b);
    || 	Logical or	Returns true if one of the statements is true	(x > a || y > b)
    !	Logical not	Reverse the result, returns false if the result is true	!(x > a && y > b)
*/

    public boolean logicalAnd(int x, int a, int y, int b) {
        return x > a && y > b;
    }

    public boolean logicalOr(int x, int a, int y, int b) {
        return x > a && y > b;
    }

    public boolean logicalNot(int x, int a, int y, int b)   {
        return !(x > a && y > b);
    }
}
