package controller;

import dao.DAOVendasCliente;
import java.util.ArrayList;
import model.ModelVendasCliente;

/**
 *
 * @author Thiago
 */
public class ControllerVendasCliente {
    
    private DAOVendasCliente daoVendasCliente = new DAOVendasCliente();

    public ArrayList<ModelVendasCliente> getListaVendasClienteController() {
        return this.daoVendasCliente.getListaVendasClienteDAO();
    }
}
