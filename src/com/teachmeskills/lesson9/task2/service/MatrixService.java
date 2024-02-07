package com.teachmeskills.lesson9.task2.service;

public class MatrixService {
    public int matrixMultiplication(int i, int j, int[][] arr1, int[][] arr2) {
        int result = 0;
        for (int l = 0; l < 4; l++) {
            result += (arr1[i][l] * arr2[l][j]);
        }
        return result;
    }
    public void DisplayMatrix(int[][] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int[][] ModifiedArray(int[][] arr1, int[][] arr2) {
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
