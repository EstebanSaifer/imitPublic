package Product;

import java.util.Arrays;
import java.util.Objects;

public class СonsignmentOfProduct {
    //1.8

    private String description;
    private NettoBrutto[] nettoBrutto;

    public СonsignmentOfProduct(String description, NettoBrutto... nettoBrutto) {
        this.description = description;
        this.nettoBrutto = nettoBrutto;
    }

    public double massOfBruttoOfAllProducts() {
        double brut = 0;
        for (NettoBrutto product : nettoBrutto) {
            brut += product.brutto();
        }
        return brut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NettoBrutto[] getNettoBrutto() {
        return nettoBrutto;
    }

    public void setNettoBrutto(NettoBrutto[] nettoBrutto) {
        this.nettoBrutto = nettoBrutto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        СonsignmentOfProduct that = (СonsignmentOfProduct) o;
        return Objects.equals(description, that.description) && Arrays.equals(nettoBrutto, that.nettoBrutto);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(description);
        result = 31 * result + Arrays.hashCode(nettoBrutto);
        return result;
    }

    @Override
    public String toString() {
        return "Product.СonsignmentOfProduct{" +
                "description='" + description + '\'' +
                ", nettoBrutto=" + Arrays.toString(nettoBrutto) +
                '}';
    }
}
