package models;

/**
 * Created by Guest on 1/10/18.
 */
public class Prism {
    private Rectangle side;
    private Rectangle square;
    private boolean hOrW = false; //height or width

    public Prism(Rectangle rectangle){
        side = rectangle;

        if (hOrW){
            square = new Rectangle( side.getHeight(), side.getHeight() );
        } else {
            square = new Rectangle(side.getWidth(), side.getWidth() );
        }

    }

    public void setHOrW(boolean tOrF){
        this.hOrW = tOrF;
    }

    public int getSurfaceArea(){
        return (side.area() * 4) + (square.area() * 2);
    }

    public int getVolume(){
        return (side.area() * square.getWidth());
    }
}
