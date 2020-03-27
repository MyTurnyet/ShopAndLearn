package Store;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ItemTests
{
    @Test
    public void should_HaveSKU_Name_Category_Price()
    {
        //assign
        int priceInCents = 150;
        String category = "Category";
        String name = "Name";
        String sku = "SKU";
        Item item = new Item(sku, name, category, priceInCents);

        //act
        String recieptOutput = item.recieptString();
        //assert
        assertThat(recieptOutput).isEqualTo("SKU Name - Category");
    }

    @Test
    public void should_HaveCorrect_SKU_Name_Category_Price()
    {
        //assign
        int priceInCents = 150;
        String category = "Food";
        String name = "Slime";
        String sku = "FS1234";
        Item item = new Item(sku, name, category, priceInCents);

        //act
        String recieptOutput = item.recieptString();
        //assert
        assertThat(recieptOutput).isEqualTo("FS1234 Slime - Food");
    }

}
