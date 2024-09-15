package section1_intro.part1_language_basics;


public class Point {
    int x;
    int y;

    /**
     * Create an instance of class point that is located at the same coordinates as the current object, but in the
     * diagonally opposing quadrant of coordinate space.
     * So, when the current point is at (4, 4), this method will return Point(-4, -4)
     * and when the current point is at (2, -5) it will return Point(-2, 5).
     * @return inverse Point
     */
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point createInversePoint() {
        return new Point(-x, -y);
    }

    /**
     * This method returns the Euclidean distance of the current point (this) to the given point (otherPoint).
     * GIYF if you forgot what Euclidean distance is and how it is calculated.
     * @param otherPoint
     * @return euclidean distance
     */
    double euclideanDistanceTo(Point otherPoint) {
        Point p1 = new Point(x, y);
        Point p2 = new Point(otherPoint.x, otherPoint.y);

        int verschilX = Math.abs(x - otherPoint.x);
        int verschilY = Math.abs(y - otherPoint.y);

        return Math.hypot(verschilX, verschilY);
    }
}
