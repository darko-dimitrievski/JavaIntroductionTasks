/**
 *
 */
package hangman;

import java.io.IOException;
import java.io.InputStream;


/**
 * TODO: missing javadoc.
 *
 * @author darko.dimitrievski
 */
// TODO: can be package private.
public interface Reader {
    // TODO: public is redundant for interface methods.
    public void guessTheWord(String wordToGuess, InputStream input) throws IOException;
}
