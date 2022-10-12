import java.util.Scanner;
public class Geom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double perimetr = trianglePerimetr(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println(perimetr);
    }
    public static double segmentLength(int x1, int y1, int x2, int y2)
    {
        double d = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        return d;
    }
    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        double ab = segmentLength(x1, y1, x2, y2);
        double bc = segmentLength(x2, y2, x3, y3);
        double ac = segmentLength(x1, y1, x3, y3);
        double p = ab+bc+ac;

        return p;
    }

}
