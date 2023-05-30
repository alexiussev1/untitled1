package seminar1;

//  Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
//  содержащий в себе методы initProducts (List <Product>)
//  сохраняющий в себе список исходных продуктов и getProduct(String name)

//  Сделать класс Товар абстрактным, создать нескольких наследников
//  (к примеру: БутылкаВоды), сделать интерфейсом ТорговыйАвтомат и
//  реализовать класс какого-то одного типа ТорговогоАвтомата
//  (пример: ПродающийБутылкиВодыАвтомат

//    1. Попросить вначале переопределить метод toString для Товара,
//    запустить программу, после этого переопределить для наследника
//    этот метод, после запуска обратить внимание на изменение поведения.
//    2. Попросить создать перегруженный метод выдачи товара
//    ТорговымАвтоматом дополнив дополнительным входным параметром
//    (пример: getProduct(String name) выдающий товар по имени,
//    создать метод возвращающий товар по имени и какому-либо параметру
//    товара getProduct(String name, int volume)

public class Main {
    public static void main(String[] args) {

        Vending vending = new Vending();
        Product product1 = new Product("Apple", 20, 1L);
        Product product2 = new Product("Orange", 30, 2L);
        Product product3 = new Product("Banana", 25, 3L);

        vending.addProduct(product1);
        vending.addProduct(product2);
        vending.addProduct(product3);

        //product1.kind = "Apple";

        vending.addProduct(product1);
        System.out.println(vending.getProduct("Apple"));


    }
}
