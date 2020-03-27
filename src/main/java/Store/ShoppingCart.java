package Store;

import java.util.ArrayList;

public class ShoppingCart
{

    private ArrayList<Item> items;

    public String receipt()
    {
        return "ShopAndLearn";
    }

    public int subTotal()
    {
        return 0;
    }

    public int taxes()
    {
        return 0;
    }

    public int totalCost()
    {
        return 0;
    }

    public void addItem(Item item)
    {
        items = new ArrayList<>();
        items.add(item);
    }
}
