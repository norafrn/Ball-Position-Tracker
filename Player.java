public class Player {
    private String name;

    public Player(String n){
        name = n;
    }

    //f for a field object, b for a ball, d for kick distance and a for kick angle
    public void Kick(Field f, Ball b, Double d, Double a) {
        Double a_rad = Math.toRadians(a);
        double sinVal = Math.sin(a_rad);
        double cosVal = Math.cos(a_rad);

        Double nx = b.getXpos() + d * cosVal;
        Double ny = b.getYpos() + d * sinVal;

//        boolean nxInBounds = ((b.getXpos() <= nx) && (nx <= (b.getXpos() + f.getLength())));
//        boolean nyInBounds = ((b.getYpos() <= ny) && (ny <= (b.getYpos() + f.getWidth())));

        //if nx and ny are withing field
        if ((f.getXpos() <= nx && nx <= (f.getXpos()+f.getLength())) && (f.getYpos() <= ny && ny <= (f.getYpos() + f.getWidth()))){
            b.setXpos(nx);
            b.setYpos(ny);

            //if ny is out of bound
        } else if (( ny < f.getYpos() || ny > (f.getYpos()+f.getWidth()) ) && ( f.getXpos() <= nx && nx <= (f.getXpos()+f.getLength()) )) {
            b.setXpos(nx);
            System.out.println("Ball is reflected");

            //if nx is out of bound
        } else if (( nx < f.getXpos() || nx > (f.getXpos()+f.getWidth()) ) && ( f.getYpos() <= ny && ny <= (f.getYpos() + f.getWidth()) )) {
            b.setYpos(ny);
            System.out.println("Ball is reflected");

            //both out of bounds
        } else if (( nx < f.getXpos() || nx > (f.getXpos()+f.getWidth()) ) && ( ny < f.getYpos() || ny > (f.getYpos()+f.getWidth()) )) {
            System.out.println("Ball is reflected back to original position");
        }
    }
    public String toString(){
        return ("Player " + name);
    }
}

