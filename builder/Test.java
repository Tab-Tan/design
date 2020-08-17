package design.builder;

public class Test {
    public static void main(String[] args) {
        Mate7 mate7 = new CellPhoneDirector().buildMate7();
        Max4 max4 = new CellPhoneDirector().buildMax4();
        System.out.println(mate7);
        System.out.println(max4);
    }
}
