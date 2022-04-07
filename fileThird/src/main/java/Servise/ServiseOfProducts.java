package Servise;

import Product.СonsignmentOfProduct;
import Product.NettoBrutto;
import Filter.Filter;

public class ServiseOfProducts {

    public static int countByFilter(СonsignmentOfProduct consignmentOfProduct, Filter filter) {
        int count = 0;
        for (NettoBrutto nb : consignmentOfProduct.getNettoBrutto()) {
            if (filter.apply((nb.nameOfProduct()))) {
                count++;
            }
        }
        return count;
    }
}