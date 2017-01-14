import java.util.Iterator;

/**
 * Created by 310124463 on 14/01/17.
 */
public class ShapeIterator implements Iterator<Shape> {

    private Shape [] shapes ;

    private int index = 0 ;

    public ShapeIterator(Shape[] shapes) {

        this.shapes = shapes ;
    }

    public boolean hasNext()
    {

        if(index >= shapes.length || shapes[index]==null)
        {
            return false ;
        }
        else
            return true;
    }

    public Shape next()
    {
        return shapes [index ++];
    }

    public void remove()
    {
       for (int i = index -1; i < shapes.length-1 ; i ++)
       {
           shapes [i] = shapes [i+1];
       }

       shapes[shapes.length-1] = null;


    }
}
