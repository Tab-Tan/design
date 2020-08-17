package design.builder;

public class Mate7Builder implements CellPhoneBuder {

    Mate7 mate7 = new Mate7();

    @Override
    public void buildCpu() {
        mate7.setCpu("华为芯片，你值得拥有~");
    }

    @Override
    public void buildRam() {
        mate7.setRam("8G内存，够劲~");
    }

    @Override
    public CellPhone getPhone() {
        return mate7;
    }
}
