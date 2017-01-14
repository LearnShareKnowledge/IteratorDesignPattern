/**
 * Created by 310124463 on 14/01/17.
 */
public class Main {

    public static void main (String [] args)
    {

        ShapeStorage shapeStorage = new ShapeStorage ();

        Shape rectangle = new Shape(1,"rectangle");

        Shape circle = new Shape (2,"circle");

        Shape square = new Shape(3,"square");

        Shape triangle = new Shape (4,"triangle");


        shapeStorage.addShape(rectangle);

        shapeStorage.addShape(circle);

        shapeStorage.addShape(square);

        shapeStorage.addShape(triangle);

        // Traverse through each of the shape --

        // we need to use iterator

        // We do not need to know the size of the collection

        // We can remove an element while iterating





        ShapeIterator iterator = new ShapeIterator(shapeStorage.getShapes());

        // has next -- true or false

        // next - Shape

        /*while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
*/

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
            iterator.remove();
        }

    }
}
