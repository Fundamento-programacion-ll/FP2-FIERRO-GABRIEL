/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

/**
 *
 * @author SISTEMAS CORP
 */
public class Comparadores {

    /**
     * @param args the command line arguments
     */
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
