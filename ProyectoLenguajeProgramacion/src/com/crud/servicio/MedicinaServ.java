
package com.crud.servicio;

import com.crud.dao.MedicinaMetodos;
import com.crud.modelo.Medicina;
import java.util.List;

public class MedicinaServ {
     public static List<Medicina> ListarMedicina(){
        return new MedicinaMetodos().ListarMedicina();
    }
     
      public static Medicina BuscarMedicinaCod(String cod) {
        return new MedicinaMetodos().BuscarMedicinaCod(cod);
    }  
}
