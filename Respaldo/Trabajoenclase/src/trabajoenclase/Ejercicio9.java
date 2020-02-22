
package trabajoenclase;

public class Ejercicio9 {
    int media;
    int mayor;
    public void media(int notas[],int i,int n,int cont,int acum){
        for(i=0;i<n; i++){
           if(notas[i]!=0){
               media=acum/cont;
           }
        }
    }
    public void mayormedia(int notas[],int i,int n,int cont,int acum){
        for(i=0;i<n; i++){
           if(notas[i]>media){
               mayor=notas[i];
           }
        }
    }
    public int Resultado(){
        return media;
    }
    public int Mayor(){
        return mayor;
    }
}
