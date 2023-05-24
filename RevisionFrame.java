/*
 * HUGOSQL 2023 Victor H Silva
 * Click https://github.com/victorhugosilvablancas/systematic_review
 */

package hugosql.systematic_review;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Hugo Silva Blancas
 * @college Universidad Autonoma de Queretaro, Mexico
 * @institution 2023 Conacyt, Mexico
 */
public class RevisionFrame extends javax.swing.JFrame {
    private Revision mirevision;
    
    /** Creates new form RevisionFrame */
    public RevisionFrame() {
        initComponents();
        setLocation(300,200);
        
        mirevision=new Revision();
        mirevision.getLista();
        PonTabla();
    }
    private void PonTabla() {
        tabladataset.setModel(new DefaultTableModel(
                mirevision.TablaDataset(),
                mirevision.CabezaDataset
                ));
        
        tablavariables.setModel(new DefaultTableModel(
                mirevision.TablaVariables(),
                mirevision.CabezaVariables
                ));
        
        tablametodologias.setModel(new DefaultTableModel(
                mirevision.TablaMetodologias(),
                mirevision.CabezaMetodologias
                ));
        
        tablacategorias.setModel(new DefaultTableModel(
                mirevision.TablaCategorias(),
                mirevision.CabezaCategorias
                ));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTodo = new javax.swing.JPanel();
        tabulador = new javax.swing.JTabbedPane();
        pDataset = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladataset = new javax.swing.JTable();
        DatasetMDPI = new javax.swing.JButton();
        datasetTitle = new javax.swing.JTextField();
        pVariables = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablavariables = new javax.swing.JTable();
        VariablesMDPI = new javax.swing.JButton();
        variablesTitle = new javax.swing.JTextField();
        pMetodologias = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablametodologias = new javax.swing.JTable();
        MetodologiasMDPI = new javax.swing.JButton();
        metodologiasTitle = new javax.swing.JTextField();
        pCategorias = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablacategorias = new javax.swing.JTable();
        CategoriasMDPI = new javax.swing.JButton();
        categoriasTitle = new javax.swing.JTextField();
        mensaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Systematic Review");

        tabladataset.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabladataset);

        DatasetMDPI.setText("Template MDPI");
        DatasetMDPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatasetMDPIActionPerformed(evt);
            }
        });

        datasetTitle.setText("Dataset");

        javax.swing.GroupLayout pDatasetLayout = new javax.swing.GroupLayout(pDataset);
        pDataset.setLayout(pDatasetLayout);
        pDatasetLayout.setHorizontalGroup(
            pDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatasetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(pDatasetLayout.createSequentialGroup()
                        .addComponent(datasetTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(DatasetMDPI)))
                .addContainerGap())
        );
        pDatasetLayout.setVerticalGroup(
            pDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatasetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datasetTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DatasetMDPI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
        );

        tabulador.addTab("Dataset", pDataset);

        tablavariables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablavariables);

        VariablesMDPI.setText("Template MDPI");
        VariablesMDPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VariablesMDPIActionPerformed(evt);
            }
        });

        variablesTitle.setText("List of variables.");

        javax.swing.GroupLayout pVariablesLayout = new javax.swing.GroupLayout(pVariables);
        pVariables.setLayout(pVariablesLayout);
        pVariablesLayout.setHorizontalGroup(
            pVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVariablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(pVariablesLayout.createSequentialGroup()
                        .addComponent(variablesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(VariablesMDPI)))
                .addContainerGap())
        );
        pVariablesLayout.setVerticalGroup(
            pVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVariablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VariablesMDPI)
                    .addComponent(variablesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabulador.addTab("Variables", pVariables);

        tablametodologias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablametodologias);

        MetodologiasMDPI.setText("Template MDPI");
        MetodologiasMDPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodologiasMDPIActionPerformed(evt);
            }
        });

        metodologiasTitle.setText("Methods results.");

        javax.swing.GroupLayout pMetodologiasLayout = new javax.swing.GroupLayout(pMetodologias);
        pMetodologias.setLayout(pMetodologiasLayout);
        pMetodologiasLayout.setHorizontalGroup(
            pMetodologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMetodologiasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMetodologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(pMetodologiasLayout.createSequentialGroup()
                        .addComponent(metodologiasTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(MetodologiasMDPI)))
                .addContainerGap())
        );
        pMetodologiasLayout.setVerticalGroup(
            pMetodologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMetodologiasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMetodologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MetodologiasMDPI)
                    .addComponent(metodologiasTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabulador.addTab("Metodologías", pMetodologias);

        tablacategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablacategorias);

        CategoriasMDPI.setText("Template MDPI");
        CategoriasMDPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriasMDPIActionPerformed(evt);
            }
        });

        categoriasTitle.setText("Categories results.");

        javax.swing.GroupLayout pCategoriasLayout = new javax.swing.GroupLayout(pCategorias);
        pCategorias.setLayout(pCategoriasLayout);
        pCategoriasLayout.setHorizontalGroup(
            pCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(pCategoriasLayout.createSequentialGroup()
                        .addComponent(categoriasTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(CategoriasMDPI)))
                .addContainerGap())
        );
        pCategoriasLayout.setVerticalGroup(
            pCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoriasMDPI)
                    .addComponent(categoriasTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabulador.addTab("Categorías", pCategorias);

        mensaje.setText(".");
        mensaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mensajeFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pTodoLayout = new javax.swing.GroupLayout(pTodo);
        pTodo.setLayout(pTodoLayout);
        pTodoLayout.setHorizontalGroup(
            pTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabulador)
                    .addGroup(pTodoLayout.createSequentialGroup()
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pTodoLayout.setVerticalGroup(
            pTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabulador)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MetodologiasMDPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodologiasMDPIActionPerformed
        Exportardata.TablaMDPI(metodologiasTitle.getText(),tablametodologias);
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_MetodologiasMDPIActionPerformed

    private void VariablesMDPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VariablesMDPIActionPerformed
        Exportardata.TablaMDPI(variablesTitle.getText(),tablavariables);
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_VariablesMDPIActionPerformed

    private void DatasetMDPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatasetMDPIActionPerformed
        Exportardata.TablaMDPI(datasetTitle.getText(),tabladataset);
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_DatasetMDPIActionPerformed

    private void mensajeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mensajeFocusGained
        mensaje.setText("");
    }//GEN-LAST:event_mensajeFocusGained

    private void CategoriasMDPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriasMDPIActionPerformed
        Exportardata.TablaMDPI(categoriasTitle.getText(),tablacategorias);
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_CategoriasMDPIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CategoriasMDPI;
    private javax.swing.JButton DatasetMDPI;
    private javax.swing.JButton MetodologiasMDPI;
    private javax.swing.JButton VariablesMDPI;
    private javax.swing.JTextField categoriasTitle;
    private javax.swing.JTextField datasetTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField mensaje;
    private javax.swing.JTextField metodologiasTitle;
    private javax.swing.JPanel pCategorias;
    private javax.swing.JPanel pDataset;
    private javax.swing.JPanel pMetodologias;
    private javax.swing.JPanel pTodo;
    private javax.swing.JPanel pVariables;
    private javax.swing.JTable tablacategorias;
    private javax.swing.JTable tabladataset;
    private javax.swing.JTable tablametodologias;
    private javax.swing.JTable tablavariables;
    private javax.swing.JTabbedPane tabulador;
    private javax.swing.JTextField variablesTitle;
    // End of variables declaration//GEN-END:variables
    
}
