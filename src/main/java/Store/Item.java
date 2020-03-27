package Store;

public class Item
{
    private final String sku;
    private final String name;
    private final String category;
    private final int priceInCents;

    public Item(String sku, String name, String category, int priceInCents)
    {
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.priceInCents = priceInCents;
    }

    public String recieptString()
    {
        return String.format("%s %s - %s", sku, name, category);
    }
}
