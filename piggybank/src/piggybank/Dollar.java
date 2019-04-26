package piggybank;

public class Dollar extends Bank
{
    public Dollar(double value, int quantity, double total, String type)
    {
        super(value, quantity, total, type);
    }

    @Override
    public double getTotal()
    {
        return super.getTotal();
    }

    @Override
    public double addValue(double i)
    {
        return super.addValue(1.00);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
