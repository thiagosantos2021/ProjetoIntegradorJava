package dao;

import model.ModelCliente;
import conect.ConexaoMySQL;
import java.util.ArrayList;

/**
* @author Thiago 
*/

public class DAOCliente extends ConexaoMySQL {

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.Conectar();
            return this.insertSQL("INSERT INTO tbl_cliente (" + "cli_nome," + "cli_endereco," + "cli_bairro," + "cli_cidade,"
                    + "cli_uf," + "cli_cep," + "cli_telefone" + ") VALUES (" + "'" + pModelCliente.getCli_nome() + "',"
                    + "'" + pModelCliente.getCli_endereco() + "'," + "'" + pModelCliente.getCli_bairro() + "',"
                    + "'" + pModelCliente.getCli_cidade() + "'," + "'" + pModelCliente.getCli_uf() + "',"
                    + "'" + pModelCliente.getCli_cep() + "'," + "'" + pModelCliente.getCli_telefone() + "'" + ");");
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Cliente
    * @param pId_cliente
    * @return ModelCliente
    */
    public ModelCliente getClienteDAO(int pId_cliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " id_cliente = '" + pId_cliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setId_cliente(this.getResultSet().getInt(1));
                modelCliente.setCli_nome(this.getResultSet().getString(2));
                modelCliente.setCli_endereco(this.getResultSet().getString(3));
                modelCliente.setCli_bairro(this.getResultSet().getString(4));
                modelCliente.setCli_cidade(this.getResultSet().getString(5));
                modelCliente.setCli_uf(this.getResultSet().getString(6));
                modelCliente.setCli_cep(this.getResultSet().getString(7));
                modelCliente.setCli_telefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
    * recupera uma lista de Cliente
        * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                 + " FROM"
                     + " tbl_cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setId_cliente(this.getResultSet().getInt(1));
                modelCliente.setCli_nome(this.getResultSet().getString(2));
                modelCliente.setCli_endereco(this.getResultSet().getString(3));
                modelCliente.setCli_bairro(this.getResultSet().getString(4));
                modelCliente.setCli_cidade(this.getResultSet().getString(5));
                modelCliente.setCli_uf(this.getResultSet().getString(6));
                modelCliente.setCli_cep(this.getResultSet().getString(7));
                modelCliente.setCli_telefone(this.getResultSet().getString(8));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.Conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_cliente SET "
                    + "id_cliente = '" + pModelCliente.getId_cliente() + "',"
                    + "cli_nome = '" + pModelCliente.getCli_nome() + "',"
                    + "cli_endereco = '" + pModelCliente.getCli_endereco() + "',"
                    + "cli_bairro = '" + pModelCliente.getCli_bairro() + "',"
                    + "cli_cidade = '" + pModelCliente.getCli_cidade() + "',"
                    + "cli_uf = '" + pModelCliente.getCli_uf() + "',"
                    + "cli_cep = '" + pModelCliente.getCli_cep() + "',"
                    + "cli_telefone = '" + pModelCliente.getCli_telefone() + "'"
                + " WHERE "
                    + "id_cliente = '" + pModelCliente.getId_cliente() + "'"
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
    * exclui Cliente
    * @param pId_cliente
    * @return boolean
    */
    public boolean excluirClienteDAO(int pId_cliente){
        try {
            this.Conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_cliente "
                + " WHERE "
                    + "id_cliente = '" + pId_cliente + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public ModelCliente getClienteDAO(String pNomeCliente) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " cli_nome = '" + pNomeCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setId_cliente(this.getResultSet().getInt(1));
                modelCliente.setCli_nome(this.getResultSet().getString(2));
                modelCliente.setCli_endereco(this.getResultSet().getString(3));
                modelCliente.setCli_bairro(this.getResultSet().getString(4));
                modelCliente.setCli_cidade(this.getResultSet().getString(5));
                modelCliente.setCli_uf(this.getResultSet().getString(6));
                modelCliente.setCli_cep(this.getResultSet().getString(7));
                modelCliente.setCli_telefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
}