package piggybank;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        // random new information
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        ArrayList<Bank> myBank = new ArrayList<>();
        Dollar dollar = new Dollar(1.00, 1, 1, "Dollar");

        myBank.add(dollar);

        myBank.forEach((m) -> System.out.println(m));
        double sum = 0;
        for(int i=0; i<myBank.size(); i++)
        {
            sum += myBank.get(i).getTotal();
        }
        System.out.println("your total is " + fp.format(sum));
    }
}
