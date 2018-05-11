package hangmanTest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import hangman.ConsoleDataReader;
import hangman.Hangman;

public class HangmanTest {
	
	@Test
	public void test_correctWord() throws IOException {
		MockDataReader mockDataReader = new MockDataReader("hello world");
		Hangman hangman = new Hangman(mockDataReader);
		hangman.playHangman("hello world");
		String actualFirstLetter = "h";
		assertEquals(hangman.letters.get(0).toString(), actualFirstLetter);
	}
	
	@Test
	public void test_wrongWord() throws IOException {
		MockDataReader mockDataReader = new MockDataReader("hello world");
		Hangman hangman = new Hangman(mockDataReader);
		hangman.playHangman("kumanovo");
		assertEquals(hangman.getLifes(), 0);
	}

	@Test
	public void test_reader() throws IOException {
		ConsoleDataReader consoleReader = new ConsoleDataReader();
		Character actual = consoleReader.read(new ByteArrayInputStream("hello world".getBytes()));
		assertEquals("h", actual.toString());
	}

}
