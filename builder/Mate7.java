package design.builder;

public class Mate7 extends CellPhone {

    public Mate7(){
        System.out.println("这是 Mate 7");
    }

    @Override
    public String toString(){
        return "Mate7 具体配置：CPU:"+this.getCpu()+" RAM:"+this.getRam();
    }

}
