
import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, LocalDate manufacturingDate, int cost, String name, double weight) {
        super(id, manufacturingDate, cost, name);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return this.getWeight() * this.getCost();
    }

    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        return this.getAmount() * 90 / 100;
    }
}
