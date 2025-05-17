package apack;

public class A {
    int defaultVar = 10;
    protected int protectedVar = 20;
    private int privateVar = 30;
    public int publicVar = 40;

    public A() {
    }

    public void display() {
        System.out.println("Default Variable: " + this.defaultVar);
        System.out.println("Protected Variable: " + this.protectedVar);
        System.out.println("Private Variable: " + this.privateVar);
        System.out.println("Public Variable: " + this.publicVar);
    }
}

package bpack;

import apack.A;

public class B extends A {
    public B() {
    }

    public void display() {
        //System.out.println("Default Variable: " + defaultVar);
        System.out.println("Protected Variable: " + protectedVar);
        //System.out.println("Private Variable: " + privateVar);
        System.out.println("Public Variable: " + publicVar);
    }
}

package cpack;

import apack.A;

public class C {
    public void display() {
        A obj = new A();
        //System.out.println("Default Variable: " + obj.defaultVar);
        //System.out.println("Protected Variable: " + obj.protectedVar);
        //System.out.println("Private Variable: " + obj.privateVar);
        System.out.println("Public Variable: " + obj.publicVar);
    }
}

package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B bObj = new B();
        System.out.println("From Class B:");
        bObj.display();
        C cObj = new C();
        System.out.println("From Class C:");
        cObj.display();
    }
}

//output:
From Class B:
Protected Variable: 20
Public Variable: 40
From Class C:
Public Variable: 40

Process finished with exit code 0
