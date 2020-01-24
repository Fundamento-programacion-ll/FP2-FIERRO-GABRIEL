
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class vector {
    private int vector[];

    public int[] getVector() {
        return vector;
    }

    public vector(){
    }
    
    public vector(int[] vector){
        super();
        this.vector=vector;
    }
    
    public vector(int dimension){
        super();
        this.vector=new int[dimension];
        this.setVector();
    }
    
    public void setVector() {
        //this.vector = vector;
        String datosVector;
        datosVector = JOptionPane.showInputDialog(null,"Ingrese los valores separados");
        StringTokenizer tokkens= new StringTokenizer(datosVector, ",");//datos,separados        
        
        for (int i = 0; i < this.vector.length && tokkens.hasMoreTokens(); i++) {
            this.vector[i]= Integer.parseInt(tokkens.nextToken());
        }
    }
    
    public boolean primo(int numero){
        int aux=2;
//        for (int i = 2; i < numero; i++) {
//            aux=numero%i;
//            if(aux==0){
//                return true;
//            }
//        }
        while(aux!=numero){
            if (numero%aux==0){
                return false;
            }
            aux++;
        }
        return true;      
    }
    
    public String totalprimos(){
        String contador="";
        
        for (int i = 0; i < this.vector.length; i++) {
            //primo(this.vector[i]);
            //contador+="Numero primo: "+ this.vector[i];
            if(primo(this.vector[i])){
               contador+="\n"+"Numero primo"+this.vector[i]+"\n";   
            }
        }
        return contador;
    }
    
    @Override
    public String toString(){
        return "vector:" + Arrays.toString(vector);
    }
}
