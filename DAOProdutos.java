package dao;

import conect.ConexaoMySQL;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 * @author Thiago
 */

public class DAOProdutos extends ConexaoMySQL{
    
    public int SalvarProdutosDAO(ModelProdutos modelprodutos){
        try{
            this.Conectar();
            return this.insertSQL("INSERT INTO tbl_produto (" + "nome_produto," + "valor_produto," + "estoque_produto" + ") VALUES (" + "'" + modelprodutos.getNome_produto() + "'," + "'" + modelprodutos.getValor_produto() + "'," +
                    "'" + modelprodutos.getEstoque_produto() + "'" + ");");
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
        this.fecharConexao();
        }
    }
    
    /**
     * Excluir um produto do banco
     * @param id_produto
     * @return boolean
     */
    
    public boolean excluirProdutoDAO(int id_produto) {
        try {
            this.Conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto WHERE id_produto = '" + id_produto + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Alterar dados do produtos
     * @param modelprodutos
     * @return boolean
     */
    
    public boolean alterarProdutoDAO(ModelProdutos modelprodutos) {
        try {
            this.Conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                    + "nome_produto = '" + modelprodutos.getNome_produto()+ "',"
                    + "valor_produto = '" + modelprodutos.getValor_produto()+ "',"
                    + "estoque_produto = '" + modelprodutos.getEstoque_produto()+ "'"
                    + " WHERE id_produto = '" + modelprodutos.getId_produto()+ "'"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * retornar um produto pelo codigo
     * @param Id_produto
     * @return modelprodutos
     */
    
    public ModelProdutos retornarProdutoDAO(int Id_produto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.Conectar();
            this.executarSQL("SELECT "
                    + "id_produto, "
                    + "nome_produto,"
                    + "valor_produto,"
                    + "estoque_produto "
                    + "FROM tbl_produto WHERE id_produto = '" + Id_produto + "';");
            while (this.getResultSet().next()) {
                modelProdutos.setId_produto(this.getResultSet().getInt(1));
                modelProdutos.setNome_produto(this.getResultSet().getString(2));
                modelProdutos.setValor_produto(this.getResultSet().getDouble(3));
                modelProdutos.setEstoque_produto(this.getResultSet().getInt(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }
    
    /**
     * Retornar uma lista de completa produtos
     * @return modelprodutos
     */
    
    public ArrayList<ModelProdutos> retornarListaProdutosDAO() {
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.Conectar();
            this.executarSQL(" SELECT " + " id_produto,"  + " nome_produto," + " valor_produto,"
                    + " estoque_produto " + "FROM tbl_produto;");
            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setId_produto(this.getResultSet().getInt(1));
                modelProdutos.setNome_produto(this.getResultSet().getString(2));
                modelProdutos.setValor_produto(this.getResultSet().getDouble(3));
                modelProdutos.setEstoque_produto(this.getResultSet().getInt(4));
                listaModelProdutos.add(modelProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutos;
    }
    
    /**
     * retornar um produto pelo codigo
     * @param pNomeProduto
     * @return modelprodutos
     */
    
    public ModelProdutos retornarProdutoDAO(String pNomeProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.Conectar();
            this.executarSQL("SELECT "
                    + "id_produto, "
                    + "nome_produto,"
                    + "valor_produto,"
                    + "estoque_produto "
                    + "FROM tbl_produto WHERE nome_produto = '" + pNomeProduto + "';");
            while (this.getResultSet().next()) {
                modelProdutos.setId_produto(this.getResultSet().getInt(1));
                modelProdutos.setNome_produto(this.getResultSet().getString(2));
                modelProdutos.setValor_produto(this.getResultSet().getDouble(3));
                modelProdutos.setEstoque_produto(this.getResultSet().getInt(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }
    
    /**
     * Alterar estoque de produtos no banco
     * @param ListaModelProdutos
     * @return 
     */
    public boolean alterarEstoqueProdutosDAO(ArrayList<ModelProdutos> ListaModelProdutos) {
        try {
            this.Conectar();
            for (int i = 0; i < ListaModelProdutos.size(); i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE tbl_produto SET "
                        + "estoque_produto = '" + ListaModelProdutos.get(i).getEstoque_produto()+ "'"
                        + " WHERE id_produto = '" + ListaModelProdutos.get(i).getId_produto() + "'"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Alterar estoque do produtos no banco
     * @param listaModelProduto
     * @return boolean
     */
    public boolean alterarEstoqueProdutoDAO(ArrayList<ModelProdutos> listaModelProduto) {
        try {
            this.Conectar();
            for(int i=0;i<listaModelProduto.size();i++){ 
                    this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                    + "estoque_produto = '" + listaModelProduto.get(i).getEstoque_produto()+ "'"
                    + " WHERE id_produto = '" + listaModelProduto.get(i).getId_produto()+ "'");
            } 
            return true;    
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}

