import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Seller s = new Seller();
        s.setName("Leon");
        s.setSalary(1000.0f);
        s.setBirthday(new Date());
        s.setCpf("12345678");
        s.setCommissionPerSale(10.0f);
        s.setAllSales(20);

        System.out.println("O vendedor " + s.getName() + " tem seu salário de " + s.calculateSalary());

        Driver d = new Driver();
        d.setName("Joel");
        d.setCpf("12345666");
        d.setSalary(10.0f);
        d.setBirthday(new Date());
        d.setTotalTrips(30);

        System.out.println("O motorista " + d.getName() + " fez: " + d.getTotalTrips() + " viagens e seu salário é de "
                + d.calculateSalary());
    }
}
