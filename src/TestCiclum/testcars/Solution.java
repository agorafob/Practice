package TestCiclum.testcars;

public class Solution {
    public static void main(String[] args) {
        Car car = new Car();
        SVU svu = new SVU();
        car.topSpeed();
        svu.topSpeed();
        svu.fuelType();
        car.fuelType();
    }
}
