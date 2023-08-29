public class Main {
    public static void main(String[] args) {

        GraphicRedactor graphicRedactor = new GraphicRedactor();

        graphicRedactor.addShape(new Circle());
        graphicRedactor.addShape(new Ellipse());
        graphicRedactor.addShape(new Rectangle());
        graphicRedactor.addShape(new Square());
        graphicRedactor.addShape(new Triangle());

    }
}