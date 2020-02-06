
package Comparadores;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class pais {
    private ArrayList <provincia> listaProvincias;

    public ArrayList<provincia> getListaProvincias() {
        return listaProvincias;
    }

    public void setListaProvincias(ArrayList<provincia> listaProvincias) {
        int opcion ;
        provincia pro;
        do {            
            pro = new provincia();
            agregarProvincia(pro);
            opcion = JOptionPane.showConfirmDialog(null, "Mas Provincias", "Continuar",JOptionPane.YES_NO_CANCEL_OPTION);
        } while (opcion==JOptionPane.YES_NO_CANCEL_OPTION);
    }

    public pais() {
        this.listaProvincias=new ArrayList<>();
    }

    public pais(ArrayList<provincia> listaProvincias) {
        this.listaProvincias = listaProvincias;
    }
    
    public void agregarProvincia(provincia pro){
        this.listaProvincias.add(pro);
    }
    @Override
    public String toString(){
        return null;
        
    }
}
