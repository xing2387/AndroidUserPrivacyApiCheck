package com.xing2387.xposedtest;

import android.content.ContentResolver;
import android.util.Log;

import java.util.ArrayList;

public class JavaTest {
    private static final String TAG = "JavaTest";

    public static void ttt(Object... aaa) {
        for (Object a : aaa) {
            if (a instanceof String) {
                System.out.println(a.getClass() + " is String");
            }
            System.out.println(a.getClass());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> pp = new ArrayList<String>() {{
            add("1111");
            add("2222");
        }};
        String[] aaaa = pp.toArray(new String[pp.size()]);
        ttt(aaaa);

        System.out.println(JavaTest.class.getName());
    }
}
