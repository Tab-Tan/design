package design.factory.abstractFac;

public class Red implements HeroFactory{
    @Override
    public ADCHero createADCHero() {
        return new ADCHeroFactory();
    }

    @Override
    public HelperHero createHelperHero() {
        return new HelperHeroFactory();
    }
}
