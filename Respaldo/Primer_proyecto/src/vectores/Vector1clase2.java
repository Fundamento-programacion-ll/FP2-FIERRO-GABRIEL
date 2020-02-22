
package vectores;

public class Vector1clase2 {
    int mayor=0;
    String mayornombre="";
    
    public void edadmayor(int []edad, String [] nombres,int n){
        for(int i=0;i<n; i++){
           if(mayor<edad[i]){
           mayor=edad[i];
           mayornombre=nombres[i];
    }
    }
}
    
    public String resultado(){
        return"La persona con mayor edad es: "+mayornombre+" y su edad es: "+mayor;
    }
}