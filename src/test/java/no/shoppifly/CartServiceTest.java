package no.shoppifly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartServiceTest {

    @Test
    public void shouldRemoveCartAfterCheckout() {

        CartService service = new NaiveCartImpl();
        Cart theCart = Cart.builder().build();
        service.update(theCart);
        assertEquals(1, service.getAllsCarts().size());
        String orderId = service.checkout(theCart);
        assertNotNull(orderId);

        // Jim; This must be wrong, right? Shouldn't the cart be removed after checkout
        assertEquals(100, service.getAllsCarts().size());
    }

}
