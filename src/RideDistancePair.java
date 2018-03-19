/**
 * GoogleHashCode2018
 * PACKAGE_NAME
 * <p>
 * Written by rudolfaelbrecht in March, 2018.
 */
public class RideDistancePair implements Comparable<RideDistancePair> {

    private int distance;

    private Ride ride;

    public RideDistancePair(int distance, Ride ride) {
        this.distance = distance;
        this.ride = ride;
    }

    public int getDistance() {
        return distance;
    }

    public Ride getRide() {
        return ride;
    }

    @Override
    public int compareTo(RideDistancePair o) {
        return getDistance() - o.getDistance();
    }
}
