import java.util.Date;

public class Driver extends Employee {

    private int totalTrips;

    public int getTotalTrips() {
        return totalTrips;
    }

    public void setTotalTrips(int totalTrips) {
        this.totalTrips = totalTrips;
    }

    public float calculateSalary() {
        return getSalary() * totalTrips;
    }
}
