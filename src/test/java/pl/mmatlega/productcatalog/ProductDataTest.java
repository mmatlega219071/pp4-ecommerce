package pl.mmatlega.productcatalog;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductDataTest {
    @Test
    void itAssignsImageUrlProperly() {
        ProductData productData = new ProductData();
        assertEquals(null, productData.getImageUrl());
        String imgUrl = "https://picsum.photos/seed/picsum/200/300";
        productData.assignImage(imgUrl);
        assertEquals(imgUrl, productData.getImageUrl());
    }

    @Test
    void itChangesPriceProperly() {
        ProductData productData = new ProductData();
        assertEquals(null, productData.getPrice());
        BigDecimal price = new BigDecimal(100.50);
        productData.changePrice(price);
        assertEquals(price, productData.getPrice());
    }
}