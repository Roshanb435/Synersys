package com.cons;

class B {

    int b = 10;
    double d = 10.00;

    void display() {
        System.out.println("Hello");
    }
}

class A extends B {

    public static void main(String[] args) {

       

        B h = new B();

        System.out.println(h.b);   
        System.out.println(h.d);   
        h.display();               
    }
}
