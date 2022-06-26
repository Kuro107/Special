public class Computer {
    private double price;
    private Model model;

    public Computer(double price, Model model) {
        this.price = price;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public double getDiscount(double price) {
        return price / 100 * 20;
    }
}
