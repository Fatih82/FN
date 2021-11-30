import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerDasGroßeFinale {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wie groß ist x?");
        double x = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Wie groß ist y");
        double y = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Folgende Rechenoperationen stehen zur Auswahl:");
            System.out.println("[+] für Addition");
            System.out.println("[-] Für Subtraktion");
            System.out.println("[*] für Multiplikation");
            System.out.println("[/] für Division");
            System.out.println("[p] für Potenzieren");
            System.out.println("[w] für Wurzelziehen");
            System.out.println("Deine Auswahl:");

            String auswahl = bufferedReader.readLine();
            if (auswahl.equalsIgnoreCase("+")) {
                double summe = x + y;
                System.out.println("Die Summe ist" + summe);
            } else if (auswahl.equalsIgnoreCase("-")) {
                double differenz = x - y;
                System.out.println("Die Diffenz ist" + differenz);
            }else if (auswahl.equalsIgnoreCase("*")) {
                double Produkt = x * y;
                System.out.println("Das Produkt ist" + Produkt);
            }else if (auswahl.equalsIgnoreCase("/")) {
                double Quotient = x / y;
                System.out.println("Die Qoutient ist" + Quotient);
            }else if (auswahl.equalsIgnoreCase("p")){
                double Potenz= Math.pow(x,y);
            }
    }
}
