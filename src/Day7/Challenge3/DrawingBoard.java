package Day7.Challenge3;
import java.util.ArrayList;
import java.util.List;

public class DrawingBoard {
    private List<Drawable> shapes = new ArrayList<>();

    public void addShape(Drawable shape) {
        shapes.add(shape);
    }

    public void displayShapeTypes() {
        for (Drawable shape : shapes) {
            shape.displayShapeType();
        }
    }

    public void drawShapes() {
        for (Drawable shape : shapes) {
            shape.drawShape();
        }
    }
}
