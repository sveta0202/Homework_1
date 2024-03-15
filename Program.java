import java.util.ArrayList;
public class Program {

    public static void main(String[] args) {

        Product  product1 = new Product("Some brand 1", "Choco bar", 250);
        System.out.println(product1.displayInfo());

        Juice Juice1 = new Juice("Some brand 2", "Orange juice", 210, 0.2, 50);
        System.out.println(Juice1.displayInfo());

        Product Juice2 = new Juice("Some brand 2", "Grape juice", 210, 0.3, 40);
        System.out.println(Juice2.displayInfo());


        ArrayList<Product> list = new ArrayList<>();
        list.add(Juice1);
        list.add(Juice2);
        list.add(new Juice("Some brand 4", "Strawberry Juice", 210, 0.25, 50));

        VendingMachine vendingMachine = new VendingMachine(list);
        Juice JuiceRes =  vendingMachine.getJuice("Orange juice", 50);
        if (JuiceRes != null){
            System.out.println("Вы купили: ");
            System.out.println(JuiceRes.displayInfo());
        }
        else {
            System.out.println("Такого сока нет в автомате.");
        }



    }

}
