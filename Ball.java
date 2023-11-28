public class Ball {
    private double xpos, ypos;

    //constructor
    public Ball(double bx, double by) {
        xpos = bx;
        ypos = by;
    }

    //getters
    public double getXpos() {
        return xpos;
    }

    public double getYpos() {
        return ypos;
    }

    //setters
    public void setXpos(double bx) {
        xpos = bx;
    }

    public void setYpos(double by) {
        ypos = by;
    }

    //toString to display coordinates
    public String toString(){
        return ("Ball is at (" + xpos + ", " + ypos + ")");
    }
}
