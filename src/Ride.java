/**
 * GoogleHashCode2018
 * PACKAGE_NAME
 * <p>
 * Written by rudolfaelbrecht in March, 2018.
 */
public class Ride {

    private Junction from;

    private Junction to;

    private int dispatch;

    private int deadline;

    private Car owner = null;

    private static int counter = 0;

    private int id;

    public Ride(Junction from, Junction to, int dispatch, int deadline) {
        id = counter;
        counter++;
        this.from = from;
        this.to = to;
        this.dispatch = dispatch;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public Junction getFrom() {
        return from;
    }

    public Junction getTo() {
        return to;
    }

    public int getDispatch() {
        return dispatch;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setOwner(Car owner) {
        this.owner = owner;
        owner.getRides().add(this);
    }

    public Car getOwner() {
        return owner;
    }

    public boolean hasOwner() {
        return owner != null;
    }

    @Override
    public String toString() {
        return "[" + from.getColumn() + "," + from.getRow() + "] to [" + to.getColumn() + "," + to.getRow() + "] time " + getDispatch() + " - " + getDeadline();
    }
}
