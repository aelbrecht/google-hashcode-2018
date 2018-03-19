import java.io.IOException;
import java.util.HashMap;

public class SelfDrivingRides {

    private static final HashMap<Character, String> dataMap = new HashMap<>();

    static {
        dataMap.put('a', "a_example.in");
        dataMap.put('b', "b_should_be_easy.in");
        dataMap.put('c', "c_no_hurry.in");
        dataMap.put('d', "d_metropolis.in");
        dataMap.put('e', "e_high_bonus.in");
    }

    public static void main(String[] args) throws IOException {
        String fileName = dataMap.get(args[0].charAt(0));
        ProblemData data = DataImporter.getProblem(fileName);
        ProblemModel model = new ProblemModel(data.getCars());
        Simulation sim = new Simulation(data, model);

        while (sim.getStep() < data.getSteps())
            sim.step();

        DataExporter.writeProblem(fileName.replaceAll(".in", ".out"), model);
    }
}
