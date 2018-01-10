package models;

/**
 * Created by Guest on 1/10/18.
 */
public class Cube {
    private Rectangle face;

    public Cube(Rectangle rectangle) {
        face = rectangle;
    }

    public Rectangle getFace() {
        return face;
    }

    public int volume() {
        int height = face.getHeight();
        return height * height * height;
    }

    public int getSurfaceArea(){
        return face.area() * 6;
    }



}
