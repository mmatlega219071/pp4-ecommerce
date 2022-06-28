package pl.mmatlega.productcatalog;

import java.util.List;

public interface ProductStorage {
    void save(ProductData productData);

    ProductData loadById(String productId);

    List<ProductData> allPublishedProducts();
}
