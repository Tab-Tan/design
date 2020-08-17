package design.proxy;

public class Test {
    public static void main(String[] args) {
        Star smallPig = new SmallPig("小猪");
        ProxyStar proxyStar = new ProxyStar(smallPig);
        proxyStar.sing();
        proxyStar.out();
    }
}
