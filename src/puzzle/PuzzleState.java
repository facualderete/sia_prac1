package puzzle;

import gps.api.GPSState;

/**
 * Created by facundo on 3/11/14.
 */
public class PuzzleState implements GPSState{

    private int[][] board = new int[3][3];

    private int[] cero;

    public PuzzleState(int[][] board){

        //TODO: ver como setear la posicion del cero...

        this.board = board;
    }

    @Override
    public boolean compare(GPSState state) {

        if(!state.getClass().toString().equals("PuzzleState")){
            return false;
        }

        int[][] otherBoard = ((PuzzleState) state).getBoard();

        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                if(this.board[i][j] != otherBoard[i][j]){
                    return false;
                }
            }
        }

        return true;
    }

    public int[][] getBoard() {
        return board;
    }

    public int[] getCero(){
        return this.cero;
    }

}
