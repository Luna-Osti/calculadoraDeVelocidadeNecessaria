
import javax.swing.JOptionPane;

public class Fisica_Calculador_de_Velocidade extends javax.swing.JFrame {

    //declaração das variávies
    public double horasSaida=0, minutosSaida=0, horasChegada=0, minutosChegada=0;
    public double distanciaTotal=0, tempoDisponivel=0, velocidadeFinal=0;
    public double[] distancias = new double[10];
    public double[] velocidades = new double[10];
    public double[] tempos = new double [10];
    public boolean diaSeguinte;
    
    private void errorMsg(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
    }
    
    //criacao do frame
    public Fisica_Calculador_de_Velocidade() {
        initComponents();
    }

    //Código gerado pelo NetBeans para a criação da IDE
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        horasSaidaIn = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        minutosSaidaIn = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        distanciaTotalIn = new javax.swing.JFormattedTextField();
        horasChegadaIn = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        d2In = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        d1In = new javax.swing.JFormattedTextField();
        d4In = new javax.swing.JFormattedTextField();
        d3In = new javax.swing.JFormattedTextField();
        d6In = new javax.swing.JFormattedTextField();
        d5In = new javax.swing.JFormattedTextField();
        d8In = new javax.swing.JFormattedTextField();
        d7In = new javax.swing.JFormattedTextField();
        v4In = new javax.swing.JFormattedTextField();
        v3In = new javax.swing.JFormattedTextField();
        v6In = new javax.swing.JFormattedTextField();
        v5In = new javax.swing.JFormattedTextField();
        v8In = new javax.swing.JFormattedTextField();
        v7In = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        v2In = new javax.swing.JFormattedTextField();
        v1In = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        minutosChegadaIn = new javax.swing.JFormattedTextField();
        diaSeguinteIn = new javax.swing.JCheckBox();
        calcular = new javax.swing.JButton();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        javax.swing.JButton reset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        d10In = new javax.swing.JFormattedTextField();
        d9In = new javax.swing.JFormattedTextField();
        v10In = new javax.swing.JFormattedTextField();
        v9In = new javax.swing.JFormattedTextField();
        velocidadeFinalOut = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Velocidade");
        setMinimumSize(new java.awt.Dimension(563, 591));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Insira os Horários de saída e de chegada:");

        horasSaidaIn.setColumns(4);
        horasSaidaIn.setToolTipText("Horas");
        horasSaidaIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horasSaidaInMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Caculadora de velocidade necessária");

        jLabel3.setText("Saída:");

        minutosSaidaIn.setColumns(4);
        minutosSaidaIn.setToolTipText("Minutos");
        minutosSaidaIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minutosSaidaInMouseClicked(evt);
            }
        });

        jLabel4.setText("Chegada:");

        distanciaTotalIn.setColumns(5);
        distanciaTotalIn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        distanciaTotalIn.setToolTipText("Distancia Total");
        distanciaTotalIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                distanciaTotalInMouseClicked(evt);
            }
        });
        distanciaTotalIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanciaTotalInActionPerformed(evt);
            }
        });

        horasChegadaIn.setColumns(4);
        horasChegadaIn.setToolTipText("Horas");
        horasChegadaIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horasChegadaInMouseClicked(evt);
            }
        });

        jLabel5.setText("Distancias(km):");

        d2In.setColumns(1);
        d2In.setToolTipText("D2");
        d2In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d2InMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Insira a velocidade e distância de cada parte do trajeto: (preencher todos os campos)");

        d1In.setColumns(1);
        d1In.setToolTipText("D1");
        d1In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d1InMouseClicked(evt);
            }
        });

        d4In.setColumns(1);
        d4In.setToolTipText("D4");
        d4In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d4InMouseClicked(evt);
            }
        });

        d3In.setColumns(1);
        d3In.setToolTipText("D3");
        d3In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d3InMouseClicked(evt);
            }
        });

        d6In.setColumns(1);
        d6In.setToolTipText("D6");
        d6In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d6InMouseClicked(evt);
            }
        });

        d5In.setColumns(1);
        d5In.setToolTipText("D5");
        d5In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d5InMouseClicked(evt);
            }
        });

        d8In.setColumns(1);
        d8In.setToolTipText("D8");
        d8In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d8InMouseClicked(evt);
            }
        });

        d7In.setColumns(1);
        d7In.setToolTipText("D7");
        d7In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d7InMouseClicked(evt);
            }
        });

        v4In.setColumns(1);
        v4In.setToolTipText("V4");
        v4In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v4InMouseClicked(evt);
            }
        });

        v3In.setColumns(1);
        v3In.setToolTipText("V3");
        v3In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v3InMouseClicked(evt);
            }
        });

        v6In.setColumns(1);
        v6In.setToolTipText("V6");
        v6In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v6InMouseClicked(evt);
            }
        });

        v5In.setColumns(1);
        v5In.setToolTipText("V5");
        v5In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v5InMouseClicked(evt);
            }
        });

        v8In.setColumns(1);
        v8In.setToolTipText("V8");
        v8In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v8InMouseClicked(evt);
            }
        });

        v7In.setColumns(1);
        v7In.setToolTipText("V7");
        v7In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v7InMouseClicked(evt);
            }
        });

        jLabel7.setText("Velocidades(km/h):");

        v2In.setColumns(1);
        v2In.setToolTipText("V2");
        v2In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v2InMouseClicked(evt);
            }
        });

        v1In.setColumns(1);
        v1In.setToolTipText("V1");
        v1In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v1InMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Insira a distância total (em km) do trajeto:");

        minutosChegadaIn.setColumns(4);
        minutosChegadaIn.setToolTipText("Minutos");
        minutosChegadaIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minutosChegadaInMouseClicked(evt);
            }
        });

        diaSeguinteIn.setText("Dia seguinte?");

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Velocidade necessária:");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        d10In.setColumns(1);
        d10In.setToolTipText("D10");
        d10In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d10InMouseClicked(evt);
            }
        });

        d9In.setColumns(1);
        d9In.setToolTipText("D9");
        d9In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d9InMouseClicked(evt);
            }
        });

        v10In.setColumns(1);
        v10In.setToolTipText("V10");
        v10In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v10InMouseClicked(evt);
            }
        });

        v9In.setColumns(1);
        v9In.setToolTipText("V9");
        v9In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v9InMouseClicked(evt);
            }
        });

        velocidadeFinalOut.setText("Resultado");
        velocidadeFinalOut.setFocusable(false);
        velocidadeFinalOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velocidadeFinalOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(horasChegadaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(minutosChegadaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(horasSaidaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(minutosSaidaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(diaSeguinteIn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(v1In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(v2In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(v3In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(v4In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(v5In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(v6In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(v7In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(v8In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(d1In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(d2In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(d3In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(d4In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(d5In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(d6In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(d7In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(d8In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(d9In)
                                            .addComponent(v9In, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(d10In)
                                            .addComponent(v10In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(reset)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(jLabel10))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(40, 40, 40)
                                                        .addComponent(calcular))
                                                    .addComponent(jLabel9)
                                                    .addComponent(velocidadeFinalOut, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(distanciaTotalIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horasSaidaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(minutosSaidaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horasChegadaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(minutosChegadaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaSeguinteIn))
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(13, 13, 13)
                .addComponent(distanciaTotalIn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(d1In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d2In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d3In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d4In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d5In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d6In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d7In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d8In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(v1In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v2In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v3In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v4In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v5In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v6In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v7In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v8In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d9In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d10In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(v9In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v10In, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(velocidadeFinalOut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(139, 139, 139))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(reset)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        d9In.getAccessibleContext().setAccessibleName("IU");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void horasSaidaInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horasSaidaInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_horasSaidaInMouseClicked

    private void minutosSaidaInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minutosSaidaInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_minutosSaidaInMouseClicked

    private void distanciaTotalInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distanciaTotalInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_distanciaTotalInMouseClicked

    private void horasChegadaInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horasChegadaInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_horasChegadaInMouseClicked

    private void d2InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d2InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d2InMouseClicked

    private void d1InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d1InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d1InMouseClicked

    private void d4InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d4InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d4InMouseClicked

    private void d3InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d3InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d3InMouseClicked

    private void d6InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d6InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d6InMouseClicked

    private void d5InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d5InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d5InMouseClicked

    private void d8InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d8InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d8InMouseClicked

    private void d7InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d7InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d7InMouseClicked

    private void v4InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v4InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_v4InMouseClicked

    private void v3InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v3InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_v3InMouseClicked

    private void v6InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v6InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_v6InMouseClicked

    private void v5InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v5InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_v5InMouseClicked

    private void v8InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v8InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_v8InMouseClicked

    private void v7InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v7InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_v7InMouseClicked

    private void v2InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v2InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_v2InMouseClicked

    private void v1InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v1InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_v1InMouseClicked

    private void minutosChegadaInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minutosChegadaInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_minutosChegadaInMouseClicked

    private void d10InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d10InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d10InMouseClicked

    private void d9InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d9InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d9InMouseClicked

    private void v10InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v10InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_v10InMouseClicked

    private void v9InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v9InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_v9InMouseClicked

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Funcao do botao de calcular
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        //Coleta dos dados
        try{
            horasSaida = Double.parseDouble(horasSaidaIn.getText());
            minutosSaida = Double.parseDouble(minutosSaidaIn.getText());
            horasChegada = Double.parseDouble(horasChegadaIn.getText());
            minutosChegada = Double.parseDouble(minutosChegadaIn.getText());

            //Verificação do tempo
            if(horasSaida >= 24 || minutosSaida >= 60 || horasChegada >= 24 || minutosChegada >= 60 ){
                errorMsg("Horário inválido, minutos e horas não podem ser negativos e devem ser menores que 24 e 60 respectivamente", "Input Error");
                return;
            }
            //Cálculo do tempo disponível
            if(diaSeguinteIn.isSelected()){
                tempoDisponivel= (24 - (horasSaida + minutosSaida/60)+ (horasChegada + minutosChegada/60));
            }else{
                tempoDisponivel = ((horasChegada + minutosChegada/60) - (horasSaida + minutosSaida/60));
                
                if (tempoDisponivel < 0){//Erro de horario
                    errorMsg("Horário de chegada inferior ao horario de saída", "Input Error");
                    return;
                }
            }
            
            distanciaTotal = Double.parseDouble(distanciaTotalIn.getText());
                if (distanciaTotal < 0 || distanciaTotal > 1000){//Limita a distancia total que pode ser percorrida
                    errorMsg("Distância negativa ou grande demais", "Input Error");
                    return;
                }
            
            //Cria uma variável para verificar se a soma das distâncias está dentro do valor da distância total
            double somaDistancias = 0;

            distancias[0] = Double.parseDouble(d1In.getText());
            somaDistancias += distancias[0];
            if(somaDistancias < distanciaTotal){
                distancias[1] = Double.parseDouble(d2In.getText());//Apenas adiciona caso a soma atual seja menor que a distância total
                somaDistancias += distancias[1];
            }
            if(somaDistancias < distanciaTotal){
                distancias[2] = Double.parseDouble(d3In.getText());
                somaDistancias += distancias[2];
            }
            if(somaDistancias < distanciaTotal){
                distancias[3] = Double.parseDouble(d4In.getText());
                somaDistancias += distancias[3];
            }
            if(somaDistancias < distanciaTotal){
                distancias[4] = Double.parseDouble(d5In.getText());
                somaDistancias += distancias[4];
            }
            if(somaDistancias < distanciaTotal){
                distancias[5] = Double.parseDouble(d6In.getText());
                somaDistancias += distancias[5];
            }
            if(somaDistancias < distanciaTotal){
                distancias[6] = Double.parseDouble(d7In.getText());
                somaDistancias += distancias[6];
            }
            if(somaDistancias < distanciaTotal){
                distancias[7] = Double.parseDouble(d8In.getText());
                somaDistancias += distancias[7];
            }
            if(somaDistancias < distanciaTotal){
                distancias[8] = Double.parseDouble(d9In.getText());
                somaDistancias += distancias[8];
            }
            if(somaDistancias < distanciaTotal){
                distancias[9] = Double.parseDouble(d10In.getText());
                somaDistancias += distancias[9];
            }
            if(somaDistancias > distanciaTotal){
                errorMsg("Distâncias inseridas superiores a distância total", "Input Error");
            }
            
            double distanciaRestante = (distanciaTotal - somaDistancias);//Calcula a distância que será usada no cálculo da velocidade final

            velocidades[0] = Double.parseDouble(v1In.getText());
            velocidades[1] = Double.parseDouble(v2In.getText());
            velocidades[2] = Double.parseDouble(v3In.getText());
            velocidades[3] = Double.parseDouble(v4In.getText());
            velocidades[4] = Double.parseDouble(v5In.getText());
            velocidades[5] = Double.parseDouble(v6In.getText());
            velocidades[6] = Double.parseDouble(v7In.getText());
            velocidades[7] = Double.parseDouble(v8In.getText());
            velocidades[8] = Double.parseDouble(v9In.getText());
            velocidades[9] = Double.parseDouble(v10In.getText());

            double tempoParcial=0;
            for(int i=0; i<10;i++){
                if(distancias[i]<0 || distancias[i]>300){//Limita a distância de uma seção à 300km e sempre positiva
                    errorMsg("Distancia de uma parte do trajeto não pode ser negativa, ou superior a 300", "Input Error");
                    return;
                }
                if(velocidades[i]<0 || velocidades[i]>531){//Limita a velocidade à 531km/h (Maior velocidade em um carro atualmente)
                    errorMsg("Velocidade inválida, deve ser positiva e até no máximo: 531km/h", "Input Error");
                    return;
                }else if(distancias[i]!=0 || velocidades [i]!=0){
                tempoParcial += (distancias[i]/velocidades[i]);//Soma o tempo necessário para decorrer 
                }
            }
            
            if(tempoParcial > tempoDisponivel){
                errorMsg("Não é possível chegar a tempo: trajeto longo demais","Impossivel");
                return;
            }
            
            double tempoRestante = (tempoDisponivel - tempoParcial);
            
            velocidadeFinal = (distanciaRestante/tempoRestante);
            
            if(velocidadeFinal > 531){//Erro caso a velocidade necessária seja maior que a velocidade do carro mais rápido atualmente
                errorMsg("Não é possivel um carro andar à mais de 531km/h", "Impossível");
                return;
            }
            
            String resultadoFinal = String.format("%.2f", velocidadeFinal) + "km/h";
            velocidadeFinalOut.setText(resultadoFinal);
        }catch(NumberFormatException ex) {
                // Se o valor digitado não for um número, mostra uma mensagem de erro
        errorMsg("Numero Inválido, lembre-se de preencher todos os campos", "Input Error");
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void velocidadeFinalOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velocidadeFinalOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_velocidadeFinalOutActionPerformed

    //Configuração do botão de reset
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        horasSaidaIn.setText("");
        minutosSaidaIn.setText("");
        horasChegadaIn.setText("");
        minutosChegadaIn.setText("");
        distanciaTotalIn.setText("");
        d1In.setText("");
        d2In.setText("");
        d3In.setText("");
        d4In.setText("");
        d5In.setText("");
        d6In.setText("");
        d7In.setText("");
        d8In.setText("");
        d9In.setText("");
        d10In.setText("");
        v1In.setText("");
        v2In.setText("");
        v3In.setText("");
        v4In.setText("");
        v5In.setText("");
        v6In.setText("");
        v7In.setText("");
        v8In.setText("");
        v9In.setText("");
        v10In.setText("");
        velocidadeFinalOut.setText("Resultado");
        
    }//GEN-LAST:event_resetActionPerformed

    private void distanciaTotalInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanciaTotalInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distanciaTotalInActionPerformed


    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fisica_Calculador_de_Velocidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JFormattedTextField d10In;
    private javax.swing.JFormattedTextField d1In;
    private javax.swing.JFormattedTextField d2In;
    private javax.swing.JFormattedTextField d3In;
    private javax.swing.JFormattedTextField d4In;
    private javax.swing.JFormattedTextField d5In;
    private javax.swing.JFormattedTextField d6In;
    private javax.swing.JFormattedTextField d7In;
    private javax.swing.JFormattedTextField d8In;
    private javax.swing.JFormattedTextField d9In;
    private javax.swing.JCheckBox diaSeguinteIn;
    private javax.swing.JFormattedTextField distanciaTotalIn;
    private javax.swing.JFormattedTextField horasChegadaIn;
    private javax.swing.JFormattedTextField horasSaidaIn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JFormattedTextField minutosChegadaIn;
    private javax.swing.JFormattedTextField minutosSaidaIn;
    private javax.swing.JFormattedTextField v10In;
    private javax.swing.JFormattedTextField v1In;
    private javax.swing.JFormattedTextField v2In;
    private javax.swing.JFormattedTextField v3In;
    private javax.swing.JFormattedTextField v4In;
    private javax.swing.JFormattedTextField v5In;
    private javax.swing.JFormattedTextField v6In;
    private javax.swing.JFormattedTextField v7In;
    private javax.swing.JFormattedTextField v8In;
    private javax.swing.JFormattedTextField v9In;
    private javax.swing.JTextField velocidadeFinalOut;
    // End of variables declaration//GEN-END:variables
}
