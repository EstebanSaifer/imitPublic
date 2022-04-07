package Product;

import java.util.Objects;

public class Packing {
    //1.1

    private String name;
    private  double massOfPacking;

    public Packing(String name, double massOfPacking) throws ProductException {
        if(name == null || name == "" || massOfPacking < 0) throw new ProductException("Некорректные параметры");
        this.name = name;
        this.massOfPacking = massOfPacking;
    }

    public String getName1() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMassOfPacking() {
        return massOfPacking;
    }

    public void setMassOfPacking(double massOfPacking) {
        this.massOfPacking = massOfPacking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packing packing = (Packing) o;
        return Double.compare(packing.massOfPacking, massOfPacking) == 0 && Objects.equals(name, packing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, massOfPacking);
    }

    @Override
    public String toString() {
        return "Product.Packing{" +
                "name='" + name + '\'' +
                ", massOfPacking=" + massOfPacking +
                '}';
    }
}
