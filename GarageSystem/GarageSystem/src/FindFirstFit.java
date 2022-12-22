public class FindFirstFit extends Parking{
    public static Slot chooseSlot(Vehicle vehicle){

        for (Slot s : Garage.Slots){
            if (s.getDepth() >= vehicle.getDepth() && s.getWidth() >= vehicle.getWidth() && s.getAvailability())
                return s;
        }
        return null;
    }

}
