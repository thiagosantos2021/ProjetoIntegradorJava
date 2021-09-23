package dao;

import model.ModelFuncionario;
import conect.ConexaoMySQL;
import java.util.ArrayList;
/**
*
* @author Thiago 
*/
public class DAOFuncionario extends ConexaoMySQL {

    /**
    * grava Funcionario
    * @param pModelFuncionario
    * @return int
    */
    public int salvarFuncionarioDAO(ModelFuncionario pModelFuncionario){
        try {
            this.Conectar();
            return this.insertSQL(
                "INSERT INTO tbl_funcionario ("
                    + "nome_func,"
                    + "login_func,"
                    + "senha_func"
                + ") VALUES ("
                    + "'" + pModelFuncionario.getNome_func() + "',"
                    + "'" + pModelFuncionario.getLogin_func() + "',"
                    + "'" + pModelFuncionario.getSenha_func() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Funcionario
    * @param pId_func
    * @return ModelFuncionario
    */
    public ModelFuncionario getFuncionarioDAO(int pId_func){
        ModelFuncionario modelFuncionario = new ModelFuncionario();
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_func,"
                    + "nome_func,"
                    + "login_func,"
                    + "senha_func"
                 + " FROM"
                     + " tbl_funcionario"
                 + " WHERE"
                     + " id_func = '" + pId_func + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFuncionario.setId_func(this.getResultSet().getInt(1));
                modelFuncionario.setNome_func(this.getResultSet().getString(2));
                modelFuncionario.setLogin_func(this.getResultSet().getString(3));
                modelFuncionario.setSenha_func(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFuncionario;
    }

    /**
    * recupera uma lista de Funcionario
        * @return ArrayList
    */
    public ArrayList<ModelFuncionario> getListaFuncionarioDAO(){
        ArrayList<ModelFuncionario> listamodelFuncionario = new ArrayList();
        ModelFuncionario modelFuncionario = new ModelFuncionario();
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_func,"
                    + "nome_func,"
                    + "login_func,"
                    + "senha_func"
                 + " FROM"
                     + " tbl_funcionario"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFuncionario = new ModelFuncionario();
                modelFuncionario.setId_func(this.getResultSet().getInt(1));
                modelFuncionario.setNome_func(this.getResultSet().getString(2));
                modelFuncionario.setLogin_func(this.getResultSet().getString(3));
                modelFuncionario.setSenha_func(this.getResultSet().getString(4));
                listamodelFuncionario.add(modelFuncionario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFuncionario;
    }

    /**
    * atualiza Funcionario
    * @param pModelFuncionario
    * @return boolean
    */
    public boolean atualizarFuncionarioDAO(ModelFuncionario pModelFuncionario){
        try {
            this.Conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_funcionario SET "
                    + "id_func = '" + pModelFuncionario.getId_func() + "',"
                    + "nome_func = '" + pModelFuncionario.getNome_func() + "',"
                    + "login_func = '" + pModelFuncionario.getLogin_func() + "',"
                    + "senha_func = '" + pModelFuncionario.getSenha_func() + "'"
                + " WHERE "
                    + "id_func = '" + pModelFuncionario.getId_func() + "'"
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
    * exclui Funcionario
    * @param pId_func
    * @return boolean
    */
    public boolean excluirFuncionarioDAO(int pId_func){
        try {
            this.Conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_funcionario "
                + " WHERE "
                    + "id_func = '" + pId_func + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    //Validar o login e a senha do funcionário 
    public boolean getValidarFuncionarioDAO(ModelFuncionario pModelFuncionario) {
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_func,"
                    + "nome_func,"
                    + "login_func,"
                    + "senha_func"
                 + " FROM"
                     + " tbl_funcionario"
                 + " WHERE"
                     + " login_func = '" + pModelFuncionario.getLogin_func() + "' AND senha_func = '" + pModelFuncionario.getSenha_func()+ "'"
                + ";"
            );
            if(getResultSet().next()){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    /**
    * recupera Funcionario
    * @param pLogin
    * @return ModelFuncionario
    */
    public ModelFuncionario getFuncionarioDAO(String pLogin){
        ModelFuncionario modelFuncionario = new ModelFuncionario();
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_func,"
                    + "nome_func,"
                    + "login_func,"
                    + "senha_func"
                 + " FROM"
                     + " tbl_funcionario"
                 + " WHERE"
                     + " login_func = '" + pLogin + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFuncionario.setId_func(this.getResultSet().getInt(1));
                modelFuncionario.setNome_func(this.getResultSet().getString(2));
                modelFuncionario.setLogin_func(this.getResultSet().getString(3));
                modelFuncionario.setSenha_func(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFuncionario;
    }
}