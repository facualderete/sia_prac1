package gps;

/**
 * Created by facundo on 3/11/14.
 */
public class DFSEngine extends GPSEngine{
    @Override
    public void addNode(GPSNode node) {
        open.add(0, node); //agrego al principio...
    }
}
