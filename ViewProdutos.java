package view;

import controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelProdutos;
import javax.swing.RowFilter;
import util.Formatador;


/**
 * @author Thiago
 */

public class ViewProdutos extends javax.swing.JFrame {

    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelprodutos = new ModelProdutos();
    String SalvarAlterar;
    Formatador formatador = new Formatador();
    
    
    /**
     * Creates new form ViewProdutos
     */
    
    public ViewProdutos() {
        initComponents();
        CarregarProdutos();
        HabilitarDesabilitarCampos(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        c_prod_cod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_prod_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_produto = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btn_pesquisar = new javax.swing.JButton();
        c_prod_pesquisar = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        c_prod_estoque = new javax.swing.JFormattedTextField();
        c_prod_valor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setResizable(false);

        jLabel1.setText("Código:");

        c_prod_cod.setEnabled(false);

        jLabel2.setText("Nome:");

        c_prod_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_prod_nomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Estoque:");

        jLabel4.setText("Valor:");

        tbl_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_produto);
        if (tbl_produto.getColumnModel().getColumnCount() > 0) {
            tbl_produto.getColumnModel().getColumn(1).setMinWidth(300);
            tbl_produto.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jLabel5.setText("Pesquisar:");

        btn_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.jpg"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.jpg"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterarproduto.jpg"))); // NOI18N
        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exluirproduto.png"))); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        c_prod_estoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        c_prod_valor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(c_prod_cod, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(c_prod_estoque))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(c_prod_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_prod_nome)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c_prod_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_cancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_novo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_alterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_excluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_salvar))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_prod_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_prod_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_prod_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_prod_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btn_pesquisar)
                    .addComponent(c_prod_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_novo)
                    .addComponent(btn_alterar)
                    .addComponent(btn_excluir)
                    .addComponent(btn_salvar))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if(SalvarAlterar.equals("Salvar")){
            this.SalvarProduto();
        }else if(SalvarAlterar.equals("Alterar")){
            this.AlterarProduto();
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // excluir um produto do banco de dados
        int linha = tbl_produto.getSelectedRow();
        int CodigoProduto = (int) tbl_produto.getValueAt(linha, 0);
        
        if (controllerProdutos.excluirProdutoController(CodigoProduto)){
            JOptionPane.showMessageDialog(this, "Produto Excluído com Sucesso!", "PARABÉNS!", JOptionPane.INFORMATION_MESSAGE);
            this.CarregarProdutos();
            this.HabilitarDesabilitarCampos(false);
            
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Excluir Produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        // permite o cadastro de um novo produto
        SalvarAlterar = "Salvar";
        this.HabilitarDesabilitarCampos(true);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.HabilitarDesabilitarCampos(false);
        this.LimparCampos();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // TODO add your handling code here:
        SalvarAlterar = "Alterar";
        HabilitarDesabilitarCampos(true);
        int linha = tbl_produto.getSelectedRow();
        
        try{
          int CodigoProduto = (int) tbl_produto.getValueAt(linha, 0);
          //recuperar dados do banco
          modelprodutos = controllerProdutos.retornarProdutoController(CodigoProduto);
          //setar o produto na interface
          this.c_prod_cod.setText(String.valueOf(modelprodutos.getId_produto()));
          this.c_prod_nome.setText(modelprodutos.getNome_produto());
          this.c_prod_estoque.setText(String.valueOf(modelprodutos.getEstoque_produto()));
          this.c_prod_valor.setText(String.valueOf(modelprodutos.getValor_produto()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Código Inválido ou Nenhum Registro Selecionado", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) this.tbl_produto.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(model);
        this.tbl_produto.setRowSorter(classificador);
        
        String texto = c_prod_pesquisar.getText();
        
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
        
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void c_prod_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_prod_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_prod_nomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProdutos().setVisible(true);
            }
        });
    }
    
    private void SalvarProduto(){
        // salva um novo produto no banco de dados
        modelprodutos.setNome_produto(this.c_prod_nome.getText());
        modelprodutos.setEstoque_produto(Integer.parseInt(this.c_prod_estoque.getText()));
        modelprodutos.setValor_produto(formatador.ConverterVirgulaParaPonto(this.c_prod_valor.getText()));
        if(controllerProdutos.salvarProdutosController(modelprodutos)>0){
            JOptionPane.showMessageDialog(this,"Produto Cadastrado com Sucesso!", "PARABÉNS!", JOptionPane.INFORMATION_MESSAGE);
            this.CarregarProdutos();
            this.LimparCampos();
            this.HabilitarDesabilitarCampos(false);
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Cadastrar Produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void AlterarProduto(){
        // altera um produto no banco de dados
        modelprodutos.setNome_produto(this.c_prod_nome.getText());
        modelprodutos.setEstoque_produto(Integer.parseInt(this.c_prod_estoque.getText()));
        modelprodutos.setValor_produto(formatador.ConverterVirgulaParaPonto(this.c_prod_valor.getText()));
        if(controllerProdutos.alterarProdutoController(modelprodutos)){
            JOptionPane.showMessageDialog(this,"Produto Alterado com Sucesso!", "PARABÉNS", JOptionPane.INFORMATION_MESSAGE);
            this.CarregarProdutos();
            this.LimparCampos();
            this.HabilitarDesabilitarCampos(false);
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Alterar Produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //habilita e desabilita os campos do formulário
    private void HabilitarDesabilitarCampos(boolean condicao){
        c_prod_nome.setEnabled(condicao);
        c_prod_estoque.setEnabled(condicao);
        c_prod_valor.setEnabled(condicao);
        btn_salvar.setEnabled(condicao);
    }
    
    //método que limpa os campos do formulário
    private void LimparCampos(){
        c_prod_nome.setText("");
        c_prod_estoque.setText("");
        c_prod_valor.setText("");
    }
    
    //método que preenche a tabela com os produtos cadastrados no banco de dados
    private void CarregarProdutos(){
        listaModelProdutos = controllerProdutos.retornarListaProdutoController();
        DefaultTableModel model = (DefaultTableModel) tbl_produto.getModel();
        model.setNumRows(0);
        
    //jnserindo produtos na tabela
    int cont = listaModelProdutos.size();
    
        for(int i = 0;i<cont;i++){
            model.addRow(new Object[]{
            listaModelProdutos.get(i).getId_produto(),
            listaModelProdutos.get(i).getNome_produto(),
            listaModelProdutos.get(i).getEstoque_produto(),
            listaModelProdutos.get(i).getValor_produto()
            });
        }
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField c_prod_cod;
    private javax.swing.JFormattedTextField c_prod_estoque;
    private javax.swing.JTextField c_prod_nome;
    private javax.swing.JTextField c_prod_pesquisar;
    private javax.swing.JFormattedTextField c_prod_valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_produto;
    // End of variables declaration//GEN-END:variables
}