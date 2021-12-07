import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerDasGroßeFinale {
    public static void main(String[] args) throws IOException {
        String text;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        do {
            private static void SchreibeMenue () {
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
                    System.out.println("gib x ein");
                    System.out.println("gib y ein");
                    double x = Double.parseDouble(bufferedReader.readLine());
                    double y = Double.parseDouble(bufferedReader.readLine());
                    double summe = x + y;
                    System.out.println("Die Summe ist" + summe);
                } else if (auswahl.equalsIgnoreCase("-")) {
                    System.out.println("gib y ein");
                    System.out.println("gib x ein");
                    double x = Double.parseDouble(bufferedReader.readLine());
                    double y = Double.parseDouble(bufferedReader.readLine());
                    double differenz = x - y;
                    System.out.println("Die Diffenz ist" + differenz);
                } else if (auswahl.equalsIgnoreCase("*")) {
                    System.out.println("gib x ein");
                    System.out.println("gib y ein");
                    double x = Double.parseDouble(bufferedReader.readLine());
                    double y = Double.parseDouble(bufferedReader.readLine());
                    double Produkt = x * y;
                    System.out.println("Das Produkt ist" + Produkt);
                } else if (auswahl.equalsIgnoreCase("/")) {
                    System.out.println("gib x ein");
                    System.out.println("gib y ein");
                    double x = Double.parseDouble(bufferedReader.readLine());
                    double y = Double.parseDouble(bufferedReader.readLine());
                    double Quotient = x / y;
                    System.out.println("Die Qoutient ist" + Quotient);
                } else if (auswahl.equalsIgnoreCase("p")) {
                    System.out.println("gib x ein");
                    System.out.println("gib y ein");
                    double x = Double.parseDouble(bufferedReader.readLine());
                    double y = Double.parseDouble(bufferedReader.readLine());
                    double Potenz = Math.pow(x, y);
                    System.out.println("Die Potenz ist" + Potenz);
                } else if (auswahl.equalsIgnoreCase("w")) {
                    System.out.println("gib x ein ");
                    double x = Double.parseDouble(bufferedReader.readLine());
                    double Wurzel = Math.sqrt(x);
                    System.out.println("Die WUrzel Ist" + Wurzel);
                }
                System.out.println("Soll das Programm Wiederholt weden [J]");
                text = bufferedReader.readLine();
            }while (text.equalsIgnoreCase("J")) ;
        }
    }
}
