public class Juice extends Product{

    public Juice(String name) {
        super(name);
    }

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    private double kkal;

    public double getKkal() {
        return kkal;
    }

    public void setKkal(double kkal) {
        this.kkal = kkal;
    }

    public Juice(String brand, String name, double price, double volume, double kkal){
        super(brand, name, price);
        this.volume = volume;
        this.kkal = kkal;
    }

    @Override
    public String displayInfo() {
        return String.format("Бутылка с водой\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %2f\n\tОбъем: %.2f\n\tКалорийность: %.2f]",
                brand, name, price, volume, kkal);
    }
}
