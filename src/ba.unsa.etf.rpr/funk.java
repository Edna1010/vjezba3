package ba.unsa.etf.rpr;

import java.util.List;

public class funk {
    public static Double srednja(List<Integer> L){
        Integer suma=0;
        Integer brojac=0;
        for(int i=0; i<L.size();i++){
            suma= suma + L.get(i);
        }
        Double srednja= suma.doubleValue()/L.size();
        return srednja;
    }
}
