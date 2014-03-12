package puzzle;

import gps.api.GPSRule;
import gps.api.GPSState;
import gps.exception.NotAppliableException;

/**
 * Created by facundo on 3/11/14.
 */
public class PuzzleRuleLeft implements GPSRule{
    @Override
    public Integer getCost() {
        return 1;
    }

    @Override
    public String getName() {
        return "Movimiento a la izquierda.";
    }

    @Override
    public GPSState evalRule(GPSState state) throws NotAppliableException {

        PuzzleState pState = (PuzzleState) state;
        int[] cero = pState.getCero();
        PuzzleState newState = new PuzzleState(null);
        if(cero[0] - 1 < 0){
            throw new NotAppliableException();
        }else{
            int[][] newBoard = ((PuzzleState) state).getBoard();
            newBoard[cero[0]][cero[1]] = newBoard[cero[0]+1][cero[1]];
            newBoard[cero[0]-1][1] = 0;
            newState = new PuzzleState(newBoard);
            return newState;
        }
    }
}
