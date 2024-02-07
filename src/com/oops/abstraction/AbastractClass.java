package com.oops.abstraction;

public abstract class AbastractClass implements ParentInterface{
    // abstract partially behave as interface
    /**
     * Essentials/Attributes :
     * condition 1: class level must have abstract keyword
     * condition 2: class can not be instantiated by its constructor
     * condition 3: class can have 0 or n number of abstract methods
     * condition 4: class can have 0 or n number of implemented methods
     * condition 5: in case of interfaces can or can't be responsibility of an abstract class.
     * <p>
     * extra: non abstract classes are called concrete/complete class
     * concrete class: all methods will have body.
     *
     * =======================
     * Method signature :
     *  access modifier : public, private , protected
     *  return type : primitives or Objects
     *  method name:
     *  argument list
     *  =======================
     *  Method body:
     *  after method signature we define method body inside : {} : braces.
     *  ========================
     *  Method with body : called concrete methods
     *  ========================
     *  Method without body : abstract method
     */

    // Question 1: Can an abstract class have implemented method without any abstract method?
    // Ans: Yes

    /**
     * Sum is a Concrete method
     * @param i1
     * @param i2
     * @return
     */
    public int sum(int i1, int i2) {
        return i1 + i2;
    }

    /**
     * mul is abstract method
     * @param i1
     * @param i2
     * @return
     */
    public abstract int mul(int i1, int i2);


    public static void main(String[] args) {
        // new AbastractClass();
    }
}
