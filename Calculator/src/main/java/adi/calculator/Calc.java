/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adi.calculator;
import java.util.Scanner;
/**
 *
 * @author ADITYA CHOUDHARY
 */
public class Calc extends javax.swing.JFrame {

    String calmethod="";
    float val1=0,val2=0;
    
    public Calc() {
        initComponents();
        lb1res.setText("");
        lb1disp.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton14 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lb1res = new javax.swing.JTextArea();
        lb1disp = new javax.swing.JLabel();
        btncl = new javax.swing.JButton();
        btnseven = new javax.swing.JButton();
        btnfour = new javax.swing.JButton();
        btnone = new javax.swing.JButton();
        btneight = new javax.swing.JButton();
        btnfive = new javax.swing.JButton();
        btntwo = new javax.swing.JButton();
        btnmod = new javax.swing.JButton();
        btnnine = new javax.swing.JButton();
        btnsix = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btnmul = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btnthree = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnzero = new javax.swing.JButton();
        btnequal = new javax.swing.JButton();

        jButton14.setText("jButton1");

        jButton19.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CACULATOR");
        setResizable(false);

        jPanel1.setRequestFocusEnabled(false);

        lb1res.setColumns(20);
        lb1res.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lb1res.setRows(3);
        jScrollPane1.setViewportView(lb1res);

        lb1disp.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(lb1disp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lb1disp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btncl.setBackground(new java.awt.Color(204, 255, 255));
        btncl.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btncl.setForeground(new java.awt.Color(102, 102, 102));
        btncl.setText("CE");
        btncl.setRequestFocusEnabled(false);
        btncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclActionPerformed(evt);
            }
        });

        btnseven.setBackground(new java.awt.Color(204, 255, 255));
        btnseven.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnseven.setForeground(new java.awt.Color(102, 102, 102));
        btnseven.setText("7");
        btnseven.setRequestFocusEnabled(false);
        btnseven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsevenActionPerformed(evt);
            }
        });

        btnfour.setBackground(new java.awt.Color(204, 255, 255));
        btnfour.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnfour.setForeground(new java.awt.Color(102, 102, 102));
        btnfour.setText("4");
        btnfour.setRequestFocusEnabled(false);
        btnfour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfourActionPerformed(evt);
            }
        });

        btnone.setBackground(new java.awt.Color(204, 255, 255));
        btnone.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnone.setForeground(new java.awt.Color(102, 102, 102));
        btnone.setText("1");
        btnone.setRequestFocusEnabled(false);
        btnone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoneActionPerformed(evt);
            }
        });

        btneight.setBackground(new java.awt.Color(204, 255, 255));
        btneight.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btneight.setForeground(new java.awt.Color(102, 102, 102));
        btneight.setText("8");
        btneight.setRequestFocusEnabled(false);
        btneight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneightActionPerformed(evt);
            }
        });

        btnfive.setBackground(new java.awt.Color(204, 255, 255));
        btnfive.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnfive.setForeground(new java.awt.Color(102, 102, 102));
        btnfive.setText("5");
        btnfive.setRequestFocusEnabled(false);
        btnfive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfiveActionPerformed(evt);
            }
        });

        btntwo.setBackground(new java.awt.Color(204, 255, 255));
        btntwo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btntwo.setForeground(new java.awt.Color(102, 102, 102));
        btntwo.setText("2");
        btntwo.setRequestFocusEnabled(false);
        btntwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntwoActionPerformed(evt);
            }
        });

        btnmod.setBackground(new java.awt.Color(204, 255, 255));
        btnmod.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnmod.setForeground(new java.awt.Color(102, 102, 102));
        btnmod.setText("%");
        btnmod.setRequestFocusEnabled(false);
        btnmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodActionPerformed(evt);
            }
        });

        btnnine.setBackground(new java.awt.Color(204, 255, 255));
        btnnine.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnnine.setForeground(new java.awt.Color(102, 102, 102));
        btnnine.setText("9");
        btnnine.setRequestFocusEnabled(false);
        btnnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnineActionPerformed(evt);
            }
        });

        btnsix.setBackground(new java.awt.Color(204, 255, 255));
        btnsix.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnsix.setForeground(new java.awt.Color(102, 102, 102));
        btnsix.setText("6");
        btnsix.setRequestFocusEnabled(false);
        btnsix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsixActionPerformed(evt);
            }
        });

        btndiv.setBackground(new java.awt.Color(204, 255, 255));
        btndiv.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btndiv.setForeground(new java.awt.Color(102, 102, 102));
        btndiv.setText("/");
        btndiv.setRequestFocusEnabled(false);
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        btnmul.setBackground(new java.awt.Color(204, 255, 255));
        btnmul.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnmul.setForeground(new java.awt.Color(102, 102, 102));
        btnmul.setText("*");
        btnmul.setRequestFocusEnabled(false);
        btnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulActionPerformed(evt);
            }
        });

        btnsub.setBackground(new java.awt.Color(204, 255, 255));
        btnsub.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnsub.setForeground(new java.awt.Color(102, 102, 102));
        btnsub.setText("-");
        btnsub.setRequestFocusEnabled(false);
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        btndot.setBackground(new java.awt.Color(204, 255, 255));
        btndot.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btndot.setForeground(new java.awt.Color(102, 102, 102));
        btndot.setText(".");
        btndot.setRequestFocusEnabled(false);
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });

        btnthree.setBackground(new java.awt.Color(204, 255, 255));
        btnthree.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnthree.setForeground(new java.awt.Color(102, 102, 102));
        btnthree.setText("3");
        btnthree.setRequestFocusEnabled(false);
        btnthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthreeActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(204, 255, 255));
        btnadd.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnadd.setForeground(new java.awt.Color(102, 102, 102));
        btnadd.setText("+");
        btnadd.setRequestFocusEnabled(false);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnzero.setBackground(new java.awt.Color(204, 255, 255));
        btnzero.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnzero.setForeground(new java.awt.Color(102, 102, 102));
        btnzero.setText("0");
        btnzero.setRequestFocusEnabled(false);
        btnzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnzeroActionPerformed(evt);
            }
        });

        btnequal.setBackground(new java.awt.Color(204, 255, 255));
        btnequal.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnequal.setForeground(new java.awt.Color(102, 102, 102));
        btnequal.setText("=");
        btnequal.setRequestFocusEnabled(false);
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btndot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnfour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnfive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsix, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btntwo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnthree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnseven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btneight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnnine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncl, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmod, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnseven, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneight, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnine, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfour, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfive, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsix, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntwo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthree, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndot, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnzeroActionPerformed
        lb1res.setText(lb1res.getText() + "0");
        lb1disp.setText(lb1disp.getText() + "0");    
    }//GEN-LAST:event_btnzeroActionPerformed

    private void btnoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoneActionPerformed
        lb1res.setText(lb1res.getText() + "1");
        lb1disp.setText(lb1disp.getText() + "1");    
    }//GEN-LAST:event_btnoneActionPerformed

    private void btntwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntwoActionPerformed
        lb1res.setText(lb1res.getText() + "2");
        lb1disp.setText(lb1disp.getText() + "2");    
    }//GEN-LAST:event_btntwoActionPerformed

    private void btnthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthreeActionPerformed
        lb1res.setText(lb1res.getText() + "3");
        lb1disp.setText(lb1disp.getText() + "3");    
    }//GEN-LAST:event_btnthreeActionPerformed

    private void btnfourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfourActionPerformed
        lb1res.setText(lb1res.getText() + "4");
        lb1disp.setText(lb1disp.getText() + "4");    
    }//GEN-LAST:event_btnfourActionPerformed

    private void btnfiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiveActionPerformed
        lb1res.setText(lb1res.getText() + "5");
        lb1disp.setText(lb1disp.getText() + "5");    
    }//GEN-LAST:event_btnfiveActionPerformed

    private void btnsixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsixActionPerformed
        lb1res.setText(lb1res.getText() + "6");
        lb1disp.setText(lb1disp.getText() + "6");    
    }//GEN-LAST:event_btnsixActionPerformed

    private void btnsevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsevenActionPerformed
        lb1res.setText(lb1res.getText() + "7");
        lb1disp.setText(lb1disp.getText() + "7");    
    }//GEN-LAST:event_btnsevenActionPerformed

    private void btneightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneightActionPerformed
        lb1res.setText(lb1res.getText() + "8");
        lb1disp.setText(lb1disp.getText() + "8");    
    }//GEN-LAST:event_btneightActionPerformed

    private void btnnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnineActionPerformed
        lb1res.setText(lb1res.getText() + "9");
        lb1disp.setText(lb1disp.getText() + "9");    
    }//GEN-LAST:event_btnnineActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        lb1res.setText(lb1res.getText() + ".");
        lb1disp.setText(lb1disp.getText() + ".");    
    }//GEN-LAST:event_btndotActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        calmethod="Plus";
        val1=Float.valueOf(lb1res.getText());
        lb1res.setText("");
        lb1disp.setText(lb1disp.getText() + " + ");    
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
        calmethod="Minus";
        val1=Float.valueOf(lb1res.getText());
        lb1res.setText("");
        lb1disp.setText(lb1disp.getText() + " - ");  
    }//GEN-LAST:event_btnsubActionPerformed

    private void btnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmulActionPerformed
        calmethod="Multiply";
        val1=Float.valueOf(lb1res.getText());
        lb1res.setText("");
        lb1disp.setText(lb1disp.getText() + " * ");  
    }//GEN-LAST:event_btnmulActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        calmethod="Divide";
        val1=Float.valueOf(lb1res.getText());
        lb1res.setText("");
        lb1disp.setText(lb1disp.getText() + " / ");  
    }//GEN-LAST:event_btndivActionPerformed

    private void btnmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodActionPerformed
        calmethod="Mod";
        val1=Float.valueOf(lb1res.getText());
        lb1res.setText("");
        lb1disp.setText(lb1disp.getText() + " % ");  
    }//GEN-LAST:event_btnmodActionPerformed

    private void btnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclActionPerformed
        lb1res.setText("");
        lb1disp.setText("");
    }//GEN-LAST:event_btnclActionPerformed

    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalActionPerformed
        val2=Float.valueOf(lb1res.getText());
        
        float ans=0;
        
        if(calmethod.equals("Plus"))
            ans=val1+val2;
        else if(calmethod.equals("Minus"))
            ans=val1-val2;
        else if(calmethod.equals("Multiply"))
            ans=val1*val2;
        else if(calmethod.equals("Divide"))
            ans=val1/val2;
        else if(calmethod.equals("Mod"))
            ans=val1%val2;
        else
            ans=Float.valueOf(lb1res.getText());
        lb1res.setText(String.valueOf(ans));
        lb1disp.setText(lb1disp.getText()+"");
    }//GEN-LAST:event_btnequalActionPerformed

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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncl;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btneight;
    private javax.swing.JButton btnequal;
    private javax.swing.JButton btnfive;
    private javax.swing.JButton btnfour;
    private javax.swing.JButton btnmod;
    private javax.swing.JButton btnmul;
    private javax.swing.JButton btnnine;
    private javax.swing.JButton btnone;
    private javax.swing.JButton btnseven;
    private javax.swing.JButton btnsix;
    private javax.swing.JButton btnsub;
    private javax.swing.JButton btnthree;
    private javax.swing.JButton btntwo;
    private javax.swing.JButton btnzero;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1disp;
    private javax.swing.JTextArea lb1res;
    // End of variables declaration//GEN-END:variables
}
