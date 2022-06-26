public class Desktop extends Laptop {
   private double diagonal;

    public Desktop(double price, Model model, double diagonal) {
        super(price, model);
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
    @Override
    public double getDiscount(double mode){
        return getPrice()-getPrice()/100*mode;
    }
    @Override
    public String toString(){
        return "Цена: " + getPrice() +
                "\nМодель: " + getModel() +
                "\nДиагональ:  " + diagonal + "\n\n";

    }

}
