/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class EstateAgent_GUI extends javax.swing.JFrame {

    /**
     * Creates new form EstateAgent_GUI
     */
    public EstateAgent_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmb_Location = new javax.swing.JComboBox<>();
        tf_AgentName = new javax.swing.JTextField();
        tf_PropertyPrice = new javax.swing.JTextField();
        tf_Commission = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Output = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mi_ProcessReport = new javax.swing.JMenuItem();
        mi_Clear = new javax.swing.JMenuItem();
        mi_Save = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AGENT LOCATION:");

        jLabel2.setText("ESTATE AGENT NAME:");

        jLabel3.setText("PROPERTY PRICE:");

        jLabel4.setText("COMMISSION PERCENTAGE:");

        jLabel5.setText("ESTATE AGENT REPORT:");

        cmb_Location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cape Town", "Durban", "Pretoria" }));

        tf_AgentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_AgentNameActionPerformed(evt);
            }
        });

        tf_PropertyPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_PropertyPriceActionPerformed(evt);
            }
        });

        tf_Commission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CommissionActionPerformed(evt);
            }
        });

        ta_Output.setColumns(20);
        ta_Output.setRows(5);
        jScrollPane1.setViewportView(ta_Output);

        jMenu1.setText("File");

        mi_Exit.setText("Exit");
        mi_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(mi_Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");

        mi_ProcessReport.setText("Process Report");
        mi_ProcessReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ProcessReportActionPerformed(evt);
            }
        });
        jMenu2.add(mi_ProcessReport);

        mi_Clear.setText("Clear");
        mi_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ClearActionPerformed(evt);
            }
        });
        jMenu2.add(mi_Clear);

        mi_Save.setText("Save");
        mi_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_SaveActionPerformed(evt);
            }
        });
        jMenu2.add(mi_Save);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_Location, 0, 134, Short.MAX_VALUE)
                            .addComponent(tf_AgentName)
                            .addComponent(tf_PropertyPrice)
                            .addComponent(tf_Commission))
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmb_Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_AgentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_PropertyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Commission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ExitActionPerformed
     JOptionPane.showMessageDialog(null,"Thank you for using the program");
     System.exit(0);
    }//GEN-LAST:event_mi_ExitActionPerformed

    private void mi_ProcessReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ProcessReportActionPerformed
      ////Variable declarations regarding the property and Agent
        String Location = (String) cmb_Location.getSelectedItem();
        String Agent_Name = tf_AgentName.getText();
        Double Property_Price = Double.valueOf(tf_PropertyPrice.getText());
        Double Commission = Double.valueOf(tf_Commission.getText());
      
      ////Creating the different classes  
        EstateAgent ea = new EstateAgent();
        Data dt = new Data(Location, Agent_Name, Property_Price, Commission);
     
      ////Inout validation for null fields
       if (dt.getProperty_Location() != null && dt.get_AgentName() != null &&
       dt.get_PropertyPrice() != null && dt.get_AgentCommission() != null) {
       } else {
       JOptionPane.showMessageDialog(this, "Invalid data. Please check the input values.", "Error", JOptionPane.ERROR_MESSAGE);
       }
 //// Building the report to output in the Text Area      
String report = "Estate Agent Report \n===================================\n"+ String.format(" Location: %s\nAgent Name: %s\nProperty Price: R%.2f\nCommission Percentage: %.2f\nCommission: R%.2f\n\"===================================\n\"",
            Location, Agent_Name, Property_Price, Commission, (Commission/100 * Property_Price));
 ta_Output.setText(report);
    }//GEN-LAST:event_mi_ProcessReportActionPerformed

    private void tf_PropertyPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_PropertyPriceActionPerformed
       
    }//GEN-LAST:event_tf_PropertyPriceActionPerformed

    private void tf_CommissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CommissionActionPerformed
        
    }//GEN-LAST:event_tf_CommissionActionPerformed

    private void tf_AgentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_AgentNameActionPerformed
        
    }//GEN-LAST:event_tf_AgentNameActionPerformed

    private void mi_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_SaveActionPerformed
       
    String Location = (String) cmb_Location.getSelectedItem();
    String Agent_Name = tf_AgentName.getText();
    Double Property_Price = Double.valueOf(tf_PropertyPrice.getText());
    Double Commission = Double.valueOf(tf_Commission.getText());
    double calculatedCommission = Commission * Property_Price;
    
 //// Building the report to output in the Text-File
    String report = "Estate Agent Report \n===================================\n"+ String.format(" Location: %s\nAgent Name: %s\nProperty Price: R%.2f\nCommission Percentage: %.2f\nCommission: R%.2f\n\"===================================\n\"",
            Location, Agent_Name, Property_Price, Commission, calculatedCommission);
//// (BroCode, 2020), File-writer
/// Referencning at end of this page 
    try (FileWriter fileWriter = new FileWriter("report.txt", true); 
            
         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

        // Writing the report to the file
        //// (Nilesh Technology,2020), Buffer-Writer
        /// Referencning at end of this page 
        bufferedWriter.write(report);
        bufferedWriter.newLine(); // Adding a newline for the next entry
        JOptionPane.showMessageDialog(this, "Report saved to report.txt", "Success", JOptionPane.INFORMATION_MESSAGE);

//// (Telusko,2023) Ducking exeption using throws
/// Referencning at end of this page 
    } catch (IOException e) {
        e.printStackTrace(); 
        JOptionPane.showMessageDialog(this, "Error saving report to file", "Error", JOptionPane.ERROR_MESSAGE);
    }

 
    }//GEN-LAST:event_mi_SaveActionPerformed

    private void mi_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ClearActionPerformed
        tf_AgentName.setText("");
        tf_Commission.setText("");
        tf_PropertyPrice.setText("");
        ta_Output.setText("");
    }//GEN-LAST:event_mi_ClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstateAgent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstateAgent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstateAgent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstateAgent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstateAgent_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_Location;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mi_Clear;
    private javax.swing.JMenuItem mi_Exit;
    private javax.swing.JMenuItem mi_ProcessReport;
    private javax.swing.JMenuItem mi_Save;
    private javax.swing.JTextArea ta_Output;
    private javax.swing.JTextField tf_AgentName;
    private javax.swing.JTextField tf_Commission;
    private javax.swing.JTextField tf_PropertyPrice;
    // End of variables declaration//GEN-END:variables
}

/////Referecing
//www.youtube.com. (n.d.). Java FileWriter (write to a file) 📝. [online] Available at: 
//https://www.youtube.com/watch?v=kjzmaJPoaNc. [Accessed 22 Nov. 2023]. 

// www.youtube.com. (n.d.). Java FileWriter | FileReader | PrintWriter | BufferedWriter | BufferedReader. [online] Available at: 
//https://www.youtube.com/watch?v=NVqgVwS9Le0 [Accessed 22 Nov. 2023].

//www.youtube.com. (n.d.). #82 Ducking Exception using throws in Java. [online] Available at: 
//https://www.youtube.com/watch?v=y7C2dRC9C44 [Accessed 22 Nov. 2023].
