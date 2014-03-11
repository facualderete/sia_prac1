package puzzle;

import gps.api.GPSProblem;
import gps.api.GPSRule;
import gps.api.GPSState;

import java.util.List;

public class PuzzleProblem implements GPSProblem{
    @Override
    public GPSState getInitState() {
        return null; //aca habria que crear el estado inicial con numeros random...
    }

    @Override
    public GPSState getGoalState() {
        return null; //ver si estan todos ordenados...
    }

    @Override
    public List<GPSRule> getRules() {
        return null;
    }

    @Override
    public Integer getHValue(GPSState state) {
        return null;
    }
}
