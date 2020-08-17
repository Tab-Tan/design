package design.factory.abstractFac;

public class Blue implements HeroFactory{
    @Override
    public ADCHero createADCHero() {
        return new ADCHeroFactory();
    }

    @Override
    public HelperHero createHelperHero() {
        return new HelperHeroFactory();
    }
}
