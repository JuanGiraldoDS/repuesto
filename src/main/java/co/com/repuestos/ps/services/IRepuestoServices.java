package co.com.repuestos.ps.services;


import co.com.repuestos.ps.modelo.Repuestos;
import co.com.repuestos.ps.modelo.Repuestos;

import java.util.List;

public interface IRepuestoServices {
    Repuestos guardar(Repuestos repuesto) throws Exception;
    Repuestos consultar(Long id)throws Exception;
    Repuestos actualizar(Repuestos persona)throws Exception;
    Repuestos borrar(long id)throws Exception;
    List<Repuestos> buscarTodos() throws Exception;
}
