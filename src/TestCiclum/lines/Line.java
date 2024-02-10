package TestCiclum.lines;

public class Line {
    Point start;
    Point end;
    private int length;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Start: " + start + " End:" + end ;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
