package design.template;

public class HenDa extends Block {
    public HenDa(int time, int money) {
        super(time, money);
    }

    @Override
    public int time() {
        return this.getTime();
    }

    @Override
    public int money() {
        return this.getMoney();
    }

}
