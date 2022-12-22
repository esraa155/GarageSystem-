public class Slot {

    private int id;
    private int width;
    private int depth;
    private boolean Available = true;
    static int count = 1;
    public Slot(int width, int depth) {
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
    public boolean getAvailability() {
        return this.Available;
    }
    public void setAvailability(boolean Available) {
        this.Available = Available;
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

}
