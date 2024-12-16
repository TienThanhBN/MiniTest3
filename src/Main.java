import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CrispyFlour cf1 = new CrispyFlour("001", LocalDate.now(), 15000, "bot1", 4);
        CrispyFlour cf2 = new CrispyFlour("002", LocalDate.now(), 51000, "bot2", 2);
        CrispyFlour cf3 = new CrispyFlour("003", LocalDate.now(), 32000, "bot3", 6);
        CrispyFlour cf4 = new CrispyFlour("004", LocalDate.now(), 23000, "bot4", 3);
        CrispyFlour cf5 = new CrispyFlour("005", LocalDate.now(), 11111, "bot5", 5);

        Meat m1 = new Meat("006", LocalDate.now(), 110000, "thit1", 16);
        Meat m2 = new Meat("007", LocalDate.now(), 150000, "thit2", 6);
        Meat m3 = new Meat("008", LocalDate.now(), 90000, "thit3", 12);
        Meat m4 = new Meat("009", LocalDate.now(), 75000, "thit4", 15);
        Meat m5 = new Meat("010", LocalDate.now(), 120000, "thit5", 10);

        Material[] materialArray = new Material[]{cf1, cf2, cf3, cf4, cf5, m1, m2, m3, m4, m5};
        double totalRealAmount = 0;
        double moneyDifference = 0;
        double totalAmount = 0;
        for (Material material : materialArray) {
            totalRealAmount += ((Discount) material).getRealMoney();
            totalAmount += material.getAmount();
        }
        moneyDifference = totalAmount - totalRealAmount;
        System.out.println("so tien chenh lech la: " + moneyDifference);


    }
}
