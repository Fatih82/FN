import java.io.IOException;

public class TestIO {
    public static void main(String[] args) throws IOException {
        System.out.print("geben sie ein text ein");
        String text = IO.readstring();
        System.out.print("es wurde erfasst: "+ text);
        System.out.print("geben sie ein text ein ");
        int  zahl = IO.readInteger();
        System.out.print("es wurde erfasst: "+ zahl);
    }

}
