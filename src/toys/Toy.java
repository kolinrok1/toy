package toys;

public class Toy {
    protected int toyId;
    protected String name;
    protected int drawWeight;
    protected int price;

    public int getToyId() {
        return toyId;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrawWeight() {
        return drawWeight;
    }

    public void setDrawWeight(int drawWeight) {
        this.drawWeight = drawWeight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyId=" + toyId +
                ", name='" + name + '\'' +
                ", drawWeight=" + drawWeight +
                ", price=" + price +
                '}';
    }
}