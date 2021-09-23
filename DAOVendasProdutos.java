package DAO;

import model.ModelVendasProdutos;
import conect.ConexaoMySQL;
import java.util.ArrayList;
/**
*
* @author Thiago 
*/
public class DAOVendasProdutos extends ConexaoMySQL {

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * @return int
    */
    public int salvarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.Conectar();
            return this.insertSQL(
                "INSERT INTO tbl_vendas_produtos (" 
                        + "fk_produto," 
                        + "fk_vendas," 
                        + "valor_vendas_produtos,"
                        + "valor_vendas_quantidade" + ") "
                        + "VALUES (" + "'" + pModelVendasProdutos.getFk_produto() + "',"
                        + "'" + pModelVendasProdutos.getFk_vendas() + "'," 
                        + "'" + pModelVendasProdutos.getValor_vendas_produtos() + "',"
                        + "'" + pModelVendasProdutos.getVendas_produtos_quantidade() + "'"
                        + ");");
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera VendasProdutos
    * @param pId_vendas_produtos
    * @return modelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosDAO(int pId_vendas_produtos){
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_vendas_produtos,"
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "valor_vendas_produtos,"
                    + "valor_vendas_quantidade"
                 + " FROM"
                     + " tbl_vendas_produtos"
                 + " WHERE"
                     + " id_vendas_produtos = '" + pId_vendas_produtos + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos.setId_vendas_produtos(this.getResultSet().getInt(1));
                modelVendasProdutos.setFk_produto(this.getResultSet().getInt(2));
                modelVendasProdutos.setFk_vendas(this.getResultSet().getInt(3));
                modelVendasProdutos.setValor_vendas_produtos(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVendas_produtos_quantidade(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendasProdutos;
    }

    /**
    * recupera uma lista de VendasProdutos
        * @return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosDAO(){
        ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.Conectar();
            this.executarSQL(
                "SELECT "
                    + "id_vendas_produtos,"
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "valor_vendas_produtos,"
                    + "valor_vendas_quantidade"
                 + " FROM"
                     + " tbl_vendas_produtos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setId_vendas_produtos(this.getResultSet().getInt(1));
                modelVendasProdutos.setFk_produto(this.getResultSet().getInt(2));
                modelVendasProdutos.setFk_vendas(this.getResultSet().getInt(3));
                modelVendasProdutos.setValor_vendas_produtos(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVendas_produtos_quantidade(this.getResultSet().getInt(5));
                listaModelVendasProdutos.add(modelVendasProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendasProdutos;
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * @return boolean
    */
    public boolean atualizarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.Conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_vendas_produtos SET "
                    + "id_vendas_produtos = '" + pModelVendasProdutos.getId_vendas_produtos() + "',"
                    + "fk_produto = '" + pModelVendasProdutos.getFk_produto() + "',"
                    + "fk_vendas = '" + pModelVendasProdutos.getFk_vendas() + "',"
                    + "valor_vendas_produtos = '" + pModelVendasProdutos.getValor_vendas_produtos() + "',"
                    + "valor_vendas_quantidade = '" + pModelVendasProdutos.getVendas_produtos_quantidade() + "'"
                + " WHERE "
                    + "id_vendas_produtos = '" + pModelVendasProdutos.getId_vendas_produtos() + "'"
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
    * exclui VendasProdutos
    * @param pfk_vendas
    * @return boolean
    */
    public boolean excluirVendasProdutosDAO(int pfk_vendas){
        try {
            this.Conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendas_produtos "
                + " WHERE "
                    + "fk_vendas = '" + pfk_vendas + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean SalvarVendasProdutosDAO(ArrayList<ModelVendasProdutos> plistaModelVendasProdutos) {
        try {
            this.Conectar();
            int cont = plistaModelVendasProdutos.size();
            for(int i=0;i<cont;i++){
            this.insertSQL(
                "INSERT INTO tbl_vendas_produtos ("
                    + "fk_produto," 
                    + "fk_vendas," 
                    + "valor_vendas_produtos,"
                    + "vendas_produtos_quantidade" + ") "
                    + "VALUES (" 
                    + "'" + plistaModelVendasProdutos.get(i).getFk_produto() + "'," 
                    + "'" + plistaModelVendasProdutos.get(i).getFk_vendas() + "'," 
                    + "'" + plistaModelVendasProdutos.get(i).getValor_vendas_produtos() + "',"
                    + "'" + plistaModelVendasProdutos.get(i).getVendas_produtos_quantidade()+ "'"
                    + ");");
            }
        return true;    
        }catch(Exception e){
            e.printStackTrace();
        return false;
        }finally{
            this.fecharConexao();
        }
    }
}  