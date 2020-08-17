package design.builder;

public class CellPhoneDirector {

    private CellPhoneBuder cellPhoneBuder;

    public Mate7 buildMate7(){

        cellPhoneBuder = new Mate7Builder();
        cellPhoneBuder.buildCpu();
        cellPhoneBuder.buildRam();
        return (Mate7) cellPhoneBuder.getPhone();
    }
    public Max4 buildMax4(){

        cellPhoneBuder = new Max4Builder();
        cellPhoneBuder.buildCpu();
        cellPhoneBuder.buildRam();
        CellPhone max4 = cellPhoneBuder.getPhone();
        return (Max4) max4;

    }

}
