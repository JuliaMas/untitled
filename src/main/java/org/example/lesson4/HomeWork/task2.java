package org.example.lesson4.HomeWork;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        String s = new String("[(]");
        System.out.println("isValey(s) = " + isValey(s));
    }
    private static boolean isValey(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stk.push(c);
            } else if (stk.isEmpty() || !match(stk.pop(), c)) {
                return false;
            }
        }
        return stk.isEmpty();
    }
    private static boolean match(char l, char r) {
        return (l == '(' && r == ')') || (l == '{' && r == '}') || (l == '[' && r == ']');
    }
}
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.