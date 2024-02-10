package TestCiclum.carengine;

public class Solution {
    public static void main(String[] args) {
        Car car = new Car();
        car.printTopSpeed();
        car.printTopSpeed(200);
        car.printTopSpeed("BMW",220);
        car.printTopSpeed(300);
    }
}
