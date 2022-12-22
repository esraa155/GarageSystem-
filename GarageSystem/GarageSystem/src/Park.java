import java.util.Date;

public class Park {

    public static boolean parkIn(Vehicle vehicle){

        Slot s = GarageScreen.slotConfiguration.getConfiguration()==2?FindBestFit.chooseSlot(vehicle):FindFirstFit.chooseSlot(vehicle);

        if (s == null)
            return false;

        // remove the parking space from the Available Slots queue
        vehicle.setSlot(s);

        s.setAvailability(false);
        Garage.parkedVehicles.add(vehicle);
        vehicle.setStartTime(new Date());
        return true;
    }
    public static boolean parkOut(Vehicle vehicle){
        Garage.parkedVehicles.remove(vehicle);
        vehicle.getSlot().setAvailability(true);

        vehicle.setEndTime(new Date());
        // calculate the parking fee
        System.out.print("Your parking Fees is: "+ Receipt.calculateFees(vehicle)+" EGP");


        return true;
    }
}
