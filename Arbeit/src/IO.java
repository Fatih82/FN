import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    private static BufferedReader bufferedReader= new BufferedReader(new InputStreamReader());

    public static String readstring() throws IOException {
        String text =bufferedReader.readLine();
        return text;
    }
    public static int readInteger() throws IOException {
        while (true){
            try{
            String eingabe = IO.readstring();
            int zahl= Integer.parseInt(eingabe);
            return zahl;
        } catch (NumberFormatException nfe) {
            System.out.println("keine Gabzzahlen! Bitte erneut erfassen");
        }
    }
}

