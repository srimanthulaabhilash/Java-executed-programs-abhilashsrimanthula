package com.StaticandInstanceControlFlow;
class Example {
    int instanceVar = 10;  // Instance variable
    static int staticVar = 20;  // Static variable

    public void increment() {
        instanceVar++;
        staticVar++;
    }
}

public class Test {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        obj1.increment();  // Changes obj1's instanceVar and increments staticVar

        System.out.println("Object 1 - InstanceVar: " + obj1.instanceVar); // 11
        System.out.println("Object 1 - StaticVar: " + obj1.staticVar); // 21

        obj2.increment();  // Changes obj2's instanceVar and increments staticVar

        System.out.println("Object 2 - InstanceVar: " + obj2.instanceVar); // 11 (separate copy)
        System.out.println("Object 2 - StaticVar: " + obj2.staticVar); // 22 (shared)
    }
}
