package hangman;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * TODO: The idea here was to have ONLY the reading. Now you have all your hangman logic here. Leave only the reading
 * here and extract the play logic in {@link Hangman}. Now your {@link Hangman} class is absolutely redundant.
 * <p>
 * TODO: Mising the target folder in the .gitignore.
 *
 * @author darko.dimitrievski
 */
public class DataReader implements Reader {

    // TODO: can be final.
    public static List<Character> letters = new ArrayList<Character>();

    // TODO: can be private.
    // TODO: can be final.
    public String wordToGuess;
    // TODO: can be private.
    // TODO: can be final.
    public InputStream input;

    public DataReader(final String wordToGuess, final InputStream input) throws IOException {
        this.wordToGuess = wordToGuess;
        this.input = input;
        guessTheWord(wordToGuess, input);
    }

    /**
     * TODO: refactor as described above.
     * <p>
     * Guess the hidden word
     *
     * @param wordToGuess
     * @param input
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
        // TODO: When can data be -1?
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
