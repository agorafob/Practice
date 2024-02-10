package TestCiclum.lines;

import java.util.Vector;

public class LineList implements LineListInterface {
    Vector<Line> listOfLines;

    public LineList(Vector<Line> listOfLines) {
        this.listOfLines = listOfLines;
    }

    @Override
    public Line getLineWithMaxLength() {
        Line longestLine = null;
        int lineLength = 0;
        for (Line l : listOfLines) {
            int tmp = calculateLineLength(l);
            if (tmp > lineLength) {
                longestLine = l;
                lineLength = tmp;
            }
        }
        if (longestLine != null) longestLine.setLength(lineLength);
        return longestLine;
    }

    @Override
    public Vector<Line> getLinesStartingFromPoint(Point p) {
        Vector<Line> lines = new Vector<>();
        for (Line l : listOfLines) {
            if (l.start.x==p.x && l.start.y==p.y) lines.add(l);
        }
        return lines;
    }

    private int calculateLineLength(Line line) {
        return (int) Math.sqrt(Math.pow(line.end.x-line.start.x,2)+Math.pow(line.end.y-line.start.y,2));
    }

}
