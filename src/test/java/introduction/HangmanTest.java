package introduction;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;

import hangman.DataReader;
import hangman.Hangman;


/**
 * TODO: the tests should follow the packet structure of the classes.
 * <p>
 * TODO: you can write as a javadoc which class you are testing.
 * <p>
 * TODO: for all logic you have only one test per method. What is you coverage? Can you think of what else can be tested?
 *
 * @author darko.dimitrievski
 */
public class HangmanTest {

    @Test
    public void test() throws IOException {

        byte[] data = "h,e,l,o,w,r,d".getBytes();
        InputStream input = new ByteArrayInputStream(data);

        DataReader dataReader = new DataReader("hello world", input);

        // TODO: not used.
        Hangman hangman = new Hangman(dataReader);

        // TODO: you are exposing letters for the sake of the tests this is wrong.
        Assert.assertEquals("h", DataReader.letters.get(0) + "");
        Assert.assertEquals("e", DataReader.letters.get(1) + "");
        Assert.assertEquals("l", DataReader.letters.get(2) + "");
        Assert.assertEquals("l", DataReader.letters.get(3) + "");
        Assert.assertEquals("l", DataReader.letters.get(4) + "");
        Assert.assertEquals("o", DataReader.letters.get(5) + "");
        Assert.assertEquals("o", DataReader.letters.get(6) + "");
        Assert.assertEquals("w", DataReader.letters.get(7) + "");
        Assert.assertEquals("r", DataReader.letters.get(8) + "");
        Assert.assertEquals("d", DataReader.letters.get(9) + "");
    }

}
