import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * GoogleHashCode2018
 * PACKAGE_NAME
 * <p>
 * Written by rudolfaelbrecht in March, 2018.
 */
abstract class DataExporter {

    public static void writeProblem(String fileName, ProblemModel model) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName));
        for (Car car: model.getCars()
             ) {
            writer.write(String.valueOf(car.getRides().size()));
            for (Ride ride: car.getRides()
                 ) {
                writer.write(" "+ride.getId());
            }
            writer.write("\n");
        }
        writer.close();
    }

}
