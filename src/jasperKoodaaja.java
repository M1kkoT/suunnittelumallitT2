public class jasperKoodaaja extends PukeutuvaHenkilo{

    public jasperKoodaaja(VaateFactory factory){
        this.factory = factory;
    }
    public void setFactory(VaateFactory factory){
        this.factory = factory;
    }

    public void pukeudu(){
        hattu = factory.makeHattu();
        paita = factory.makePaita();
        housut = factory.makeHousut();
        kengat = factory.makeKengat();
        System.out.println("Jasperilla on päällä " + hattu.toString() + ", " + paita.toString() +
                ", " + housut.toString() + " ja " + kengat.toString());
    }


}
