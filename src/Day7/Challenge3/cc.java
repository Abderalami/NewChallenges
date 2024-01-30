package Day7.Challenge3;

public class cc {
    public static void main(String[] args) {
        DrawingBoard drawingBoard = new DrawingBoard();

        Shape triangle = new Triangle();
        Shape square = new Square();

        drawingBoard.addShape(triangle);
        drawingBoard.addShape(square);

        drawingBoard.drawShapes();
    }
}

