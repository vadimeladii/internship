package com.mentoring.modifier;

public class MainClass {

/*
    We divide modifiers into two groups:
    Access Modifiers - controls the access level
    Non-Access Modifiers - do not control access level, but provides other functionality
*/

/*
    default	    Visible to the package, the default. No modifiers are needed.
    private	    Visible to the class only.
    protected	Visible to the world.
    public	    Visible to the package and all subclasses.
*/

/*
    final	      The final modifier for finalizing the implementations of classes, methods, and variables.
    static	      The static modifier for creating class methods and variables.
    abstract	  The abstract modifier for creating abstract classes and methods.
    synchronized  The synchronized and volatile modifiers, which are used for threads.
*/

    public static void main(String[] args) {
        Circle circle = new Circle("red");
        circle.radius = 4;
//        circle.PI  don't visible
//        circle.color = "green"; cannot assign a value to final variable

        System.out.println(circle.toString());
    }
}
