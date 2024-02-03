package com.teachmeskills.lesson9.task2;

import static com.teachmeskills.lesson9.task2.fabric.LenghtArrFabric.ModifiedArray;
import static com.teachmeskills.lesson9.task2.fabric.MatrixFabric.matrixMultiplication;
import static com.teachmeskills.lesson9.task2.fabric.UtilsFabric.DisplayMatrix;

public class Run {

    public static void main(String[] args) {

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
        int[][] arr3 = ModifiedArray(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                arr3[i][j] = matrixMultiplication(i, j, arr1, arr2);
            }
        }
        DisplayMatrix(arr1);
        DisplayMatrix(arr2);
        DisplayMatrix(arr3);
    }
}
