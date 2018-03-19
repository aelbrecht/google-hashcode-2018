import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * GoogleHashCode2018
 * PACKAGE_NAME
 * <p>
 * Written by rudolfaelbrecht in March, 2018.
 */
public class Simulation {


    private ProblemData data;

    private ProblemModel model;

    private int step = 0;

    public Simulation(ProblemData data, ProblemModel model) {
        this.data = data;
        this.model = model;
    }

    public void operate(Car car) {
        List<RideDistancePair> available = new ArrayList<>();
        for (Ride ride : data.getRides()
                ) {
            if (!ride.hasOwner()) {
                int distance = Math.abs(ride.getFrom().getRow() - car.getRow()) + Math.abs(ride.getTo().getColumn() - car.getColumn());
                if (step < (ride.getDeadline() - distance)) {
                    if (distance>5000)
                        continue;
                    int waitTime = ride.getDispatch() - distance;
                    available.add(new RideDistancePair(distance + waitTime, ride));
                }
            }
        }
        Collections.sort(available);
        if (available.size() > 0) {
            Ride ride = available.get(0).getRide();
            int distance = available.get(0).getDistance();
            car.setAvailable(step + distance);
            ride.setOwner(car);
        }
    }

    public void step() {
        if (step % 100 == 0) {
            int count = 0;
            for (Ride ride : data.getRides()
                    ) {
                if (!ride.hasOwner()) {
                    if (step < (ride.getDeadline()) && step > (ride.getDispatch())) {
                        count++;
                    }
                }
            }
            System.out.println("Step " + step + "/" + data.getSteps() + " | " + count + " active rides");
        }
        for (Car car : model.getCars()
                ) {
            if (car.getAvailable() <= step) {
                operate(car);
            }
        }
        step++;
    }

    public int getStep() {
        return step;
    }
}
