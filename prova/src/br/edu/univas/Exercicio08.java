package br.edu.univas;

public class Exercicio08 {
    public static void main(String[] args) {
        String[] stringsList = {"Primeira String", "Segunda String", "Terceira String", "Quarta String", "Quinta String"};

        String converted = listToString(stringsList);

        System.out.println(converted);
    }

    public static String listToString(String[] list) {
        String convertedList = "";

        for (String str : list) {
            convertedList += str + ", ";
        }

        return convertedList.substring(0, convertedList.length() - 2);
    }
}
