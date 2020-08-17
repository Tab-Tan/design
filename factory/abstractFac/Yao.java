package design.factory.abstractFac;

public class Yao implements Hero {
    @Override
    public void name() {
        System.out.println("Yao name:瑶");
    }

    @Override
    public void work() {
        System.out.println("Yao work:辅助");
    }
}
