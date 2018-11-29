import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException  {

        NumberProccess processor = new NumberProccess();

        String text = processor.readInputText();

        processor.showResults(processor.processText(text));

    }
}
