import java.util.Date;

public class Vehicle {


    private String model_name;
    private static int count = 1;
    private int id,model_year,width,depth;
    private Date startTime;
    private Slot slot;
    private Date endTime;
    private double stayTime;
    public Vehicle(String model_name,int model_year,int width,int depth){
        this.model_name = model_name;
        this.model_year = model_year;
        this.width = width;
        this.depth = depth;
        this.id = count++;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getDepth() {
        return depth;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public Slot getSlot() {
        return this.slot;
    }
    public void setSlot(Slot slot) {
        this.slot = slot;
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