import java.util.Scanner;

public class Demo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Field f = new Field(0.0, 0.0, 500.0, 400.0);
        Ball b = new Ball(100.0, 100.0);

        Player p1 = new Player("Nora");
        Player p2 = new Player("Jill");

        System.out.println("SOCCER GAME SETUP!");

        System.out.println("Player 1: " + p1 );
        System.out.println("Player 2: " + p2 + "\n" + f + "\n" + b);
        System.out.println("\n");

        for (int i = 0; i < 10; i++){

            double distance = Math.random()*1000;
            double angle = Math.random()*360.0;

            p1.Kick(f, b, distance, angle);

            System.out.println(p1 + " kicks the ball for a distance of " + distance + " pixels at " + angle + " degrees");
            System.out.println(b);
            System.out.println("\n");

            double distance2 = Math.random()*1000;
            double angle2 = Math.random()*360.0;
            
            p2.Kick(f, b, distance2, angle2);

            System.out.println(p2 + " kicks the ball for a distance of " + distance2 + " pixels at " + angle2 + " degrees");
            System.out.println(b);
            System.out.println("\n");

        }
    }
}