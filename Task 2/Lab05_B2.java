public class Lab05_B2 {
    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println(circle);
        Square square = new Square(2, "blue", true);
        square.setSide(12);
        square.setWidth(4);
        System.out.println(square.getArea());
        System.out.println(square);
    }
}
