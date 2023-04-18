package br.edu.univas;

public class Exercicio06 {
    public static void main(String[] args) {
        String text = "Texto que será invertido";

        text = invertText(text);

        System.out.println(text);
    }

    public static String invertText(String text) {
        String invertedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            invertedText += text.charAt(i);
        }
        return invertedText;
    }
}
