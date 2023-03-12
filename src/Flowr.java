import java.util.HashMap;
import java.util.Map;

public class Flowr {
    int state = 0;

    private HashMap<Integer, String> capitalCities = new HashMap<Integer, String>();

    public void putData(Integer indice, String cadena){
        capitalCities.put( indice , cadena );
    }

    public void initializeVars(){
        putData(1, "       \n"+
                                "       \n"+
                                "       \n"+
                                " _____ \n");

        putData(2, "       \n"+
                                "       \n"+
                                "       \n"+
                                " __|__ \n");

        putData(3, "       \n"+
                                "       \n"+
                                "   |   \n"+
                                " __|__ \n");

        putData(4, "       \n"+
                                "   o   \n"+
                                "   |   \n"+
                                " __|__ \n");

        putData(5, "   v   \n"+
                                "  >o<  \n"+
                                "   |   \n"+
                                " __|__ \n");

    }

    public String getPlants(Integer i){
        return capitalCities.get( i );
    }

}
