/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybienbanclientView;

import entity.Meeting;
import entity.PeopleEditReport;
import entity.Report;
import entity.User;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlybienbanclientController.ReportController;
import quanlybienbanclientController.UserController;

/**
 *
 * @author thanhdovan
 */
public class GUIViewReport extends javax.swing.JFrame {
    private final ReportController reportController;
    private final UserController userController;
    private String content;
    public static User user;
    public static Meeting meeting;
    public static void updateReportTable(List<Report> list){
        Object[] column = {"ReportId", "ReportName", "TimeCreate"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        try {
            for (Report u : list ){
                Object[] row = {u.getId(), u.getReportName(), u.getTimeCreate()};
                model.addRow(row);
            }
            GUIViewReport.reportTable.setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(GUIAdminClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * Creates new form GUIViewReport
     */
    public GUIViewReport() {
        reportController = new ReportController();
        userController = new UserController();
        initComponents();
        this.jLabel2.setText("MID"+meeting.getId());
        List<Report> reports = reportController.getReports(meeting.getId());
        GUIViewReport.updateReportTable(reports);
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        editReportButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Report Meeting");

        jLabel2.setText("jLabel2");

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editReportButton.setText("Edit Report");
        editReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editReportButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Export");

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ReportId", "ReportName", "TimeCreate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reportTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(reportTable);
        if (reportTable.getColumnModel().getColumnCount() > 0) {
            reportTable.getColumnModel().getColumn(2).setHeaderValue("TimeCreate");
        }

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea2KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTextArea2);

        cancelButton.setText("Cancel");
        cancelButton.setEnabled(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Reload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(editReportButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(saveButton)
                    .addComponent(jButton3)
                    .addComponent(editReportButton)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = GUIViewReport.reportTable.getSelectedRow();
        if (row != -1){
            if(JOptionPane.showConfirmDialog(rootPane, "Did you save your changes?", "", JOptionPane.YES_NO_OPTION) == 0){
                PeopleEditReport per = new PeopleEditReport();
                per.setUserId(user.getId());
                int reportId = Integer.parseInt(GUIViewReport.reportTable.getValueAt(row, 0).toString());
                per.setReportId(reportId);
                int peopleEditId = reportController.getPeopleEdit(per);
                if (peopleEditId == 0){
                    this.dispose();
                }
                else{
                    reportController.removePeopleEdit(peopleEditId);
                    this.dispose();
                }
            }
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reportTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportTableMousePressed
        GUIViewReport.jTextArea2.setText("");
        int row = GUIViewReport.reportTable.getSelectedRow();
        int reportId = Integer.parseInt(GUIViewReport.reportTable.getValueAt(row, 0).toString());
        String content = reportController.getReportContent(reportId);
        GUIViewReport.jTextArea2.append(content);
    }//GEN-LAST:event_reportTableMousePressed

    private void editReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editReportButtonActionPerformed
        content = GUIViewReport.jTextArea2.getText();
        int row = GUIViewReport.reportTable.getSelectedRow();
        if (row != -1){
            int reportId = Integer.parseInt(GUIViewReport.reportTable.getValueAt(row, 0).toString());
            List<Integer> userIds = reportController.getIdOfUserEdit(reportId);
            if (!userIds.isEmpty()){
                if(JOptionPane.showConfirmDialog(rootPane, "Another user is editting this file! Do you wanna wait? \nYes = Wait and try again later! | No = Edit and discard all changes of others.", "", JOptionPane.YES_NO_OPTION)==0){
                    System.out.println("Yes");
                } else {
                    GUIViewReport.jTextArea2.setEditable(true);
                    GUIViewReport.reportTable.setEnabled(false);
                    PeopleEditReport per = new PeopleEditReport();
                    per.setUserId(user.getId());
                    per.setReportId(reportId);
                    reportController.addPeopleEdit(per);
                    this.cancelButton.setEnabled(true);
                    this.editReportButton.setEnabled(false);
                    this.saveButton.setEnabled(true);
                }
            } else {
                GUIViewReport.jTextArea2.setEditable(true);
                GUIViewReport.reportTable.setEnabled(false);
                PeopleEditReport per = new PeopleEditReport();
                per.setUserId(user.getId());
                per.setReportId(reportId);
                reportController.addPeopleEdit(per);
                this.cancelButton.setEnabled(true);
                this.editReportButton.setEnabled(false);
                this.saveButton.setEnabled(true);
                this.jButton2.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Choose a report first!");
        }
    }//GEN-LAST:event_editReportButtonActionPerformed

    private void jTextArea2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea2KeyPressed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        GUIViewReport.jTextArea2.setEditable(false);
        GUIViewReport.reportTable.setEnabled(true);
        PeopleEditReport per = new PeopleEditReport();
        per.setUserId(user.getId());
        int row = GUIViewReport.reportTable.getSelectedRow();
        int reportId = Integer.parseInt(GUIViewReport.reportTable.getValueAt(row, 0).toString());
        per.setReportId(reportId);
        int peopleEditId = reportController.getPeopleEdit(per);
        reportController.removePeopleEdit(peopleEditId);
        this.editReportButton.setEnabled(true);
        this.cancelButton.setEnabled(false);
        this.jButton2.setEnabled(true);
        this.saveButton.setEnabled(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        GUIViewReport.jTextArea2.setEditable(false);
        GUIViewReport.reportTable.setEnabled(true);
        PeopleEditReport per = new PeopleEditReport();
        per.setUserId(user.getId());
        int row = GUIViewReport.reportTable.getSelectedRow();
        int reportId = Integer.parseInt(GUIViewReport.reportTable.getValueAt(row, 0).toString());
        per.setReportId(reportId);
        int peopleEditId = reportController.getPeopleEdit(per);
        reportController.removePeopleEdit(peopleEditId);
        this.editReportButton.setEnabled(true);
        this.cancelButton.setEnabled(false);
        this.saveButton.setEnabled(false);
        this.jButton2.setEnabled(true);
        String newContent = GUIViewReport.jTextArea2.getText();
        if (newContent.equals(this.content)){
            JOptionPane.showMessageDialog(rootPane, "No change!");
            return;
        }
        Report report = reportController.getReport(reportId);
        report.setReportContent(newContent);
        int result = reportController.addReport(report);
        if (result == 0){
            JOptionPane.showMessageDialog(rootPane, "Failed! Try again!");
            return;
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Success!");
        }
        List<Report> list = reportController.getReports(GUIViewReport.meeting.getId());
        GUIViewReport.updateReportTable(list);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        List<Report> reports = reportController.getReports(meeting.getId());
        GUIViewReport.jTextArea2.setText("");
        GUIViewReport.updateReportTable(reports);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIViewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIViewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIViewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIViewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIViewReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton editReportButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextArea jTextArea2;
    public static javax.swing.JTable reportTable;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
