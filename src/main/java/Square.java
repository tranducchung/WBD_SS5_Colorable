public class Square extends Shape  implements Colorable{
    double lenght;
    Square(double lenght){
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }
    public double getArea (){
        return getLenght()*getLenght();
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "Square length = "+ getLenght() + " Area = " + getArea();
    }
}