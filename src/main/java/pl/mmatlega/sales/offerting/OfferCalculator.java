package pl.mmatlega.sales.offerting;

import pl.mmatlega.sales.cart.Cart;

import java.math.BigDecimal;

public class OfferCalculator {
    public Offer calculateOffer(Cart cart) {
        BigDecimal total = cart.getItems()
                .stream()
                .map(cartItem -> cartItem.getPrice().multiply(BigDecimal.valueOf(cartItem.getQuantity())))
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);

        return Offer.of(total, cart.itemsCount());
    }
}
