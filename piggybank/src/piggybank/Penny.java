package piggybank;

public class Penny extends Bank
{
    public Penny(double value, int quantity, String type)
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
        return super.addValue(0.01);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
