package com.sneha.java;
class Parent3{
    int a = 10;
    int b = 20;
}
// "super and this" keyword is used 
//bcz their is conflict btw parent instance & local variable ; 
public class This5 extends Parent3 {

    int a = 5;
    int b = 6;

    void add(int a, int b) {
        System.out.println(a + b);
        System.out.println(this.a + this.b);
        System.out.println(super.a + super.b);
    }

    public static void main(String[] args) {
        This5 ff = new This5();
        ff.add(2, 3);
    }
}
