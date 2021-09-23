package dao;

import conect.ConexaoMySQL;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelVendas;
import model.ModelVendasCliente;

/**
 * @author Thiago
 */

public class DAOVendasCliente extends ConexaoMySQL{
    public ArrayList<ModelVendasCliente> getListaVendasClienteDAO(){
        
     ArrayList<ModelVendasCliente> listamodelVendasCliente = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendasCliente modelVendasCliente = new ModelVendasCliente();
        
        try {
            this.Conectar();
            this.executarSQL("SELECT * FROM tbl_vendas INNER JOIN tbl_cliente ON tbl_cliente.id_cliente = tbl_vendas.fk_cliente");
            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelCliente = new ModelCliente();
                modelVendasCliente = new ModelVendasCliente();
                
                modelVendas.setId_vendas(this.getResultSet().getInt(1));
                modelVendas.setFk_cliente(this.getResultSet().getInt(2));
                modelVendas.setData_venda(this.getResultSet().getDate(3));
                modelVendas.setValor_liquido(this.getResultSet().getDouble(4));
                modelVendas.setValor_bruto(this.getResultSet().getDouble(5));
                modelVendas.setVendas_desconto(this.getResultSet().getDouble(6));
                
                modelCliente.setId_cliente(this.getResultSet().getInt(7));
                modelCliente.setCli_nome(this.getResultSet().getString(8));
                modelCliente.setCli_endereco(this.getResultSet().getString(9));
                modelCliente.setCli_bairro(this.getResultSet().getString(10));
                modelCliente.setCli_cidade(this.getResultSet().getString(11));
                modelCliente.setCli_uf(this.getResultSet().getString(12));
                modelCliente.setCli_cep(this.getResultSet().getString(13));
                modelCliente.setCli_telefone(this.getResultSet().getString(14));
               
                modelVendasCliente.setModelVendas(modelVendas);
                modelVendasCliente.setModelCliente(modelCliente);
                
                listamodelVendasCliente.add(modelVendasCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasCliente;
    }
}
