
import java.time.LocalDate;


public class CrispyFlour extends Material implements Discount{

    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, LocalDate manufacturingDate, int cost, String name, int quantity) {
        super(id, manufacturingDate, cost, name);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return this.quantity*this.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        return this.getAmount() * 95 / 100;
    }
}
