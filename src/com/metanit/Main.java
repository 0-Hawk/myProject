package com.metanit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //В массиве минимум из 10 чисел найди среднее арифметическое нечетных чисел
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] mas = new int[size];
        int quantity = 0;
        int sum = 0;
        for (int i = 0; i < mas.length + 1; i++){
            if (i % 2 == 1) {
                sum = sum + i;
                quantity = quantity + 1;
            }
        }
        System.out.print(sum / quantity);











        //String[] x = new String[] {"Hello", " ", "world", " ","how", " ", "are", " ", "you", "?"};
        /*for (int i = 0; i < x.length(); i++) {
            System.out.print(x[i]);
        }*/
    }
}
/*Выходная строка: "olleH dlrow, woh era ?uoy"*/
/*System.out.println(x.charAt());*/
/*split()*/
/*!= — не равно*/
/*System.out.println(Arrays.toString(y));*/
//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