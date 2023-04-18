package br.edu.univas;
import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        String phrase = "String com palavras aleatórias";
        String word = "";

        Random random = new Random();

        if ((random.nextInt(1 + 10) + 1) >= 5) {
            word = "palavras";
        } else {
            word = "Pneumoultramicroscopicossilicovulcanoconiótico";
        }

        if (phraseContainsWord(phrase, word)) {
            System.out.println("A frase '" + phrase + "' contém a palavra '" + word + "'!");
        } else {
            System.out.println("A frase '" + phrase + "' não contém a palavra '" + word + "'!");
        }
    }

    public static boolean phraseContainsWord(String phrase, String word) {
        String[] separatedWords = phrase.split(" ");
        boolean contains = false;

        for (String separatedWord : separatedWords) {
            if (word.equals(separatedWord)) {
                contains = true;
                break;
            }
        }

        return contains;
    }
}
