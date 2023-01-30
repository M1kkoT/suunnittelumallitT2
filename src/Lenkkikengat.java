public class Lenkkikengat implements Kengat{
    private String model;

    public Lenkkikengat(String model){
        this.model= model;
    }

    public String toString(){
        return "Lenkkikengät mallia: " + model;
    }
}
