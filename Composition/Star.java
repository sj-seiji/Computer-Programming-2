/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * Homework Assignment #1: Composition
 */

public class Star {
    private String name;
    private double diameter;
    private int age;
    private double surfaceTemp;

    //fully loaded constructor
    public Star(String n, double d, int a, double s){
        this.name = n;
        this.diameter = d;
        this.age = a;
        this.surfaceTemp = s;

    }
    //copy constructor
    public Star(Star s){
        if(s == null || s.name.equals("")|| s.diameter <= 0.0 ||s.age <=0 || s.surfaceTemp <= 0.0){
            System.out.println("Invalid data entry. Please check your data");
        }
        this.name = s.name;
        this.diameter = s.diameter;
        this.age = s.age;
        this.surfaceTemp = s.surfaceTemp;
    }
    //mutators
    public void setName(String newName){
        this.name = newName;
    }
    public void setDiameter(double newDiameter){
        this.diameter = newDiameter;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setSurfaceTemp(double newSurfaceTemp){
        this.surfaceTemp = newSurfaceTemp;
    }
    //accessors
    public String getName(){
        return this.name;
    }
    public double getDiameter(){
        return this.diameter;
    }
    public int getAge(){
        return this.age;
    }
    public double getSurfaceTemp(){
        return this.surfaceTemp;
    }
    //toString method for the Star class (print data in the console)
    public String toString(){
        return "\n Name of the Star: " + this.name + "\n Diameter: " + this.diameter + " millions miles"+
                "\n Age in millions: " + this.age + "\n Surface Temperature in C: " + this.surfaceTemp;
    }

}
class Galaxy {
    private String nameOfGalaxy;
    private int numOfStars;
    private double diameterOfGalaxy;
    private Star [] stars;

    //no-arg constructor
    public Galaxy(){

    }
    //fully loaded constructor
    public Galaxy(String n, int numStar, double d, Star[]stars){
        this.nameOfGalaxy = n;
        this.numOfStars = numStar;
        this.diameterOfGalaxy = d;
        this.stars = new Star[stars.length];

        for(int i = 0; i < stars.length; i++){
            this.stars[i] = new Star(stars[i]);
        }
    }
    //mutators
    public void setNameOfGalaxy(String newName){
        this.nameOfGalaxy = newName;
    }
    public void setNumOfStars(int NewNumStar){
        this.numOfStars = NewNumStar;
    }
    public void setDiameterOfGalaxy(double newDiameter){
        this.diameterOfGalaxy = newDiameter;
    }
    public void setStars(Star[]stars){
        this.stars = new Star[stars.length];
        for(int j = 0; j < stars.length; j++){
            this.stars[j] = new Star(stars[j]);
        }
    }
    //accessors
    public String getNameOfGalaxy(){
        return this.nameOfGalaxy;
    }
    public int getNumOfStars(){
        return this.numOfStars;
    }
    public double getDiameterOfGalaxy(){
        return  this.diameterOfGalaxy;
    }
    public Star[] getStars(){
        Star[] temp = new Star[this.stars.length];
        for(int k = 0; k < temp.length; k++){
            temp[k] = new Star(this.stars[k]);
        }
        return temp;
    }
    //toString method for the galaxy class (print data in the console)
    public String toString(){
        String s = "";
        s += "\nName of the Galaxy: " + this.nameOfGalaxy ;
        s += "\n Number of stars: " + this.numOfStars + " thousand million";
        s += "\n Diameter in light years: " + this.diameterOfGalaxy;
        s += "\n\nList of Stars in the Galaxy: ";

        for(int i= 0; i < this.stars.length; i++ ){
            s += "\nStar #" + (i+1) + " Info: " + this.stars[i].toString() + "\n";
        }
        return s;
    }
}
//Driver class that has the main method to run the code
class MainDriver{
    public static void main(String[] args) {
        //create an array of stars
        Star[] listOfStars = new Star[3];
        listOfStars[0] = new Star("Sirius", 2.1, 237, 10.00);
        listOfStars[1] = new Star("Rigel", 4.3, 402, 18.00);
        listOfStars[2] = new Star("Altair", 1.3, 201, 4.00);

        //create 1 galaxy
        Galaxy g1 = new Galaxy("Milky Way", 100, 100.00, listOfStars);
        System.out.println(g1.toString()); //print

    }

}

