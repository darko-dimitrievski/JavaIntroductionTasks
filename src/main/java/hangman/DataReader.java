package hangman;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * @author darko.dimitrievski
 *
 */
public class DataReader implements Reader {

    public static List<Character> letters = new ArrayList<Character>();

    public String      wordToGuess;
    public InputStream input;

    public DataReader(final String wordToGuess, final InputStream input) throws IOException {
        this.wordToGuess = wordToGuess;
        this.input = input;
        guessTheWord(wordToGuess, input);
    }

    /**
     * Guess the hidden word
     *
     * @param wordToGuess
     * @param input
     *
     */
    public void guessTheWord(final String wordToGuess, final InputStream input) throws IOException {
        char[] filterdWord = new char[wordToGuess.length()];
        for (int i = 0; i < filterdWord.length; i++) {
            if (Character.isLetter(wordToGuess.charAt(i))) {
                filterdWord[i] = '-';
                if (wordToGuess.charAt(i) == ' ') {
                    filterdWord[i] = ' ';
                }
            }
        }

        System.out.println("Guess the hidden word:");

        for (int i = 0; i < filterdWord.length; i++) {
            System.out.print(filterdWord[i] + "");

        }
        System.out.println();
        char data = (char) input.read();
        boolean isWordGuessed = false;
        while (!isWordGuessed && (data != -1)) {
            char guessedLetter = data;
            if (wordToGuess.contains(guessedLetter + "")) {
                for (int letterCounter = 0; letterCounter < wordToGuess.length(); letterCounter++) {
                    if (wordToGuess.charAt(letterCounter) == guessedLetter) {
                        filterdWord[letterCounter] = guessedLetter;
                        DataReader.letters.add(guessedLetter);
                    }
                }
            }

            data = (char) input.read();

            if (DataReader.letters.size() >= (filterdWord.length - 1)) {
                isWordGuessed = true;
            }

            for (int i = 0; i < filterdWord.length; i++) {
                System.out.print(filterdWord[i]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("WIN");
    }
}
