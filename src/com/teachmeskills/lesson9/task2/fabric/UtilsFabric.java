package com.teachmeskills.lesson9.task2.fabric;

public class UtilsFabric {
    public static void DisplayMatrix(int[][] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
