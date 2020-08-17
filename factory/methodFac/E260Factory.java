package design.factory.methodFac;

public class E260Factory implements BenzFactory {
    @Override
    public Benz createCar() {
        return new BenzE260();
    }
}
