package Product;

import java.util.Objects;

public class PackedPieceProduct extends PeaceOfProduct implements NettoBrutto{
    //1.6
    private int piecesOfProduct;
    private Packing packing;

    public PackedPieceProduct(String name, String description, double weightOfProduct, int piecesOfProduct, Packing packing) throws ProductException {
        super(name, description, weightOfProduct);
        if (piecesOfProduct <= 0) throw new ProductException("Некорректные данные");
        this.piecesOfProduct = piecesOfProduct;
        this.packing = packing;
    }


    @Override
    public double netto() {
        return getWeightOfProduct();
    }

    @Override
    public double brutto() {
        return getWeightOfProduct() + packing.getMassOfPacking();
    }

    public int getPiecesOfProduct () {
        return piecesOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackedPieceProduct that = (PackedPieceProduct) o;
        return piecesOfProduct == that.piecesOfProduct && Objects.equals(packing, that.packing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), piecesOfProduct, packing);
    }

    @Override
    public String toString() {
        return "Product.PackedPieceProduct{" +
                "piecesOfProduct=" + piecesOfProduct +
                ", packing=" + packing +
                '}';
    }
}
