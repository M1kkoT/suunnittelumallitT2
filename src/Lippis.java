public class Lippis implements Hattu{
    private String model;

    public Lippis(String model){
        this.model= model;
    }

    public String toString(){
        return "Lippis mallia: " + model;
    }
}
