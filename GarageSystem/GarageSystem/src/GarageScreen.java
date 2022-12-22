import java.util.*;
import java.util.LinkedList;

public class GarageScreen {
    static Garage g = new Garage(10);
    private static Receipt rater;
    static Configuration slotConfiguration = new Configuration(2);
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in); //creating scanner for total elements to be inserted in list
        RequestCapacity();
        int n = EnterCapacity();

        g.setCapacity(n);
        while(n>0) {
            RequestModelWidth();
            int width = EnterModelWidth();
            RequestModelDepth();
            int depth = EnterModelDepth();
            g.Slots.add(new Slot(width, depth));
            n--;  // decrement till the index became 0
        }
        System.out.println("\n1: First come first served slots\n2: best-fit approach\nChoose Slot Configuration: ");
        int choice = input.nextInt();
        if(choice==1)
            slotConfiguration.setConfiguration(1);
        else if(choice==2)
            slotConfiguration.setConfiguration(2);

        do {
            System.out.println(
                    "\n1.Park-in\n" +
                    "2.Park-out\n" +
                    "3.Show Total Income\n" +
                    "4.Available Parking Slots\n" +
                    "5.Exit");

            choice = input.nextInt();
            input.nextLine();

            switch (choice)
            {
                case 1:
                    RequestModelName();
                    String name = EnterModelName();
                    RequestModelYear();
                    int year = EnterModelYear();
                    RequestModelWidth();
                    int width = EnterModelWidth();
                    RequestModelDepth();
                    int depth = EnterModelDepth();
                    Vehicle v = new Vehicle(name,year,width,depth);
                    System.out.print("Your ID is: ");
                    System.out.print(v.getId());
                    Park.parkIn(v);
                    break;
                case 2:
                    System.out.print("Enter Your ID: ");
                    int id =input.nextInt();
                    for (Vehicle vehicle : g.parkedVehicles){
                        if(vehicle.getId()==id){
                            Park.parkOut(vehicle);
                        }
                    }

                    break;
                case 3:
                    System.out.print("Enter number of hours: ");
                    int h =input.nextInt();
                    System.out.print("Total Income Is: "+rater.calculateTotalIncome(h)+" EGP");
                    break;
                case 4:
                    Display_available_slots();
                    break;
                case 5:
                    System.out.println("GoodBye!");
                    break;
                default:
                    System.out.println("Choice must be a value between 1 and 3.");
            }
        } while (choice != 5);

        input.close();


    }

    private static void Display_available_slots() {
        for (Slot s : g.Slots){
            if(s.getAvailability()){
                System.out.print("Id: ");
                System.out.print(s.getId());
                System.out.print("   W: ");
                System.out.print(s.getWidth());
                System.out.print("   D: ");
                System.out.println(s.getDepth());
            }

        }
    }
    private static void RequestModelName() {
        System.out.print("Enter Vehicle model name: ");

    }
    private static String EnterModelName() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name;
    }
    private static void RequestModelYear() {
        System.out.print("Enter Vehicle model year: ");
    }
    private static int EnterModelYear() {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        return year;
    }
    private static void RequestModelWidth() {
        System.out.print("Enter Vehicle model width: ");
    }
    private static int EnterModelWidth() {
        Scanner input = new Scanner(System.in);
        int width = input.nextInt();
        return width;
    }
    private static void RequestModelDepth() {
        System.out.print("Enter Vehicle model depth: ");
    }
    private static int EnterModelDepth() {
        Scanner input = new Scanner(System.in);
        int depth = input.nextInt();
        return depth;
    }
    private static void RequestCapacity() {
        System.out.print("Enter maximum number of vehicles: ");
    }
    private static int EnterCapacity() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // user will enter total elements
        return n;
    }




}