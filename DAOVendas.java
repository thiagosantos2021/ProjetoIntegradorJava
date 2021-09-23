package DAO;

import model.ModelVendas;
import conect.ConexaoMySQL;
import java.util.ArrayList;
import java.sql.Date;

/**
* @author Thiago 
*/
public class DAOVendas extends ConexaoMySQL {

    /**
    * grava Vendas
    * @param pModelVendas
    * @return int
    */
    public int salvarVendasDAO(ModelVendas pModelVendas){
        try {
            this.Conectar();
            return this.insertSQL(
                "INSERT INTO tbl_vendas (" + "fk_cliente," + "data_venda," + "valor_liquido," + "valor_bruto,"
                    + "vendas_desconto" + ") VALUES ("
                    + "'" + pModelVendas.getFk_cliente() + "',"
                    + "'" + pModelVendas.getData_venda() + "',"
                    + "'" + pModelVendas.getValor_liquido() + "',"
                    + "'" + pModelVendas.getValor_bruto() + "',"
                    + "'" + pModelVendas.getVendas_desconto() + "'"
                + ");");
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Vendas
    * @param pId_vendas
    * @return ModelVendas
    */
    public ModelVendas getVendasDAO(int pId_vendas){
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_vendas,"
                    + "fk_cliente,"
                    + "data_venda,"
                    + "valor_liquido,"
                    + "valor_bruto,"
                    + "vendas_desconto"
                 + " FROM"
                     + " tbl_vendas"
                 + " WHERE"
                     + " id_vendas = '" + pId_vendas + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas.setId_vendas(this.getResultSet().getInt(1));
                modelVendas.setFk_cliente(this.getResultSet().getInt(2));
                modelVendas.setData_venda(this.getResultSet().getDate(3));
                modelVendas.setValor_liquido(this.getResultSet().getDouble(4));
                modelVendas.setValor_bruto(this.getResultSet().getDouble(5));
                modelVendas.setVendas_desconto(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendas;
    }

    /**
    * recupera uma lista de Vendas
        * @return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasDAO(){
        ArrayList<ModelVendas> listamodelVendas = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_vendas,"
                    + "fk_cliente,"
                    + "data_venda,"
                    + "valor_liquido,"
                    + "valor_bruto,"
                    + "vendas_desconto"
                 + " FROM"
                     + " tbl_vendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelVendas.setId_vendas(this.getResultSet().getInt(1));
                modelVendas.setFk_cliente(this.getResultSet().getInt(2));
                modelVendas.setData_venda(this.getResultSet().getDate(3));
                modelVendas.setValor_liquido(this.getResultSet().getDouble(4));
                modelVendas.setValor_bruto(this.getResultSet().getDouble(5));
                modelVendas.setVendas_desconto(this.getResultSet().getDouble(6));
                listamodelVendas.add(modelVendas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendas;
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * @return boolean
    */
    public boolean atualizarVendasDAO(ModelVendas pModelVendas){
        try {
            this.Conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_vendas SET "
                    + "id_vendas = '" + pModelVendas.getId_vendas() + "',"
                    + "fk_cliente = '" + pModelVendas.getFk_cliente() + "',"
                    + "data_venda = '" + pModelVendas.getData_venda() + "',"
                    + "valor_liquido = '" + pModelVendas.getValor_liquido() + "',"
                    + "valor_bruto = '" + pModelVendas.getValor_bruto() + "',"
                    + "vendas_desconto = '" + pModelVendas.getVendas_desconto() + "'"
                + " WHERE "
                    + "id_vendas = '" + pModelVendas.getId_vendas() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Vendas
    * @param pId_vendas
    * @return boolean
    */
    public boolean excluirVendasDAO(int pId_vendas){
        try {
            this.Conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendas "
                + " WHERE "
                    + "id_vendas = '" + pId_vendas + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}