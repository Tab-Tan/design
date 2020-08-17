package design.template;

public abstract class Block {

    private int time;
    private int money;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Block(int time, int money){
        this.money = money;
        this.time = time;
    }
    //基本方法
    public abstract int time();

    public abstract int money();
    //模板方法

    public void completed(){
        int time = time();
        int money = money();
        System.out.println("花费时间:"+time+"天 资金:"+money+"万。");
    }
}
