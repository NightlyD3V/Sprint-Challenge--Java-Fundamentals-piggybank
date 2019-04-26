package piggybank;

public class Nickel extends Bank
{
    public Nickel(double value, int quantity, String type)
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
        return super.addValue(0.05);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
