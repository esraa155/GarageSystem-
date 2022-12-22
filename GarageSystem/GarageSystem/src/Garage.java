import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Garage {

    private int capacity;
    static LinkedList<Vehicle> parkedVehicles = new LinkedList<Vehicle>();
    static LinkedList<Slot> Slots = new LinkedList<Slot>();



    public Garage(int capacity){
        this.capacity = capacity;
    }

    public void addVehicle(Vehicle vehicle) {
        this.parkedVehicles.add(vehicle);
    }
    public void popVehicle(Vehicle vehicle) {
        this.parkedVehicles.remove(vehicle);
    }
    public void getSlots() {
        for (Slot s : Slots){
            System.out.print("Id: ");
            System.out.print(s.getId());
            System.out.print("   W: ");
            System.out.print(s.getWidth());
            System.out.print("   D: ");
            System.out.println(s.getDepth());
            System.out.print("   Available: ");
            System.out.println(s.getAvailability());
        }

    }
    public void getAvailableSlots() {
        for (Slot s : Slots){
            if(s.getAvailability()){
                System.out.print("Id: ");
                System.out.print(s.getId());
                System.out.print("   W: ");
                System.out.print(s.getWidth());
                System.out.print("   D: ");
                System.out.println(s.getDepth());
                System.out.print("   Available: ");
                System.out.println(s.getAvailability());
            }

        }
    }

    public void setSlots(Slot slot) {
        Scanner input = new Scanner(System.in); //creating scanner for total elements to be inserted in list
        int n=capacity;
        while(n>0) {
            System.out.print("Enter Slot width: ");
            int width = input.nextInt();
            System.out.print("Enter Slot depth: ");
            int depth = input.nextInt();
            Slots.add(new Slot(width, depth));
            n--;  // decrement till the index became 0
        }
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}