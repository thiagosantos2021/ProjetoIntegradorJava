package DAO;

import model.ModelFormaPagamento;
import conect.ConexaoMySQL;
import java.util.ArrayList;
/**
*
* @author Thiago 
*/
public class DAOFormaPagamento extends ConexaoMySQL {

    /**
    * grava FormaPagamento
    * @param pModelFormaPagamento
    * @return int
    */
    public int salvarFormaPagamentoDAO(ModelFormaPagamento pModelFormaPagamento){
        try {
            this.Conectar();
            return this.insertSQL(
                "INSERT INTO tbl_forma_pagamento ("
                    + "id_forma_pagamento,"
                    + "descricao_forma_pag,"
                    + "desconto_forma_pag,"
                    + "quant_parcelas,"
                    + "situacao"
                + ") VALUES ("
                    + "'" + pModelFormaPagamento.getId_forma_pag() + "',"
                    + "'" + pModelFormaPagamento.getDescricao_forma_pag() + "',"
                    + "'" + pModelFormaPagamento.getDesconto_forma_pag() + "',"
                    + "'" + pModelFormaPagamento.getParcelas_forma_pag() + "',"
                    + "'" + pModelFormaPagamento.getSituacao_forma_pag() + "'"
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
    * recupera FormaPagamento
    * @param pId_forma_pag
    * @return ModelFormaPagamento
    */
    public ModelFormaPagamento getFormaPagamentoDAO(int pId_forma_pag){
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_forma_pagamento,"
                    + "descricao_forma_pag,"
                    + "desconto_forma_pag,"
                    + "quant_parcelas,"
                    + "situacao"
                 + " FROM"
                     + " tbl_forma_pagamento"
                 + " WHERE"
                     + " id_forma_pag = '" + pId_forma_pag + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFormaPagamento.setId_forma_pag(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricao_forma_pag(this.getResultSet().getString(2));
                modelFormaPagamento.setDesconto_forma_pag(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelas_forma_pag(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacao_forma_pag(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFormaPagamento;
    }

    /**
    * recupera uma lista de FormaPagamento
        * @return ArrayList
    */
    public ArrayList<ModelFormaPagamento> getListaFormaPagamentoDAO(){
        ArrayList<ModelFormaPagamento> listamodelFormaPagamento = new ArrayList();
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_forma_pagamento,"
                    + "descricao_forma_pag,"
                    + "desconto_forma_pag,"
                    + "quant_parcelas,"
                    + "situacao"
                 + " FROM"
                     + " tbl_forma_pagamento"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFormaPagamento = new ModelFormaPagamento();
                modelFormaPagamento.setId_forma_pag(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricao_forma_pag(this.getResultSet().getString(2));
                modelFormaPagamento.setDesconto_forma_pag(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelas_forma_pag(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacao_forma_pag(this.getResultSet().getInt(5));
                listamodelFormaPagamento.add(modelFormaPagamento);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFormaPagamento;
    }

    /**
    * atualiza FormaPagamento
    * @param pModelFormaPagamento
    * @return boolean
    */
    public boolean atualizarFormaPagamentoDAO(ModelFormaPagamento pModelFormaPagamento){
        try {
            this.Conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_forma_pagamento SET "
                    + "id_forma_pagamento = '" + pModelFormaPagamento.getId_forma_pag() + "',"
                    + "descricao_forma_pag = '" + pModelFormaPagamento.getDescricao_forma_pag() + "',"
                    + "desconto_forma_pag = '" + pModelFormaPagamento.getDesconto_forma_pag() + "',"
                    + "quant_parcelas = '" + pModelFormaPagamento.getParcelas_forma_pag() + "',"
                    + "situacao = '" + pModelFormaPagamento.getSituacao_forma_pag() + "'"
                + " WHERE "
                    + "id_forma_pagamento = '" + pModelFormaPagamento.getId_forma_pag() + "'"
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
    * exclui FormaPagamento
    * @param pId_forma_pag
    * @return boolean
    */
    public boolean excluirFormaPagamentoDAO(int pId_forma_pag){
        try {
            this.Conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_forma_pagamento "
                + " WHERE "
                    + "id_forma_pagamento = '" + pId_forma_pag + "'"
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