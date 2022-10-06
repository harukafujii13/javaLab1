import java.text.NumberFormat;

public class Exersise2 {
    public static void main(String[] args){
    long doublePayment = 324;
    NumberFormat n = NumberFormat.getCurrencyInstance(Local.US);
    String s = n.format(doublePayment);
    System.out.println(s);
    }
}
