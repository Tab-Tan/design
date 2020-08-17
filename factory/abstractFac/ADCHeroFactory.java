package design.factory.abstractFac;

public class ADCHeroFactory implements ADCHero {
    @Override
    public Hero getADCHero() {
        return new Concubine();
    }
}
