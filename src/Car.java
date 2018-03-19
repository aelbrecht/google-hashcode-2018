import java.util.ArrayList;
import java.util.List;

/**
 * GoogleHashCode2018
 * PACKAGE_NAME
 * <p>
 * Written by rudolfaelbrecht in March, 2018.
 */
public class Car {

    private List<Ride> rides = new ArrayList<>();

    private int column = 0;

    private int row = 0;

    private int available = 0;

    public List<Ride> getRides() {
        return rides;
    }

    @Override
    public String toString() {
        return "[" + column + "," + row + "]";
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getAvailable() {
        return available;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
