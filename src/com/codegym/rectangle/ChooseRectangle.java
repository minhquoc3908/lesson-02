package com.codegym.rectangle;

import java.util.Scanner;

public class ChooseRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle(the corner is square at 4 different angles :top left,top-right,botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            int rectangle = scanner.nextInt();
            switch (rectangle){
                case 1:
                    for(int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++)      {
                            System.out.print("*");
                        }
                            System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 6; i++){
                        for(int j = 1; j < i; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 6; i >= 1 ;i--){
                        for (int j = 1; j <= i ;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                default:
                    System.out.println("Exit");
            }
        }
    }


