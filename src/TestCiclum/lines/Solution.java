package TestCiclum.lines;

import java.util.Vector;

public class Solution {
    /*
    3.8.13.14
    8.4.3.12
    -7.-4.17.6
    7.3.1.2
    8.4.5.11
    start point 8.4
     */

    public static void main(String[] args) {
        Line l1 = new Line(new Point(3,8),new Point(13,14));
        Line l2 = new Line(new Point(8,4),new Point(3,12));
        Line l3 = new Line(new Point(-7,-4),new Point(17,6));
        Line l4 = new Line(new Point(7,3),new Point(1,2));
        Line l5 = new Line(new Point(8,4),new Point(5,7));
        Point startPoint = new Point(8,4);
        Vector<Line> lines = new Vector<>();
        lines.add(l1);
        lines.add(l2);
        lines.add(l3);
        lines.add(l4);
        lines.add(l5);
        LineList lineList = new LineList(lines);
        Line longestLine = lineList.getLineWithMaxLength();
        System.out.println("Longest line --> " + longestLine + "\n" +
                           "Length: " + longestLine.getLength());
        System.out.println("All lines starting from point: " + startPoint);
        System.out.println(lineList.getLinesStartingFromPoint(startPoint));
    }
}
