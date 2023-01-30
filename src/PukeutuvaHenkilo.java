public abstract class PukeutuvaHenkilo {

    VaateFactory factory = null;
    Housut housut = null;
    Paita paita = null;
    Kengat kengat = null;
    Hattu hattu = null;

    public abstract void setFactory(VaateFactory factory);

    public abstract void pukeudu();

}
