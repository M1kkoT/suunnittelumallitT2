public class AdidasVaateFactory implements VaateFactory {
    @Override
    public Hattu makeHattu() {
        return new Lippis("Adidas");
    }

    @Override
    public Housut makeHousut() {
        return new Farkut("Adidas");
    }

    @Override
    public Paita makePaita() {
        return new Tpaita("Adidas");
    }

    @Override
    public Kengat makeKengat() {
        return new Lenkkikengat("Adidas");
    }
}
