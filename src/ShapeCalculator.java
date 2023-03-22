import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {
    private Scanner sc = new Scanner(System.in);

    public void closeScanner() {
        sc.close();
    }

    private Rectangle readRectangleData() {
        System.out.println("Podaj informacje o prostokącie");
        System.out.println("Podaj długosć boku A:");
        double a = sc.nextDouble();
        System.out.println("Podaj długosć boku B:");
        double b = sc.nextDouble();

        return new Rectangle(a, b);
    }

    private Circle readCircleData() {
        System.out.println("Podaj informacje o kole");
        System.out.println("Podaj długość promienia r:");
        double r = sc.nextDouble();

        return new Circle(r);
    }
    private Square readSquareData(){
        System.out.println("Podaj informacje o kwadracie");
        System.out.println("Podaj długosć boku A:");
        double a = sc.nextDouble();

        return new Square(a);
    }
    public Shape createShape(){
        int shapeType = sc.nextInt();
        switch (shapeType){
            case Shape.RECTANGLE: //opcja 1
                return readRectangleData();
            case Shape.CIRCLE: //opcja 2
                return readCircleData();
            case Shape.SQUARE: //opcja 3
                return readSquareData();
            default:
                throw new NoSuchElementException();
        }
    }
    public void clearBuffer(){ //czyszczenie buforu

        sc.nextLine();
    }
}

