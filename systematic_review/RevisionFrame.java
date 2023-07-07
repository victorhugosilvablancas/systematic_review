package hugosql.systematic_review;

/**
 *
 * Application GUI
 *
 * @author Victor Hugo Silva
 * @college Universidad Autonoma de Queretaro
 * @sponsor Conahcyt, Mexico
 */
public class RevisionFrame extends javax.swing.JFrame {
    private Revision mirevision;
    private Bibitem mirefe;
    
    /** Creates new form RevisionFrame */
    public RevisionFrame() {
        initComponents();
        setLocation(200,60);
        
        mirevision=new Revision();
        mirefe=new Bibitem();
        PonListas();
        PonTablas();
    }
    private void PonTablas() {
        
        tabladataset.setModel(new DefaultTableModel(
                mirevision.TablaDataset(),
                mirevision.CabezaDataset
                ));
        resultados.setText("Período del "+Revision.perinicial+" al "+Revision.perifinal);
        
        tablavariablesmethod.setModel(new DefaultTableModel(
                mirevision.TablaVariablesMethods(),
                mirevision.CabezaVariablesMethods
                ));
        
        tablavariablesresultados.setModel(new DefaultTableModel(
                mirevision.TablaVariablesResultados(),
                mirevision.CabezaVariablesResultados
                ));
        
        //SOLVED, NOT SOLVED
        tablaresueltos.setModel(new DefaultTableModel(
                mirevision.TablaResueltos(true),
                mirevision.CabezaResueltos
                ));
        int r=tablaresueltos.getRowCount();
        tabuladorproblemas.setTitleAt(0, "Solved ("+r+")");
        tablaresueltosresumen.setModel(new DefaultTableModel(
                mirevision.TablaResueltosResumen(true),
                mirevision.CabezaResumen
                ));
        
        
        tablanoresueltos.setModel(new DefaultTableModel(
                mirevision.TablaResueltos(false),
                mirevision.CabezaResueltos
                ));
        r=tablanoresueltos.getRowCount();
        tabuladorproblemas.setTitleAt(2, "Not Solved ("+r+")");
        tablanoresueltosresumen.setModel(new DefaultTableModel(
                mirevision.TablaResueltosResumen(false),
                mirevision.CabezaResumen
                ));
        //SOLVED, NOT SOLVED FIN
        
        tablametodologias.setModel(new DefaultTableModel(
                mirevision.TablaMetodologias(),
                mirevision.CabezaMetodologias
                ));
        
        tabladistribucion.setModel(new DefaultTableModel(
                mirevision.TablaDistribucion(),
                mirevision.CabezaDistribucion
                ));
        
        tablacategorias.setModel(new DefaultTableModel(
                mirevision.TablaCategorias(),
                mirevision.CabezaCategorias
                ));
        
        tablareferencias.setModel(new DefaultTableModel(
                mirefe.Tabla(),
                mirefe.Cabeza
                ));
        
        tablaindice.setModel(new DefaultTableModel(
                mirefe.TablaIndice(),
                mirefe.Cabeza
                ));
        r=tablaindice.getRowCount();
        tabulador.setTitleAt(7,"Referencias ("+r+")");
        
    }
    private void PonListas() {
        mirevision.getListaOds();
        mirefe.getListaOds();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTodo = new javax.swing.JPanel();
        tabulador = new javax.swing.JTabbedPane();
        pDataset = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladataset = new javax.swing.JTable();
        DatasetLaTeX = new javax.swing.JButton();
        resuladosLb = new javax.swing.JLabel();
        resultados = new javax.swing.JTextField();
        datasetTitle = new javax.swing.JTextField();
        tablaaLb0 = new javax.swing.JLabel();
        tablaa0 = new javax.swing.JTextField();
        pVariablesResultados1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablavariablesmethod = new javax.swing.JTable();
        VariablesmethodLaTeX = new javax.swing.JButton();
        variablesmethodTitle = new javax.swing.JTextField();
        tablaaLb1 = new javax.swing.JLabel();
        tablaa1 = new javax.swing.JTextField();
        pVariablesResultados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablavariablesresultados = new javax.swing.JTable();
        VariablesresultadosLaTeX = new javax.swing.JButton();
        variablesresultadosTitle = new javax.swing.JTextField();
        tablaaLb2 = new javax.swing.JLabel();
        tablaa2 = new javax.swing.JTextField();
        pSolvedNot = new javax.swing.JPanel();
        Solved = new javax.swing.JButton();
        NotSolved = new javax.swing.JButton();
        tabuladorproblemas = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaresueltos = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaresueltosresumen = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablanoresueltos = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablanoresueltosresumen = new javax.swing.JTable();
        pCategorias = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablacategorias = new javax.swing.JTable();
        CategoriasLaTeX = new javax.swing.JButton();
        categoriasTitle = new javax.swing.JTextField();
        tablaaLb4 = new javax.swing.JLabel();
        tablaa4 = new javax.swing.JTextField();
        pMetodologias = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablametodologias = new javax.swing.JTable();
        MetodologiasLaTeX = new javax.swing.JButton();
        metodologiasTitle = new javax.swing.JTextField();
        tablaaLb5 = new javax.swing.JLabel();
        tablaa5 = new javax.swing.JTextField();
        pDistribucion = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tabladistribucion = new javax.swing.JTable();
        DistribucionLaTeX = new javax.swing.JButton();
        distribucionTitle = new javax.swing.JTextField();
        tablaaLb6 = new javax.swing.JLabel();
        tablaa6 = new javax.swing.JTextField();
        pReferencias = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablareferencias = new javax.swing.JTable();
        BibTex = new javax.swing.JButton();
        pIndice = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaindice = new javax.swing.JTable();
        mensaje = new javax.swing.JTextField();
        Refrescar = new javax.swing.JButton();

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

        DatasetLaTeX.setText("Template LaTeX");
        DatasetLaTeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatasetLaTeXActionPerformed(evt);
            }
        });

        resuladosLb.setText("Resultados:");

        datasetTitle.setText("Dataset");

        tablaaLb0.setText("Tabla label inicial:");

        tablaa0.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tablaa0.setText("4");

        javax.swing.GroupLayout pDatasetLayout = new javax.swing.GroupLayout(pDataset);
        pDataset.setLayout(pDatasetLayout);
        pDatasetLayout.setHorizontalGroup(
            pDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatasetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatasetLayout.createSequentialGroup()
                        .addComponent(datasetTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaaLb0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaa0, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                        .addComponent(DatasetLaTeX))
                    .addGroup(pDatasetLayout.createSequentialGroup()
                        .addComponent(resuladosLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pDatasetLayout.setVerticalGroup(
            pDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatasetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datasetTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DatasetLaTeX)
                    .addComponent(tablaaLb0)
                    .addComponent(tablaa0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resuladosLb)
                    .addComponent(resultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
        );

        tabulador.addTab("Dataset", pDataset);

        tablavariablesmethod.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tablavariablesmethod);

        VariablesmethodLaTeX.setText("Template LaTeX");
        VariablesmethodLaTeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VariablesmethodLaTeXActionPerformed(evt);
            }
        });

        variablesmethodTitle.setText("Variables definition and characteristics");

        tablaaLb1.setText("Tabla label:");

        tablaa1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tablaa1.setText("0");

        javax.swing.GroupLayout pVariablesResultados1Layout = new javax.swing.GroupLayout(pVariablesResultados1);
        pVariablesResultados1.setLayout(pVariablesResultados1Layout);
        pVariablesResultados1Layout.setHorizontalGroup(
            pVariablesResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVariablesResultados1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pVariablesResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addGroup(pVariablesResultados1Layout.createSequentialGroup()
                        .addComponent(variablesmethodTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaaLb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaa1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                        .addComponent(VariablesmethodLaTeX)))
                .addContainerGap())
        );
        pVariablesResultados1Layout.setVerticalGroup(
            pVariablesResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVariablesResultados1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pVariablesResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pVariablesResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tablaaLb1)
                        .addComponent(tablaa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pVariablesResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(VariablesmethodLaTeX)
                        .addComponent(variablesmethodTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabulador.addTab("Variables Metodología", pVariablesResultados1);

        tablavariablesresultados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablavariablesresultados);

        VariablesresultadosLaTeX.setText("Template LaTeX");
        VariablesresultadosLaTeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VariablesresultadosLaTeXActionPerformed(evt);
            }
        });

        variablesresultadosTitle.setText("Incidencia de variables en los estudios realizados.");

        tablaaLb2.setText("Tabla label:");

        tablaa2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tablaa2.setText("0");

        javax.swing.GroupLayout pVariablesResultadosLayout = new javax.swing.GroupLayout(pVariablesResultados);
        pVariablesResultados.setLayout(pVariablesResultadosLayout);
        pVariablesResultadosLayout.setHorizontalGroup(
            pVariablesResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVariablesResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pVariablesResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(pVariablesResultadosLayout.createSequentialGroup()
                        .addComponent(variablesresultadosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaaLb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaa2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                        .addComponent(VariablesresultadosLaTeX)))
                .addContainerGap())
        );
        pVariablesResultadosLayout.setVerticalGroup(
            pVariablesResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVariablesResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pVariablesResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pVariablesResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tablaaLb2)
                        .addComponent(tablaa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pVariablesResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(VariablesresultadosLaTeX)
                        .addComponent(variablesresultadosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabulador.addTab("Variables Resultados", pVariablesResultados);

        Solved.setText("BiTeX Solved");
        Solved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolvedActionPerformed(evt);
            }
        });

        NotSolved.setText("BiTeX Not Solved");
        NotSolved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotSolvedActionPerformed(evt);
            }
        });

        tablaresueltos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tablaresueltos);

        tabuladorproblemas.addTab("Solved", jScrollPane5);

        tablaresueltosresumen.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(tablaresueltosresumen);

        tabuladorproblemas.addTab("Solved Resumen", jScrollPane10);

        tablanoresueltos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(tablanoresueltos);

        tabuladorproblemas.addTab("Not Solved", jScrollPane9);

        tablanoresueltosresumen.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(tablanoresueltosresumen);

        tabuladorproblemas.addTab("Not Solved Resumen", jScrollPane11);

        javax.swing.GroupLayout pSolvedNotLayout = new javax.swing.GroupLayout(pSolvedNot);
        pSolvedNot.setLayout(pSolvedNotLayout);
        pSolvedNotLayout.setHorizontalGroup(
            pSolvedNotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSolvedNotLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSolvedNotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabuladorproblemas, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
                    .addGroup(pSolvedNotLayout.createSequentialGroup()
                        .addComponent(Solved)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NotSolved)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pSolvedNotLayout.setVerticalGroup(
            pSolvedNotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSolvedNotLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSolvedNotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Solved)
                    .addComponent(NotSolved))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabuladorproblemas, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabulador.addTab("Solved not Solved", pSolvedNot);

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

        CategoriasLaTeX.setText("Template LaTeX");
        CategoriasLaTeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriasLaTeXActionPerformed(evt);
            }
        });

        categoriasTitle.setText("Categories results.");

        tablaaLb4.setText("Tabla label:");

        tablaa4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tablaa4.setText("0");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaaLb4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaa4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                        .addComponent(CategoriasLaTeX)))
                .addContainerGap())
        );
        pCategoriasLayout.setVerticalGroup(
            pCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tablaaLb4)
                        .addComponent(tablaa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CategoriasLaTeX)
                        .addComponent(categoriasTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabulador.addTab("Categorías", pCategorias);

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

        MetodologiasLaTeX.setText("Template LaTeX");
        MetodologiasLaTeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodologiasLaTeXActionPerformed(evt);
            }
        });

        metodologiasTitle.setText("Methods results.");

        tablaaLb5.setText("Tabla label:");

        tablaa5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tablaa5.setText("0");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaaLb5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaa5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                        .addComponent(MetodologiasLaTeX)))
                .addContainerGap())
        );
        pMetodologiasLayout.setVerticalGroup(
            pMetodologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMetodologiasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMetodologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pMetodologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tablaaLb5)
                        .addComponent(tablaa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pMetodologiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MetodologiasLaTeX)
                        .addComponent(metodologiasTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabulador.addTab("Metodologías", pMetodologias);

        tabladistribucion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane12.setViewportView(tabladistribucion);

        DistribucionLaTeX.setText("Template LaTeX");
        DistribucionLaTeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistribucionLaTeXActionPerformed(evt);
            }
        });

        distribucionTitle.setText("Work's period distribution");

        tablaaLb6.setText("Tabla label:");

        tablaa6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tablaa6.setText("0");

        javax.swing.GroupLayout pDistribucionLayout = new javax.swing.GroupLayout(pDistribucion);
        pDistribucion.setLayout(pDistribucionLayout);
        pDistribucionLayout.setHorizontalGroup(
            pDistribucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDistribucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDistribucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12)
                    .addGroup(pDistribucionLayout.createSequentialGroup()
                        .addComponent(distribucionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaaLb6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaa6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                        .addComponent(DistribucionLaTeX)))
                .addContainerGap())
        );
        pDistribucionLayout.setVerticalGroup(
            pDistribucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDistribucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDistribucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDistribucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tablaaLb6)
                        .addComponent(tablaa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDistribucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DistribucionLaTeX)
                        .addComponent(distribucionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabulador.addTab("Distribución", pDistribucion);

        tablareferencias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tablareferencias);

        BibTex.setText("BiTeX");
        BibTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BibTexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pReferenciasLayout = new javax.swing.GroupLayout(pReferencias);
        pReferencias.setLayout(pReferenciasLayout);
        pReferenciasLayout.setHorizontalGroup(
            pReferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReferenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pReferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
                    .addGroup(pReferenciasLayout.createSequentialGroup()
                        .addComponent(BibTex)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pReferenciasLayout.setVerticalGroup(
            pReferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pReferenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BibTex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
        );

        tabulador.addTab("Referencias", pReferencias);

        tablaindice.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(tablaindice);

        javax.swing.GroupLayout pIndiceLayout = new javax.swing.GroupLayout(pIndice);
        pIndice.setLayout(pIndiceLayout);
        pIndiceLayout.setHorizontalGroup(
            pIndiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIndiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
        );
        pIndiceLayout.setVerticalGroup(
            pIndiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIndiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabulador.addTab("Índice", pIndice);

        mensaje.setText(".");
        mensaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mensajeFocusGained(evt);
            }
        });

        Refrescar.setText("Refrescar");
        Refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefrescarActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Refrescar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pTodoLayout.setVerticalGroup(
            pTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refrescar))
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

    private void MetodologiasLaTeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodologiasLaTeXActionPerformed
        Exportardata.ExportaTablaMetodologias(metodologiasTitle.getText(),tablametodologias,tablaa5.getText());
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_MetodologiasLaTeXActionPerformed

    private void VariablesresultadosLaTeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VariablesresultadosLaTeXActionPerformed
        Exportardata.ExportaTabla(variablesresultadosTitle.getText(),tablavariablesresultados,tablaa2.getText());
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_VariablesresultadosLaTeXActionPerformed

    private void DatasetLaTeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatasetLaTeXActionPerformed
        Exportardata.ExportaTablasDataset(datasetTitle.getText(),tabladataset,tablaa0.getText());
        Revisiondata.TablaContador++;
        tablaa1.setText(String.valueOf(Revisiondata.TablaContador));
        Revisiondata.TablaContador++;
        tablaa2.setText(String.valueOf(Revisiondata.TablaContador));
        Revisiondata.TablaContador++;
        tablaa4.setText(String.valueOf(Revisiondata.TablaContador));
        Revisiondata.TablaContador++;
        tablaa5.setText(String.valueOf(Revisiondata.TablaContador));
        Revisiondata.TablaContador++;
        tablaa6.setText(String.valueOf(Revisiondata.TablaContador));
        Revisiondata.TablaContador++;
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_DatasetLaTeXActionPerformed

    private void mensajeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mensajeFocusGained
        mensaje.setText("");
    }//GEN-LAST:event_mensajeFocusGained

    private void CategoriasLaTeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriasLaTeXActionPerformed
        Exportardata.ExportaTabla(categoriasTitle.getText(),tablacategorias,tablaa4.getText());
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_CategoriasLaTeXActionPerformed

    private void VariablesmethodLaTeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VariablesmethodLaTeXActionPerformed
        Exportardata.ExportaTabla(variablesmethodTitle.getText(),tablavariablesmethod,tablaa1.getText());
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_VariablesmethodLaTeXActionPerformed

    private void SolvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolvedActionPerformed
        Exportardata.ExportaProblemas(Exportardata.PROBLEMAS_RESUELTOS);
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_SolvedActionPerformed

    private void NotSolvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotSolvedActionPerformed
        Exportardata.ExportaProblemas(Exportardata.PROBLEMAS_IRRESOLUTOS);
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_NotSolvedActionPerformed

    private void BibTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BibTexActionPerformed
        mirefe.ExportaBibTex();
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_BibTexActionPerformed

    private void RefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefrescarActionPerformed
        PonListas();
        PonTablas();
    }//GEN-LAST:event_RefrescarActionPerformed

    private void DistribucionLaTeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistribucionLaTeXActionPerformed
        Exportardata.ExportaTabla(distribucionTitle.getText(),tabladistribucion,tablaa6.getText());
        mensaje.setText(Exportardata.Mensaje);
    }//GEN-LAST:event_DistribucionLaTeXActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BibTex;
    private javax.swing.JButton CategoriasLaTeX;
    private javax.swing.JButton DatasetLaTeX;
    private javax.swing.JButton DistribucionLaTeX;
    private javax.swing.JButton MetodologiasLaTeX;
    private javax.swing.JButton NotSolved;
    private javax.swing.JButton Refrescar;
    private javax.swing.JButton Solved;
    private javax.swing.JButton VariablesmethodLaTeX;
    private javax.swing.JButton VariablesresultadosLaTeX;
    private javax.swing.JTextField categoriasTitle;
    private javax.swing.JTextField datasetTitle;
    private javax.swing.JTextField distribucionTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField mensaje;
    private javax.swing.JTextField metodologiasTitle;
    private javax.swing.JPanel pCategorias;
    private javax.swing.JPanel pDataset;
    private javax.swing.JPanel pDistribucion;
    private javax.swing.JPanel pIndice;
    private javax.swing.JPanel pMetodologias;
    private javax.swing.JPanel pReferencias;
    private javax.swing.JPanel pSolvedNot;
    private javax.swing.JPanel pTodo;
    private javax.swing.JPanel pVariablesResultados;
    private javax.swing.JPanel pVariablesResultados1;
    private javax.swing.JLabel resuladosLb;
    private javax.swing.JTextField resultados;
    private javax.swing.JTextField tablaa0;
    private javax.swing.JTextField tablaa1;
    private javax.swing.JTextField tablaa2;
    private javax.swing.JTextField tablaa4;
    private javax.swing.JTextField tablaa5;
    private javax.swing.JTextField tablaa6;
    private javax.swing.JLabel tablaaLb0;
    private javax.swing.JLabel tablaaLb1;
    private javax.swing.JLabel tablaaLb2;
    private javax.swing.JLabel tablaaLb4;
    private javax.swing.JLabel tablaaLb5;
    private javax.swing.JLabel tablaaLb6;
    private javax.swing.JTable tablacategorias;
    private javax.swing.JTable tabladataset;
    private javax.swing.JTable tabladistribucion;
    private javax.swing.JTable tablaindice;
    private javax.swing.JTable tablametodologias;
    private javax.swing.JTable tablanoresueltos;
    private javax.swing.JTable tablanoresueltosresumen;
    private javax.swing.JTable tablareferencias;
    private javax.swing.JTable tablaresueltos;
    private javax.swing.JTable tablaresueltosresumen;
    private javax.swing.JTable tablavariablesmethod;
    private javax.swing.JTable tablavariablesresultados;
    private javax.swing.JTabbedPane tabulador;
    private javax.swing.JTabbedPane tabuladorproblemas;
    private javax.swing.JTextField variablesmethodTitle;
    private javax.swing.JTextField variablesresultadosTitle;
    // End of variables declaration//GEN-END:variables
    
}
