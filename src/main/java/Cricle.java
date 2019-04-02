public class Cricle extends Shape  {
    double r;
    Cricle(double r){
        this.r = r;
    }

    public double getR() {
        return r;
    }
    public double getArea(){
        return getR()*getR()*Math.PI;
    }

    @Override
    public String toString() {
        return "Cricle r = "+ getR() + " Area = "+ getArea();
    }
}
