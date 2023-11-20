package com.codegym.exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
            int number = scanner.nextInt();
            int count = 0;
            int N =2;
           while (count < number){
            if (isPrime(N)){
                System.out.println(N);
            }
            count++;
            N++;
        }
    }
    public static boolean isPrime(int N){
        if (N<2) {
            return false;
        }
        for(int i=2 ;i<=N/2;i++){
            if (N % i==0){
                return false;
            }
        }
        return true ;
    }
}

