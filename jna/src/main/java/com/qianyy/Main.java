package com.qianyy;

import com.sun.jna.Native;
import com.sun.jna.Library;
import com.sun.jna.Platform;

import java.util.ArrayList;
import java.util.List;

interface JNATest extends Library {
    public static JNATest jt = Native.load("jna/libhello.so", JNATest.class);

    void sayHello(String name);
}

public class Main {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current working directory is: " + currentDir);
        JNATest.jt.sayHello("10086");
    }
}