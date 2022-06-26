public class Laptop extends Computer {
    public Laptop(double price, Model model) {
        super(price, model);
    }
@Override
    public double getDiscount(double mode){
        return getPrice()-getPrice()/100*mode; // Метод для определения цены после скидки(размер скидки задаем сами в плоть до 100%)
}
    @Override
    public String toString(){
        return "Цена: " + getPrice() +
                "\nМодель: " + getModel() + "\n\n";
    }
}
