package design.chain;

public class Test {
    public static void main(String[] args) {
        Masters san = new Masters("唐三", 22, 84);
        System.out.println("魂师唐三就位，准备鉴定...");
        UserD d = new UserD(new UserC(new UserB(new UserA(null))));
        System.out.println("四位鉴定师就位，开始鉴定...");
        d.chain(san.getLevel());
        Masters wu = new Masters("小舞",22,75);
        System.out.println("魂师小舞就位，准备鉴定...");
        d.chain(wu.getLevel());
    }
}
