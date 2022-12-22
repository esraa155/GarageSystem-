import java.util.Date;

public class CalculateTime {

     static public long calculateTime(Date startTime, Date endTime) {
        return (startTime.getTime() - endTime.getTime()) /1000;
    }
}
