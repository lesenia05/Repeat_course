import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import static org.junit.Assert.*;

public class StringProcessorTest {

    @Test
    public void processText() throws IOException {
        StringProcessor processor = new StringProcessor();

        // first test
        assertEquals(processor.processText("0971111111"), "phone");
        // second test
        assertEquals(processor.processText(" номери мобільних операторів"), " номери мобільних операторів");
        // third test
        assertEquals(processor.processText(".Знайти всі телефонні номери"), " знайти");


        FileWriter nFile = new FileWriter("fileWriter.txt");

        nFile.write(processor.processText("Знайти всі телефонні номери", "телефонні номери"));

        nFile.close();
    }
}