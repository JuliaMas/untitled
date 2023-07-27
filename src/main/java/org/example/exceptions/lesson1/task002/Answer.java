package org.example.exceptions.lesson1.task002;

import java.util.Arrays;

public class Answer {
    public int[] subArrays(int[] a, int[] b) {
        if(a==null || b==null|| a.length!=b.length){
            return new int[1];
        }
        else{
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] / b[i];
            }
            return c;
        }
    }
}

