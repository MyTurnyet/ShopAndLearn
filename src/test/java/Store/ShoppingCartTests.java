package Store;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ShoppingCartTests
{
    @Test
    public void should_ReturnAReceipt()
    {
        //assign
        ShoppingCart cart = new ShoppingCart();
        //act
        String receipt = cart.receipt();
        //assert
        assertThat(receipt).isEqualTo("ShopAndLearn");
    }

    @Test
    public void should_StartWithTotalsAt_Zero()
    {
        //assign
        ShoppingCart shoppingCart = new ShoppingCart();

        //act
        int subtotal = shoppingCart.subTotal();
        int tax = shoppingCart.taxes();
        int total = shoppingCart.totalCost();
        //assert
        assertThat(subtotal).isEqualTo(0);
        assertThat(tax).isEqualTo(0);
        assertThat(total).isEqualTo(0);
    }

    @Test
    public void should_Return_Chocolate_at_1000Cents()
    {
        //assign
        ShoppingCart shoppingCart = new ShoppingCart();
        Item chocolate = new Item("FS123", "Chocolate", "Food", 1000);

        //act
        shoppingCart.addItem(chocolate);

        //assert
        int subtotal = shoppingCart.subTotal();
        int tax = shoppingCart.taxes();
        int total = shoppingCart.totalCost();
        assertThat(subtotal).isEqualTo(1000);
        assertThat(tax).isEqualTo(0);
        assertThat(total).isEqualTo(1000);
    }
}
