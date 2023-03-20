package model;

public class MainModel {

    public MainModel() {
    }
    public double calcRadius (double side, double alpha){
        double alphaRad = alpha * Math.PI /180;
        double radius = 1./2 * side * Math.sin(alphaRad);
        return radius;
    }
}
