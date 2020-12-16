public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(){};
    public Rectangle(String color, Boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return width+height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}'+"which is a subclass of"+super.toString();
    }
}
