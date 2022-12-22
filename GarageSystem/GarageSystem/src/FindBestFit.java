public class FindBestFit extends Parking{
    public static Slot chooseSlot(Vehicle vehicle){

        Slot min = FindBestFit.chooseSlot(vehicle);
        if(min == null) return null;

        for (int i = Garage.Slots.indexOf(min)+1; i < Garage.Slots.size(); i++) {
            Slot s = Garage.Slots.get(i);
            if((s.getDepth() >= vehicle.getDepth() && s.getAvailability() && s.getWidth() >= vehicle.getWidth())
                    &&((s.getDepth() - vehicle.getDepth()) + (s.getWidth() - vehicle.getWidth()))/2
                    < ((min.getDepth() - vehicle.getDepth()) + (min.getWidth() - vehicle.getWidth()))/2)
            {
                min = s;
            }
        }
        return min;
    }

}
