package com.company;

import java.util.Scanner;

public class Main {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n;i++){
            ar[i] = in.nextInt();
        }
        System.out.print("\n");
        insertionSort(ar);
        for (int j : ar) {
            System.out.print(j + "  ");
        }
    }
}
