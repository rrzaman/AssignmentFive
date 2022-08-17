import java.util.ArrayList;

public class CancerCell extends Cell{

    // Constructor method
    public CancerCell(int x, int y){
        super(1,x,y,3);
    }

    // interactNeighbours method override
    @Override
    public void interactNeighbours(ArrayList<Cell> neighbors) {

    }

}
