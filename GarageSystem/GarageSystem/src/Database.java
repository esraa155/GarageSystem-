import java.util.Date;
import java.util.LinkedList;

public class Database {
    String Manager;
    private Date startTime;
    private Date endTime;
    static LinkedList<Vehicle> Vehicles = new LinkedList<Vehicle>();
    public void push_Vehicle(Vehicle vehicle) {
        this.Vehicles.add(vehicle);
    }
    public void popVehicle(Vehicle vehicle) {
        this.Vehicles.remove(vehicle);
    }
    public void SaveManager(String Manager) {
        this.Manager = Manager;
    }
    public static double  TotalIncome(int hours){
        return Garage.parkedVehicles.size() * hours * 5;
    }
    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
