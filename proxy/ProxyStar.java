package design.proxy;

public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star){
        this.star = star;
    }

    @Override
    public void sing() {
        before("唱歌");
        star.sing();
        after("演唱会");
    }

    @Override
    public void out() {
        before("外出");
        star.out();
        after("运动");
    }

    private void before(String name){
        System.out.println("代理:他要"+name+"了，大家准备好！");
    }

    private void after(String name){
        System.out.println("代理:"+name+"结束了，我来善后。");
    }
}
