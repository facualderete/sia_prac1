package puzzle;

import gps.api.GPSProblem;
import gps.api.GPSRule;
import gps.api.GPSState;

import java.util.List;

public class PuzzleProblem implements GPSProblem{
    @Override
    public GPSState getInitState() {

        int[][] initial = { {5, 4, 7},
                            {0, 2, 1},
                            {3, 6, 8}
        };

        return new PuzzleState(initial);
    }

    @Override
    public GPSState getGoalState() {

        int[][] goal = { {1, 2, 3},
                {8, 0, 4},
                {7, 6, 5}
        };

        return new PuzzleState(goal);
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
