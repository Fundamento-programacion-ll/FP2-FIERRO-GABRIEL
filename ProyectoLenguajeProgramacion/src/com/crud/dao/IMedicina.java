
package com.crud.dao;

import com.crud.modelo.Medicina;
import java.util.List;

public interface IMedicina {
    
    
    public List<Medicina> ListarMedicina();
    
    public Medicina BuscarMedicinaCod(String cod);
}
