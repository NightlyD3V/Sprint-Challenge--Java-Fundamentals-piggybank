package piggybank;

public abstract class Bank
{
    private double value;
    private int quantity;
    private String type;
    public Bank(double value, int quantity, String type)
    {
        this.value = value;
        this.quantity = quantity;
        this.type = type;
    }

    public double getTotal()
    {
        return value * quantity;
    }

    public double addValue(double i)
    {
        return value + i;
    }

    @Override
    public String toString()
    {
        return quantity + " " + type;
    }
}
