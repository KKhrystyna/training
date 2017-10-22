public class InvoiceTest
{
    public static void main(String[] args)
    {
        Invoice invoice1 = new Invoice("1234", "law services", 4, 25.60);

        System.out.printf("Invoice № %s%nFor: %s%nQuantity is %d%nPrice per item is: %.2f%nTotal amount is: %f%n",
                invoice1.getName(), invoice1.getDescription(), invoice1.getQuantity(), invoice1.getPricePerItem(), invoice1.getInvoiceAmount());

    }
}
