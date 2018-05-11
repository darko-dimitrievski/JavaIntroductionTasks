/**
 *
 */
package hangman;

import java.io.IOException;
import java.io.InputStream;


/**
 * Interface for different types of input streams
 * (FileInputStream, BufferedInputStream and the PushbackInputStream among others).
 *
 * @author darko.dimitrievski
 */
public interface Reader {
    public Character read(InputStream stream) throws IOException;
}
