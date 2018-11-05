/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybienbanclientView;

import entity.ContentTime;
import entity.PersonContent;
import entity.PersonContentTime;
import entity.Report;
import entity.ReportPart;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import quanlybienbanclientController.ReportController;
import quanlybienbanclientController.ReportPartController;

/**
 *
 * @author thanhdovan
 */
public class GenerateReport extends javax.swing.JFrame {
    final int PERSONCONTENT=0, CONTENTTIME=1;
    public static int meetingId;
    private ReportPartController reportPartController;
    private ReportController reportController;
    /**
     * Creates new form GenerateReport
     */
    public GenerateReport() {
        reportPartController = new ReportPartController();
        reportController = new ReportController();
        initComponents();
        List<ReportPart> reportPartPersonContents = reportPartController.getReportPartIds(PERSONCONTENT, GenerateReport.meetingId);
        List<ReportPart> reportPartContentTimes = reportPartController.getReportPartIds(CONTENTTIME, GenerateReport.meetingId);
        for(ReportPart rp : reportPartPersonContents){
            this.jComboBox1.addItem(rp.getId()+ " - " + rp.getFileName());
        }
        for(ReportPart rp : reportPartContentTimes){
            this.jComboBox2.addItem(rp.getId()+ " - " + rp.getFileName());
        }
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
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        generateReportButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personContentPartTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        contentTimePartTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Generate Report");

        jLabel2.setText("Choose the Person-Content file");

        jLabel3.setText("Choose the Content-Time file");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        generateReportButton.setText("Generate Report");
        generateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Preview PC file");

        jLabel5.setText("Preview CT file");

        personContentPartTextArea.setColumns(20);
        personContentPartTextArea.setRows(5);
        jScrollPane1.setViewportView(personContentPartTextArea);

        contentTimePartTextArea.setColumns(20);
        contentTimePartTextArea.setRows(5);
        jScrollPane2.setViewportView(contentTimePartTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(generateReportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateReportButton)
                    .addComponent(cancelButton))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        Object item = evt.getItem();
        int reportPartId = Integer.parseInt(item.toString().substring(0, 1));
        String reportPartContent = reportPartController.getReportPartContent(reportPartId);
        this.personContentPartTextArea.setText(reportPartContent);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        Object item = evt.getItem();
        int reportPartId = Integer.parseInt(item.toString().substring(0, 1));
        String reportPartContent = reportPartController.getReportPartContent(reportPartId);
        this.contentTimePartTextArea.setText(reportPartContent);
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void generateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportButtonActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Are you sure?", "", JOptionPane.YES_NO_OPTION)==0){
            // get list all person-content in person-contentpart
            String personContentPart = this.personContentPartTextArea.getText();
            if("".equals(personContentPart)){
                JOptionPane.showMessageDialog(rootPane, "Input file have wrong type. Can't not generate report!\n Choose a right input format or Add new report part file!");
                return;
            }
            String[] linesInPCPart = personContentPart.split("\n");
            List<PersonContent> personContents = new ArrayList<>();
            for (String line: linesInPCPart){
                if (line.length() != 0){
                    PersonContent personContent = new PersonContent();
                    String[] parts = line.split("-");
                    if (parts.length != 2){
                        JOptionPane.showMessageDialog(rootPane, "Input file have wrong type. Can't not generate report!\n Choose a right input format or Add new report part file!");
                        return;
                    }
                    personContent.setName(parts[0]);
                    personContent.setContent(parts[1]);
                    personContents.add(personContent);
                }
            }

            // get list all content-time in content-timepart
            String contentTimePart = this.contentTimePartTextArea.getText();
            if("".equals(contentTimePart)){
                JOptionPane.showMessageDialog(rootPane, "Input file have wrong type. Can't not generate report!\n Choose a right input format or Add new report part file!");
                return;
            }
            String[] linesInCTPart = contentTimePart.split("\n");
            List<ContentTime> contentTimes = new ArrayList<>();
            for (String line: linesInCTPart){
                if (line.length() != 0){
                    ContentTime contentTime = new ContentTime();
                    String[] parts = line.split("\\[");
                    if (parts.length != 2){
                        JOptionPane.showMessageDialog(rootPane, "Input file have wrong type. Can't not generate report!\n Choose a right input format or Add new report part file!");
                        return;
                    }
                    contentTime.setContent(parts[0]);
                    String[] timeparts = parts[1].split("\\~");
                    if (timeparts.length != 2){
                        JOptionPane.showMessageDialog(rootPane, "Input file have wrong type. Can't not generate report!\n Choose a right input format or Add new report part file!");
                        return;
                    }
                    contentTime.setTimeBegin(timeparts[0]);
                    contentTime.setTimeEnd(timeparts[1].substring(0, timeparts[1].length()-1));
                    contentTimes.add(contentTime);
                }
            }
            List<PersonContentTime> personContentTimes = new ArrayList<>();
            for(PersonContent pc : personContents){
                PersonContentTime pct = new PersonContentTime();
                pct.setName(pc.getName());
                pct.setContent(pc.getContent());

                for(ContentTime ct : contentTimes){

                    if (pct.getContent().equals(ct.getContent())){

                        pct.setTimeBegin(ct.getTimeBegin());
                        pct.setTimeEnd(ct.getTimeEnd());
                    }
                }
                System.out.println("PCT Object ready: \n PCT person: " + pct.getName() + "\n PCT content: "
                        + pct.getContent() + "\n PCT time begin: " + pct.getTimeBegin() + "\n PCT time end: "
                        + pct.getTimeEnd());
                personContentTimes.add(pct);
            }
            Report report = new Report();
            report.setMeetingId(GenerateReport.meetingId);
            report.setPersonContentTimes(personContentTimes);
            int result = reportController.generateReport(report);
            if (result == 0){
                JOptionPane.showMessageDialog(rootPane, "Failed! Try again!");
                GenerateReport.meetingId = 0;
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Success!");
                GenerateReport.meetingId = 0;
                this.dispose();
            }
        }
    }//GEN-LAST:event_generateReportButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        GenerateReport.meetingId = 0;
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextArea contentTimePartTextArea;
    private javax.swing.JButton generateReportButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea personContentPartTextArea;
    // End of variables declaration//GEN-END:variables
}
