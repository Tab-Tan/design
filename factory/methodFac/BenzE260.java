package design.factory.methodFac;

public class BenzE260 implements Benz {
    @Override
    public void carColor() {
        System.out.println("BenzE260 carColor:black");
    }

    @Override
    public void carSpeed() {
        System.out.println("BenzE260 carSpeed:300");
    }

    @Override
    public void carPrice() {
        System.out.println("BenzE260 carPrice:210k");
    }
}
