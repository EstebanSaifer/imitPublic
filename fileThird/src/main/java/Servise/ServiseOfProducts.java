package Servise;

import Product.Product;
import Product.СonsignmentOfProduct;
import Product.NettoBrutto;
import Filter.Filter;
import Product.ProductException;

public class ServiseOfProducts {

//Метод countByFilter, который получает на вход партию товара и произвольный фильтр
// из п.2. Метод возвращает количество элементов партии, имена которых удовлетворяют
// фильтру. Для товаров-наборов анализируется только название самого набора.

    public static int countByFilter(СonsignmentOfProduct consignmentOfProduct, Filter filter) {
        int count = 0;
        Product product;
        for (NettoBrutto nb : consignmentOfProduct.getNettoBrutto()) {
            product = (Product) nb;

            if (filter.apply((product.getName()))) {
                count++;
            }
        }
        return count;
    }
}