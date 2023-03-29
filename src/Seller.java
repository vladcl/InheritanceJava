import java.util.Date;

public class Seller extends Employee {
    private int allSales;
    private float commissionPerSale;

    public float calculateSalary() {
        return getSalary() + (this.commissionPerSale * allSales);
    }

    public int getAllSales() {
        return allSales;
    }

    public void setAllSales(int allSales) {
        this.allSales = allSales;
    }

    public float getCommissionPerSale() {
        return commissionPerSale;
    }

    public void setCommissionPerSale(float commissionPerSale) {
        this.commissionPerSale = commissionPerSale;
    }
}
