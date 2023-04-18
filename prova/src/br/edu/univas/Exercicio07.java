package br.edu.univas;

public class Exercicio07 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};

        // Questão pediu verificação
        if (a.length == 2) {
            int det = calcDet(a);
            System.out.println("Determinante: " + det);
        } else {
            System.out.println("A matriz não é de ordem 2");
        }

    }

    public static int calcDet(int[][] mat) {
        int diagPri = 1;
        int diagSec = 1;

        for(int i = 0; i < mat.length; i ++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i == j) {
                    diagPri *= mat[i][j];
                }
                if(i+j == mat.length - 1) {
                    diagSec *= mat[i][j];
                }
            }
        }
        return diagPri - diagSec;
    }
}
