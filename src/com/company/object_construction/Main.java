package com.company.object_construction;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        A instance = new A();
        instance.method();

        B instance2 = new C();
        instance2.a();
        instance2.b();
//        instance2.c();

        C c = new C();
        c.a();
    }

    public static List<String> getList() {
        return new LinkedList<>();
    }
}

class A /*extends Object*/ {
    void method() { System.out.println("a"); }
    void a() {
        System.out.println("a.a");
    }
}

class B extends A { //ФИО
    void method() { System.out.println("b"); }
    void b() {}
}

class C extends B {
    void method() { System.out.println("c");  }
    void c() {}
    void a() {
        System.out.println("c.a");
    }
}
