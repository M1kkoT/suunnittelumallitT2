import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.*;

//bonus
public class FactoryMaker {

    private int luku = 0; //the row of the next factory name in list
    private List<String> lista;  //list of factory names

    public FactoryMaker(){
        this.lista = readNamesFromFile();
    }

    public VaateFactory getNextFactory() {
        if(luku > lista.size() - 1){
            System.out.println("ei enään factoreita");
            return null;
        }
        try{
            String name = lista.get(luku);  //name of the next factory

            //get the class of the factory and create new instance of it
            Class<?> factoryClass = Class.forName(String.format("%s", name));
            Constructor<?> con = factoryClass.getConstructor();

            VaateFactory factory = (VaateFactory) con.newInstance();
            luku++;
            return factory;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;

    }


    public List<String> readNamesFromFile(){

        ArrayList<String> names = new ArrayList<>();

        try (FileReader tiedosto = new FileReader("src/factorynames.txt");
             BufferedReader br = new BufferedReader(tiedosto))
        {
            String rivi = br.readLine();
            while (rivi != null) {
                names.add(rivi);
                rivi = br.readLine();
            }

        }
        catch (IOException e) {
            System.err.println("Poikkeus tiedoston käsittelyssä");
        }

        return names;

    }





}
