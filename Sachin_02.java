package com.company;
import java.util.Scanner;
public class Sachin_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in English out of 100 : ");
        float sub1 = sc.nextInt();
        System.out.println("Enter the marks in Physics out of 100 : ");
        float sub2 = sc.nextInt();
        System.out.println("Enter the marks in Chemistry out of 100 : ");
        float sub3 = sc.nextInt();
        System.out.println("Enter the marks in Mathematics out of 100 : ");
        float sub4 = sc.nextInt();
        System.out.println("Enter the marks in Computer Science out of 100 : ");
        float sub5 = sc.nextInt();
        float percentage = (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("The total percentage of student is : " + percentage +"%");


    }
}
/*System.out.println("taking input from user :");
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a number : ");
         int a = sc.nextInt();
         System.out.println("enter another number : ");
         int b = sc.nextInt();
         int sum = a+b;
         System.out.println("The sum of these two numbers are : ");
         System.out.println(sum); */
