package hangman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Hangman game</h1> This is simulation of the Hangman game. The player have
 * to guess one hidden word. The game ends when the player guess the word
 *
 * @author darko.dimitrievski
 */
public class Hangman {

	private Reader reader;
	private int lifes = 5;
	public static List<Character> letters = new ArrayList<Character>();

	public Hangman(final Reader reader) {
		this.reader = reader;
	}
	
	public int getLifes() {
		return lifes;
	}

	public void setLifes(int lifes) {
		this.lifes = lifes;
	}

	/**
	 * Just press play and play the hangman game. 
	 * Main logic is here from hidding the letters from the word
	 * to guessing the word by entering the wanted letters.
	 *
	 * @param wordToGuess
	 *
	 */
	public void playHangman(String wordToGuess) throws IOException {
		boolean isWordGuessed = false;
		char[] filterdWord = new char[wordToGuess.length()];
		
		hideTheLetters(filterdWord, wordToGuess);
		while (!isWordGuessed) {
			Character guessedLetter = reader.read(System.in);
			if (wordToGuess.contains(guessedLetter + "")) {
				for (int letterCounter = 0; letterCounter < wordToGuess.length(); letterCounter++) {
					if (wordToGuess.charAt(letterCounter) == guessedLetter) {
						Hangman.letters.add(guessedLetter);
					}
				}
			} else {
				lifes --;
			}
			
			if (lifes == 0) {
				System.out.println("Sorry you missed the word! You are hanged!");
				break;
			}
			
			if (Hangman.letters.size() >= (wordToGuess.length() - 1)) {
				isWordGuessed = true;
			}
		}
		
		if (isWordGuessed) {
			System.out.println(String.format("Congratulation! You guessed the hidden word! It was %s", wordToGuess));
		}
	}

	/**
	 * Hides the letters of the word that should be guessed
	 *
	 * @param filterdWord
	 * @param wordToGuess
	 */
	public void hideTheLetters(final char[] filterdWord, final String wordToGuess) {
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
	}

}
