public class Field {
    private double xpos, ypos, length, width;

    //constructor
    public Field(double x, double y, double l, double w){
        xpos = x;
        ypos = y;
        length = l;
        width = w;
    }

    //getters
    public double getXpos() {
        return xpos;
    }

    public double getYpos() {
        return ypos;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //setters
    public void setXpos(double x) {
        xpos = x;
    }

    public void setYpos(double y) {
        ypos = y;
    }

    public void setLength(double l) {
        length = l;
    }

    public void setWidth(double w) {
        width = w;
    }

    //toString to dsplay values of instance variables
    public String toString(){
        return ("Field: [" + xpos + ", " + ypos + "]" + length + "," + width);
    }
}
