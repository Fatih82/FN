import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static String readstring() throws IOException {
        String text = bufferedReader.readLine();
        return text;
    }

    public static int readInteger() throws IOException {
        while (true) {
            try {
                String eingabe = IO.readstring();
                int zahl = Integer.parseInt(eingabe);
                return zahl;
            } catch (NumberFormatException nfe) {
                System.out.println("keine Ganzzahlen! Bitte erneut erfassen");
            }
        }


    }
    public static double readDouble() throws IOException {
        while (true) {
            try{
                String eingabe = IO.readstring();
                double zahl = Double.parseDouble(eingabe.replace(',', '.'));
                return zahl;
            }catch (NumberFormatException nfe ) {
                System.out.print("keine Ganzzahlen! Bitte erneut erfassen");
            }
        }
    }
    public static boolean readBoolen() throws IOException {
        while (true) {
            String eingabe= readstring();
            if (eingabe!= null) {
                if (eingabe.equalsIgnoreCase("ja")
                    || (eingabe.equalsIgnoreCase("j"))){
                    return true;
                }
                else if (eingabe.equalsIgnoreCase("nein")
                || (eingabe.equalsIgnoreCase("n"))) {
                return false;
                }
                System.out.println("Ungültige eingabe! Bitte erneut angeben: ");




            }
        }
    }
}



