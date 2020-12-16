public class Square extends Shape {
    private double size;
    public Square(){
    }

    public Square(String color, Boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public double getArea(){
        return size*size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}'+"which is a subclass of"+super.toString();
    }
}
