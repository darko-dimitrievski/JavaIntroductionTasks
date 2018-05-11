package hangmanTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import hangman.Reader;

/**
 * Implementation of the reader for the unit tests where the letters are mocked for reading
 *
 * @author darko.dimitrievski
 */
public class MockDataReader implements Reader{

	public static List<String> letters = new ArrayList<String>();
	private String wordToGuess;
	
	public MockDataReader (String wordToGuess) {
		this.wordToGuess = wordToGuess;
		letters.add(wordToGuess);
	}
	
	public Character read(InputStream stream) throws IOException {
		return wordToGuess.charAt(0);
	}

}
