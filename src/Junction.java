/**
 * GoogleHashCode2018
 * PACKAGE_NAME
 * <p>
 * Written by rudolfaelbrecht in March, 2018.
 */
public class Junction implements Comparable<Junction> {

    private int column;

    private int row;

    public Junction(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    @Override
    public int compareTo(Junction o) {
        if (getColumn() == o.getColumn() && getRow() == o.getRow())
            return 0;
        return -1;
    }
}
