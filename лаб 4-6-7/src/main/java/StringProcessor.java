
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NumberProccess {

    public String readInputText() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String:");
        return br.readLine();
    }

    public String processText(String inputText) {

        inputText = inputText.replaceAll("\\)|\\(", "");
        inputText = inputText.replaceAll("[\\+]*[38]*[\\s]*[097][\\s]*[0-9]{9}", "phone");
        return inputText;
    }

    public void showResults(String resultText) {
        System.out.println(resultText);
    }
}