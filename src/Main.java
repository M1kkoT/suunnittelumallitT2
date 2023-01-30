
public class Main {
    public static void main(String[] args) {

        FactoryMaker maker = new FactoryMaker();

        PukeutuvaHenkilo jasper = new jasperKoodaaja(maker.getNextFactory());

        jasper.pukeudu();

        jasper.setFactory(maker.getNextFactory());

        jasper.pukeudu();

    }
}