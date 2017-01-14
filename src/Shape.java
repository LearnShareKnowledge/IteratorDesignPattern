/**
 * Created by 310124463 on 14/01/17.
 */
public class Shape {

    private final int id;
    private final String name;


    public Shape(int id , String name)
    {
        this.id = id;

        this.name = name ;
    }

    @Override
    public String toString() {
        return name;
    }
}
