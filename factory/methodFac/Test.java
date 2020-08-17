package design.factory.methodFac;

public class Test {
    public static void main(String[] args) {
        Benz car = new C180Factory().createCar();
        car.carColor();
        car.carPrice();
        car.carSpeed();
        Benz car1 = new E260Factory().createCar();
        car1.carColor();
        car1.carPrice();
        car1.carSpeed();
    }
}
