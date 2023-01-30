public class BossVaateFactory implements VaateFactory {
    @Override
    public Hattu makeHattu() {
        return new Lippis("Boss");
    }

    @Override
    public Housut makeHousut() {
        return new Farkut("Boss");
    }

    @Override
    public Paita makePaita() {
        return new Tpaita("Boss");
    }

    @Override
    public Kengat makeKengat() {
        return new Lenkkikengat("Boss");
    }
}
