import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     ArrayList <Computer> store = new ArrayList<>();                       // создаем новую коллекцию, что бы сохранить там 100 компьютеров
     Laptop laptop = new Laptop(100,Model.HP);                       // создаем Ноутбук
     Desktop desktop = new Desktop(1999,Model.APPLE,21);    //создаем Компьютер
    for (int i = 0; i < 100; i++){                                        // здесь мы запускаем цикл, что бы сохранить в магазине 100 компьютеров
        if (i <= 50){                                                     // условия для создания ноутбуков
            store.add(laptop);
        }
        else {                                                              //иначе создаем компьютеры
            store.add(desktop);
            }
        }
            double priceByDevice = 0;
            double sum = 0;

        for (int i = 0; i < 100; i++){                                          //запускаем цикл по всем устройствам
            priceByDevice = store.get(i).getPrice();                            //узнаем цену за каждое устройство
            sum += priceByDevice;                                               // узнаем сумму цен
        }                                                                       //
        System.out.println("Итого есть устройств на сумму: "+sum + " $");       //

        sum = 0;
        for (int i = 0; i < 100; i++){
            priceByDevice = store.get(i).getDiscount(10);                            //запускаем цикл по всем устройствам
            sum += priceByDevice;                                                          //узнаем цену за каждое устройств
                                                                                            // узнаем сумму цен после скидки 10% на все устройства
        }
        System.out.println("Цена всех устройств со скидкой 10% равна: " + sum + " $");

        sum=0;
        for (int i = 0; i < 100; i++){                                                      // узнаем сумму цен после скидки 20% на все ноутбуки
            if (i <= 50){
                priceByDevice = store.get(i).getDiscount(20);
            }
            else {
                priceByDevice =store.get(i).getPrice();
            }
            sum += priceByDevice;
        }
        System.out.println("Цена всех устройств со скидкой на ноутбуки в 20% равна: " + sum + " $");
        System.out.println("Поиск по цене и модели");
        System.out.println("Введите цену: ");
        double searchingPrice = scanner.nextDouble();
        System.out.println("Введите модель hp\n или же ap" );
        String searchingModel = scanner.next();
        for (int i = 0; true; i++){
            if (searchingPrice == store.get(i).getPrice() && searchingModel.equals(store.get(i).getModel().getName())){
                System.out.println("Успешно найдена модель: "+store.get(i).getModel() + "\nЕё цена после скидки:  " + store.get(i).getDiscount(20));
                break;
            }
            else System.out.println("К сожалению 404");
            break;
        }

    }

}
