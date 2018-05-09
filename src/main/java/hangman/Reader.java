/**
 *
 */
package hangman;

import java.io.IOException;
import java.io.InputStream;


/**
 * @author darko.dimitrievski
 *
 */
public interface Reader {
    public void guessTheWord(String wordToGuess, InputStream input) throws IOException;
}
