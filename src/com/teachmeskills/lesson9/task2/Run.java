package com.teachmeskills.lesson9.task2;

import com.teachmeskills.lesson9.task2.service.MatrixService;

public class Run {

    public static void main(String[] args) {
        MatrixService matrixService = new MatrixService();

        int[][] arr1 = new int[][]{
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] arr2 = new int[][]{
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };
        int[][] arr3 = matrixService.ModifiedArray(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                arr3[i][j] = matrixService.matrixMultiplication(i, j, arr1, arr2);
            }
        }
        matrixService.DisplayMatrix(arr1);
        matrixService.DisplayMatrix(arr2);
        matrixService.DisplayMatrix(arr3);
    }
}
