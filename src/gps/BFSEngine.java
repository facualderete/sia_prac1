package gps;

/**
 * Created by facundo on 3/11/14.
 */
public class BFSEngine extends GPSEngine{
    @Override
    public void addNode(GPSNode node) {
        open.add(open.size() - 1, node); //agrego al final...
    }
}
