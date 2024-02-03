package com.teachmeskills.lesson9.task2.fabric;

public class LenghtArrFabric {
    public static int[][] ModifiedArray(int[][] arr1, int[][] arr2) {
        if (arr1[0].length == arr2.length) {
            int i = arr1.length;
            int j = arr2[0].length;
            System.out.println("Размер матриц совместим для умножения");
            int[][] result = new int[i][j];
            return result;
        } else {
            System.out.println("Размер матриц не совместим для умножения");
            return null;
        }
    }
}
