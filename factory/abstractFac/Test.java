package design.factory.abstractFac;

public class Test {
    public static void main(String[] args) {
        HeroFactory red = new Red();
        Hero adcHero = red.createADCHero().getADCHero();
        adcHero.name();
        adcHero.work();
        Hero helperHero = red.createHelperHero().getHelperHero();
        helperHero.name();
        helperHero.work();
    }
}
