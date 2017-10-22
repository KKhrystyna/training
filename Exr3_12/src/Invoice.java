public class Invoice
{
    private String name;
    private String description;
    private int quantity;
    private double pricePerItem;


    public Invoice(String name, String description, int quantity, double pricePerItem)
    {
        this.name = name;
        this.description = description;
        if (quantity < 0)
            this.quantity = 0;
        if (quantity > 0)
            this.quantity = quantity;
        if (pricePerItem < 0.0)
            this.pricePerItem = 0.0;
        if (pricePerItem > 0.0)
            this.pricePerItem = pricePerItem;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem)
    {
        this.pricePerItem = pricePerItem;
    }

    public double getPricePerItem()
    {
        return pricePerItem;
    }

    public double getInvoiceAmount()
    {
        return quantity * pricePerItem;
    }
}
