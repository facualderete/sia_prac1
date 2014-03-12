package puzzle;

import gps.api.GPSRule;
import gps.api.GPSState;
import gps.exception.NotAppliableException;

/**
 * Created by facundo on 3/11/14.
 */
public class PuzzleRuleRight implements GPSRule{
    @Override
    public Integer getCost() {
        return 1;
    }

    @Override
    public String getName() {
        return "Movimiento a la derecha.";
    }

    @Override
    public GPSState evalRule(GPSState state) throws NotAppliableException {
        return null;
    }
}
