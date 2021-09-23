package dao;

import conect.ConexaoMySQL;
import java.util.ArrayList;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendasProdutos;

/**
 * @author Thiago
 */

public class DAOProdutosVendasProdutos extends ConexaoMySQL {
 
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosDAO(int pCodigoVenda){
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProdutos modelProdutos = new ModelProdutos();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        
        try{
          this.Conectar();
          this.executarSQL("SELECT " 
                          + " tbl_produto.id_produto,"
                          + " tbl_produto.estoque_produto,"
                          + " tbl_produto.nome_produto,"
                          + " tbl_produto.valor_produto,"
                          + " tbl_vendas_produtos.fk_produto,"
                          + " tbl_vendas_produtos.fk_vendas,"
                          + " tbl_vendas_produtos.id_vendas_produtos,"
                          + " tbl_vendas_produtos.valor_vendas_produtos,"
                          + " tbl_vendas_produtos.vendas_produtos_quantidade "
                          + " FROM tbl_vendas_produtos "
                          + " INNER JOIN tbl_produto ON tbl_produto.id_produto = "
                          + " tbl_vendas_produtos.fk_produto"
                          + " WHERE tbl_vendas_produtos.fk_vendas = '"+pCodigoVenda+"';");
          
            while(this.getResultSet().next()){
              
            modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
            modelProdutos = new ModelProdutos();
            modelVendasProdutos = new ModelVendasProdutos();
          
            modelProdutos.setId_produto(this.getResultSet().getInt(1));
            modelProdutos.setEstoque_produto(this.getResultSet().getInt(2));
            modelProdutos.setNome_produto(this.getResultSet().getString(3));
            modelProdutos.setValor_produto(this.getResultSet().getDouble(4));
          
            
            modelVendasProdutos.setFk_produto(this.getResultSet().getInt(5));
            modelVendasProdutos.setFk_vendas(this.getResultSet().getInt(6));
            modelVendasProdutos.setId_vendas_produtos(this.getResultSet().getInt(7));
            modelVendasProdutos.setValor_vendas_produtos(this.getResultSet().getInt(8));
            modelVendasProdutos.setVendas_produtos_quantidade(this.getResultSet().getInt(9));
          
            modelProdutosVendasProdutos.setModelProdutos(modelProdutos);
            modelProdutosVendasProdutos.setModelVendasProdutos(modelVendasProdutos);
          
            listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
           this.fecharConexao();
        }                
            return listaModelProdutosVendasProdutos;
    }    
}
