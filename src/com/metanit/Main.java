package com.metanit;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //В массиве минимум из 10 чисел найди среднее арифметическое нечетных чисел
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = input.nextInt();
        int[] mas = new int[size];
        System.out.println("Введите символы");
        for (int i = 0; i < size; i++) {
            mas[i] = input.nextInt();
        }
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