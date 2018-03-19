import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * GoogleHashCode2018
 * PACKAGE_NAME
 * <p>
 * Written by rudolfaelbrecht in March, 2018.
 */
public class DataImporter {

    public static ProblemData getProblem(String fileName) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get(fileName));
        ProblemData problem = null;

        while (true) {
            String line = reader.readLine();
            if (line == null)
                break;
            String[] points = line.split(" ");
            if (problem == null) {
                problem = new ProblemData(
                        Integer.parseInt(points[0]),
                        Integer.parseInt(points[1]),
                        Integer.parseInt(points[2]),
                        Integer.parseInt(points[4]),
                        Integer.parseInt(points[5])
                );
            } else {
                problem.getRides().add(
                        new Ride(
                                new Junction(Integer.parseInt(points[0]), Integer.parseInt(points[1])),
                                new Junction(Integer.parseInt(points[2]), Integer.parseInt(points[3])),
                                Integer.parseInt(points[4]),
                                Integer.parseInt(points[5])
                        )
                );
            }
        }
        return problem;
    }

}
