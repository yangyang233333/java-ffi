package com.qianyy;

public class Main {
    static {
        System.loadLibrary("hello");
    }

    public native void sayHello(String name);

    public static void main(String[] args) {
        var m = new Main();
        m.sayHello("10086");
    }
}