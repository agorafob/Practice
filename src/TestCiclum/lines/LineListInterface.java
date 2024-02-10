package TestCiclum.lines;

import java.util.Vector;

public interface LineListInterface {
    Line getLineWithMaxLength();
    Vector<Line> getLinesStartingFromPoint(Point p);
}
