package design.proxy;

public class SmallPig implements Star {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SmallPig(String name){
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println("小猪:转角月到爱~");
    }

    @Override
    public void out() {
        System.out.println("小猪:我要外出了，你懂的~");
    }
}
