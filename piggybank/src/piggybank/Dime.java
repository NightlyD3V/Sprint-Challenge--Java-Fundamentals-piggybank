package piggybank;

public class Dime extends Bank
{
    public Dime(double value, int quantity, String type)
    {
        super(value, quantity, type);
    }

    @Override
    public double getTotal()
    {
        return super.getTotal();
    }

    @Override
    public double addValue(double i)
    {
        return super.addValue(0.10);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
