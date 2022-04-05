package Product;

import java.util.Objects;

public class PackedWeightProduct extends WeightProduct implements NettoBrutto{
    //1.5

    private Packing packing;
    private double weight;

    public PackedWeightProduct (String name, String description, double weight, Packing packing) throws ProductException {
        super(name, description);
        if (weight < 0) throw new ProductException("Некорректные данные");
        this.weight = weight;
        this.packing = packing;
    }

    @Override
    public double netto() {
        return weight;
    }

    @Override
    public double brutto() {
        return weight + packing.getMassOfPacking();
    }

    public Packing getPacking() {
        return packing;
    }

    public void setPacking(Packing packing) {
        this.packing = packing;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackedWeightProduct that = (PackedWeightProduct) o;
        return Double.compare(that.weight, weight) == 0 && Objects.equals(packing, that.packing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), packing, weight);
    }

    @Override
    public String toString() {
        return "Product.PackedWeightProduct{" +
                "packing=" + packing +
                ", weight=" + weight +
                '}';
    }
}