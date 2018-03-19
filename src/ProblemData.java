import java.util.ArrayList;
import java.util.List;

/**
 * GoogleHashCode2018
 * PACKAGE_NAME
 * <p>
 * Written by rudolfaelbrecht in March, 2018.
 */
public class ProblemData {

    private int columns;

    private int rows;

    private int vehicles;

    private int bonus;

    private int steps;

    private List<Ride> rides = new ArrayList<>();

    public ProblemData(int columns, int rows, int vehicles, int bonus, int steps) {
        this.columns = columns;
        this.rows = rows;
        this.vehicles = vehicles;
        this.bonus = bonus;
        this.steps = steps;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public int getCars() {
        return vehicles;
    }

    public List<Ride> getRides() {
        return rides;
    }

    public int getBonus() {
        return bonus;
    }

    public int getSteps() {
        return steps;
    }

    @Override
    public String toString() {
        return "city " + getColumns() + "x" + getRows() + " with " + getCars() + " vehicles, " + getSteps() + " steps and " + getBonus() + " bonus";
    }
}
