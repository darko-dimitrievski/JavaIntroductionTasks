package hangman;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


/**
 * Implementation of the reader to read the letters from the console
 *
 * @author darko.dimitrievski
 */
public class ConsoleDataReader implements Reader {

    public Character read(InputStream inputStream) throws IOException {
        System.out.println("Please enter your letter");
        System.setIn(inputStream);
        Scanner scanner = new Scanner(inputStream);
        return scanner.next().charAt(0);
    }

}
