package design.factory.abstractFac;

public class HelperHeroFactory implements HelperHero {
    @Override
    public Hero getHelperHero() {
        return new Yao();
    }
}
