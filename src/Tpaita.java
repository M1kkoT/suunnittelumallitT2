public class Tpaita implements Paita{
    private String model;

    public Tpaita(String model){
        this.model= model;
    }

    public String toString(){
        return "Tpaita mallia: " + model;
    }
}
