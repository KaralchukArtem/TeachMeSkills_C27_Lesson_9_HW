package com.teachmeskills.lesson9.task2.fabric;

public class MatrixFabric {
    public static int matrixMultiplication(int i, int j, int[][] arr1, int[][] arr2) {
        int result = 0;
        for (int l = 0; l < 4; l++) {
            result += (arr1[i][l] * arr2[l][j]);
        }
        return result;
    }
}
