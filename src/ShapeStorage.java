/**
 * Created by 310124463 on 14/01/17.
 */
public class ShapeStorage {

    private Shape [] shapes = new Shape[4];

    private int index = 0 ;

    public void addShape(Shape rectangle) {

        if(index <4) {
            shapes[index] = rectangle;
            index++;
        }

    }


    public Shape [] getShapes ()
    {
        return shapes ;
    }
}
