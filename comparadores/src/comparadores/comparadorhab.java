package comparadores;

import java.util.Comparator;

public class comparadorhab implements Comparator{
    provincias numhabitantes1,numhabitantes2;
    int compararhabitantes;
    @Override
    public int compare(Object num1, Object num2) {
        numhabitantes1=(provincias)num1;
        numhabitantes2=(provincias)num2;
        if(numhabitantes1.getNumeroHabitantes()> numhabitantes2.getNumeroHabitantes()){
            compararhabitantes=1;
        }else{
            compararhabitantes=-1;
        }
        
        return compararhabitantes;  
    }
}
