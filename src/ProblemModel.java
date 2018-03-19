import java.util.ArrayList;
import java.util.List;

/**
 * GoogleHashCode2018
 * PACKAGE_NAME
 * <p>
 * Written by rudolfaelbrecht in March, 2018.
 */
public class ProblemModel {

    private Car[] cars;

    public ProblemModel(int cars) {
        this.cars = new Car[cars];
        for (int i = 0; i<cars; i++)
            this.cars[i] = new Car();
    }

    public Car[] getCars() {
        return cars;
    }
}
