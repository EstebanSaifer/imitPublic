package Product;

import java.util.Objects;

public class PeaceOfProduct extends Product {
    //1.4
    private double weightOfProduct;

    public PeaceOfProduct(String name, String description, double weightOfProduct) throws ProductException {
        super(name, description);
        if(weightOfProduct < 0) throw new ProductException("Некорректные данные");
        this.weightOfProduct = weightOfProduct;
    }

    public double getWeightOfProduct() {
        return weightOfProduct;
    }

    public void setWeight(double weightOfProduct) {
        this.weightOfProduct = weightOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PeaceOfProduct that = (PeaceOfProduct) o;
        return Double.compare(that.weightOfProduct, weightOfProduct) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weightOfProduct);
    }

    @Override
    public String toString() {
        return "Product.PeaceOfProduct{" +
                "weightOfProduct=" + weightOfProduct +
                '}';
    }
}