package design.factory.abstractFac;

public class Concubine implements Hero {
    @Override
    public void name() {
        System.out.println("Concubine name:虞姬");
    }

    @Override
    public void work() {
        System.out.println("Concubine work:ADC");
    }
}
