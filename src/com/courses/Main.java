package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        System.out.println("Сейчас мы проверим как вы знаете историю Одессы!");
        System.out.println("В каком году была основана одесса? Введите только год - ");
        year = in.nextInt();
        if ( year == 1794){
            System.out.println("Поздравляем! Вы достаточно хорошо знаете историю города!");
        }
        else
            System.out.println("Советую вам ещё немного поучить историю Одессы, так как она была основана в 1794 году!");
    }
}
