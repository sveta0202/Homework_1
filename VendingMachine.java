import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public Juice getJuice(String name, double kkal){
        for (Product product : products){
            if (product instanceof Juice){
                Juice Juice = (Juice)product;
                if (Juice.getName().equals(name) && Juice.getVolume() == kkal)
                    return Juice;
            }
        }
        return null;
    }


}
