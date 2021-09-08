package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        multadd(1.0, 2.0, 3.0);
        double sincon = Math.sin(Math.PI / 4) + ((Math.cos(Math.PI / 4) / 2));
        double log = Math.log(10) + Math.log(20);
        expSum(2.0);
        System.out.println(log);
        System.out.println(sincon);

    }

    public static double multadd(double a, double b, double c) {
        double result = a*b+c;
        System.out.println(result);
        return result;

    }

    public static double expSum(double x) {

        double result = x * Math.exp(-x) + Math.sqrt(1 - (Math.exp(-x)));
        System.out.println(result);
        return result;

    }
}


