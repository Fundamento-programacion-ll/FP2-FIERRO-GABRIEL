
package comparadores;

public class Comparadores {
    public static void main(String[] args) {
        // TODO code application logic here
        String salida="";
        pais p  = new pais();
        p.setListaProvincias();
        salida += "Lista Provincias: \n"+p.toString();
        System.out.println(salida);
        
        p.ordenarPorNombreProvincia();
        salida += "Lista Provincias: \n"+p.toString();
        System.out.println(salida);
        System.out.println("-----------");
        p.ordenarpornumero();
        salida += "Lista habitantes: \n"+p.toString();
        System.out.println(salida);       
    } 
}
