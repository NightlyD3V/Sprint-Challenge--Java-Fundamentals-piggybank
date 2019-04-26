package piggybank;

public class Quarter extends Bank
{
    public Quarter(double value, int quantity, String type)
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
        return super.addValue(0.25);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
