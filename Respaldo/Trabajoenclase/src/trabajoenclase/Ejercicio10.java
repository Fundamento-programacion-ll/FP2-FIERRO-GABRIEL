
package trabajoenclase;

public class Ejercicio10 {
    String suma;
    public void suma(int numero[][],int i,int j,int f,int c){
        for( i=0;i<f;i++){
            for(j=0;j<c;j++){
                if (i == j) {
                suma=numero[i][j]+" ";
                }
            }
        } 
    }
    public String Resultado(){
        return suma;
    }
}
