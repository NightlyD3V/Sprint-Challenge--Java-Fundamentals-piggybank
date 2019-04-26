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
        myBank.add(new Quarter(0.25, 1, "Quarter"));
        myBank.add(new Dime(0.10, 1,"Dime"));
        myBank.add(new Dollar(1,5,"dollar"));
        myBank.add(new Nickel(0.05,3,"Dime"));
        myBank.add(new Dime(0.10, 7,"Dime"));
        myBank.add(new Dollar(1,1,"dollar"));
        myBank.add(new Penny(0.01, 10, "Penny"));

        myBank.forEach((m) -> System.out.println(m));
        double sum = 0;
        for(int i=0; i<myBank.size(); i++)
        {
            sum += myBank.get(i).getTotal();
        }
        System.out.println("your piggy bank holds " + fp.format(sum));
    }
}
