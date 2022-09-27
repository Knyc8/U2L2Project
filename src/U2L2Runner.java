import java.util.Scanner;

public class U2L2Runner {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(150, 200);
        Rectangle rect2 = new Rectangle(100);
        Rectangle rect3 = new Rectangle();

        rect.setWidth(125);
        rect2.setLength(125);
        rect2.setWidth(125);
        rect3.setWidth(125);

        rect.printRectangleInfo();
        System.out.println();
        rect2.printRectangleInfo();
        System.out.println();
        rect3.printRectangleInfo();

        System.out.println();
        int perimSum = rect.calculatePerim() + rect2.calculatePerim() + rect3.calculatePerim();
        System.out.println("The total amount of fencing required is " + perimSum);

        int areaSum = rect.calculateArea() + rect2.calculateArea() + rect3.calculateArea();
        System.out.println("The total area required for seeding is " + areaSum);

        Scanner s = new Scanner(System.in);
        System.out.println();

        System.out.println("How many pieces of lumber do you need for the home you are building?");
        int lumber = s.nextInt();

        System.out.println("How many windows do you need?");
        int window = s.nextInt();

        System.out.println("What is the tax rate for your area? (In decimal form)");
        double taxRate = s.nextDouble();

        ConstructionPricer price = new ConstructionPricer(11.50, 25.75, taxRate);

        System.out.println();
        System.out.printf("Total Materials Cost: $%.2f\n", price.materialsCost(lumber, window));
        System.out.printf("Grand Total after Tax: $%.2f\n", price.totalWithTax(price.materialsCost(lumber, window)));
    }
}
