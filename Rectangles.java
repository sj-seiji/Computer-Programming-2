/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * M1: Class and Object Lab
 */
public class Rectangles {
    public double width, height;

    //default constructor
    public Rectangles(){

    }

    //constructor with parameters
    public Rectangles(double w, double h) {
        this.width = w;
        this.height = h;

    }

    //mutator
    public void setWidth(double newWidth){
        if(newWidth <= 0){
            System.out.println("A rectangle can't have 0 width. Try again");
            System.exit(0);
        }
        width = newWidth;
    }
    public void setHeight(double newHeight){
        if(newHeight <= 0){
            System.out.println("A rectangle can't have 0 height. Try again");
            System.exit(0);
        }
        height = newHeight;

    }
    //accessor
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    public double CalculateArea(){
        double area = this.width * this.height;
        return area;
    }
    public double CalculateParameters(){
        double parameter = (this.width + this.height) *2;
        return parameter;

    }

    public String toString(){
        String s = "";
        s += "What is the width of the Rectangle: " + this.width + "\n";
        s += "What is the height of the Rectangle: " + this.height;
        return s;
    }

    public static void main(String[] args) {
        Rectangles r1 = new Rectangles();
        r1.setWidth(1.0);
        r1.setHeight(1.0);

        Rectangles r2 = new Rectangles(4.0, 40.0);

        //print out rectangle 1
        System.out.println("Rectangle 1 info:");
        System.out.println(r1.toString());
        System.out.println("The area of the rectangle is: " + r1.CalculateArea());

        //print out rectangle 2
        System.out.println();
        System.out.println("Rectangle 2 info: ");
        System.out.println(r2.toString());
        System.out.println("The parameter of the rectangle is: " + r2.CalculateParameters());
        
    }

}
