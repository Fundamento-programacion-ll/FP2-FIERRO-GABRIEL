
import java.util.Scanner;


public class calculo {
    int n;   
    int numero;
    int acum=2;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public calculo(int n) {
        this.n = 0;
    }


    
    public int calculodeserie(int numero){
        int acum=2;
        
        for (int i = 0; i < this.n; i++) {
            acum=acum*2;
        }
        
        return acum;       
    }  
}
