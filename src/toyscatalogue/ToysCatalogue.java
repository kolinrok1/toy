package toyscatalogue;

import toys.Toy;

public class ToysCatalogue {
    protected int quantity;
    protected Toy toys;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Toy getToys() {
        return toys;
    }

    public void setToys(Toy toys) {
        this.toys = toys;
    }

    public void takeToy() {
        if (this.quantity > 0) {
            this.quantity -= 1;
        }
    }

    @Override
    public String toString() {
        return "ToysCatalogue{" +
                "quantity=" + quantity +
                ", toys=" + toys.toString() +
                '}';
    }
}