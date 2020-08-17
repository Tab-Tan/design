package design.builder;

public class Max4Builder implements CellPhoneBuder {

    Max4 max4 = new Max4();

    @Override
    public void buildCpu() {
        max4.setCpu("三星芯片，呱呱叫~");
    }

    @Override
    public void buildRam() {
        max4.setRam("4G内存，爱用不用~");
    }

    @Override
    public CellPhone getPhone() {
        return max4;
    }
}
