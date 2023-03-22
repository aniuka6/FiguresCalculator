import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator shapeCalc = new ShapeCalculator(); //obiekt typu ShapeCalculator
        Shape shape = null; // zmienna do której przypiszemy kształt wpisany przez użytkownika

        boolean readComplete = false;
        // wzytujemy dane od użykownika tak długo aż odczyt sie nie powiódł

        while (!readComplete) {
            try {
                printOptions();
                shape = shapeCalc.createShape();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("wprowadziłeś dane w złym formacie, spróbuj ponownie");
            } catch (NoSuchElementException e) {
                System.out.println("Wybrany indentyfikator kształtu jest niepoprawny, spróbuj ponownie");
            } finally {
                shapeCalc.clearBuffer();

            }

        }
        System.out.println(shape);
        shapeCalc.closeScanner();
    }

    private static void printOptions() {
        System.out.println("WYbierz figurę, dla której chcesz obliczyć pole i obwód");
        System.out.println(Shape.RECTANGLE + "- prostokąt");
        System.out.println(Shape.CIRCLE + "- koło");
        System.out.println(Shape.SQUARE + "- kwadrat");
    }
}