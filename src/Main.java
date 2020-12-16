public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("blue",true);
        Circle cirle= new Circle("red",false,5);
        Rectangle rectangle=new Rectangle("white",true,6,8);
        Square square=new Square("black",true,10);
        System.out.println(shape.toString());
        System.out.println(cirle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
    }
}
