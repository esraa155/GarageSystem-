public class Receipt {
    private float Fees;
    public static double  calculateFees(Vehicle vehicle){

        long elapse = CalculateTime.calculateTime(vehicle.getEndTime(),vehicle.getStartTime());
        int hours = (int)( (elapse % 3600 == 0)? (elapse / 3600) : (elapse /3600 + 1));

        return hours * 5;
    }

    public static double  calculateTotalIncome(int hours){
        return Garage.parkedVehicles.size() * hours * 5;
    }

}