package design.builder;

public class Max4 extends CellPhone {

    public Max4(){
        System.out.println("这是 Max 4");
    }

    @Override
    public String toString(){
        return "Max4 具体配置：CPU:"+this.getCpu()+" RAM:"+this.getRam();
    }

}