package design.factory.methodFac;

public class C180Factory implements BenzFactory{
    @Override
    public Benz createCar() {
        return new BenzC180();
    }
}
