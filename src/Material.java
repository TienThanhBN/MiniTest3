
import java.time.LocalDate;

public abstract class Material {
    private String id;
    private String name;
    private int cost;
    private LocalDate manufacturingDate;

    public Material() {
    }

    public Material(String id, LocalDate manufacturingDate, int cost, String name) {
        this.id = id;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getAmount();

    public abstract LocalDate getExpiryDate();


}
