package com.azeem.exception;

public class Exception {
	public static void main(String[] args) {

        int d = 0;
        try {

            int a = 42 / d;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());// TODO: handle exception
        }
        System.out.println("Will not be printed");
    }
}
