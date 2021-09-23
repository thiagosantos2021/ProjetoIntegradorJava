package model;

import java.util.ArrayList;

/**
 * @author Thiago
 */

public class ModelVendasCliente {
    
    private ModelVendas modelVendas;
    private ModelCliente modelCliente;
    ArrayList<ModelVendasCliente> listaModelVendasCliente;

    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    public ArrayList<ModelVendasCliente> getListaModelVendasCliente() {
        return listaModelVendasCliente;
    }

    public void setListaModelVendasCliente(ArrayList<ModelVendasCliente> listaModelVendasCliente) {
        this.listaModelVendasCliente = listaModelVendasCliente;
    }
}
