/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybienbanclientView;

import entity.Meeting;
import entity.Report;
import entity.User;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlybienbanclientController.MeetingController;
import quanlybienbanclientController.ReportController;
import quanlybienbanclientController.UserController;
import registry.Register;
import remoteInterface.RemoteInterface;

/**
 *
 * @author thanhdovan
 */
public class GUIManagerClient extends javax.swing.JFrame {
    private final MeetingController meetingController;
    private final UserController userController;
    private final ReportController reportController;
    public static User user;
    public static void updateTable(List<Meeting> list){
        Object[] column = {"Id", "Meeting", "Date", "Time Start"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        try {
            for (Meeting u : list ){
                Object[] row = {"MID"+u.getId(), u.getTitle(), u.getDate(), u.getTimeStart()};
                model.addRow(row);
            }
            GUIManagerClient.jTable1.setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(GUIAdminClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Creates new form GUIManagerClient
     */
    public GUIManagerClient() {
        initComponents();
        this.nameLabel.setText(user.getUsername());
        meetingController = new MeetingController();
        reportController = new ReportController();
        userController = new UserController();
        List<Meeting> list = meetingController.getMeetings();
        GUIManagerClient.updateTable(list);
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
        welcomeLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        meetingText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        timeText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addMeetingButton = new javax.swing.JButton();
        viewReportButton = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        shareButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        welcomeLabel.setText("You are loggin in as Manager");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        nameLabel.setForeground(new java.awt.Color(0, 86, 255));
        nameLabel.setText("jLabel1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Meeting", "Date", "TimeStart"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Meeting");

        jLabel2.setText("Date");

        timeText.setText("HH:mm:ss");

        jLabel3.setText("Time");

        addMeetingButton.setText("Add a meeting");
        addMeetingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMeetingButtonActionPerformed(evt);
            }
        });

        viewReportButton.setText("View Report");
        viewReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit meeting info");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete meeting");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Reload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        reportButton.setText("Reporter");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        shareButton.setText("Share");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(welcomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addMeetingButton)
                                .addGap(92, 92, 92)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(shareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(editButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeText))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateChooserCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(meetingText, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLabel)
                    .addComponent(nameLabel)
                    .addComponent(logoutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(meetingText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editButton)
                            .addComponent(deleteButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reportButton)
                            .addComponent(shareButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewReportButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMeetingButton)
                    .addComponent(jButton1))
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

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        int row = GUIManagerClient.jTable1.getSelectedRow();
        this.meetingText.setText(GUIManagerClient.jTable1.getValueAt(row, 1).toString());
        Calendar cal = new GregorianCalendar();
        cal.setTime((Date)GUIManagerClient.jTable1.getValueAt(row, 2));
        this.dateChooserCombo1.setSelectedDate(cal);
        this.timeText.setText(GUIManagerClient.jTable1.getValueAt(row, 3).toString());
    }//GEN-LAST:event_jTable1MousePressed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(GUIManagerClient.jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(rootPane, "Choose a meeting first!");
            return;
        }
        if(JOptionPane.showConfirmDialog(rootPane, "Are you sure?", "", JOptionPane.YES_NO_OPTION) == 0){        
            String title = this.meetingText.getText();
            Calendar cal = this.dateChooserCombo1.getSelectedDate();
            java.util.Date date = cal.getTime();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            String timeStart = this.timeText.getText();
            if("".equals(title) || "".equals(timeStart)){
                JOptionPane.showMessageDialog(rootPane, "These fields are required");
                return;
            }
            DateFormat formatter = new SimpleDateFormat("HH:mm");
            Time timeValue = null;
            try {
                timeValue = new java.sql.Time(formatter.parse(timeStart).getTime());
            } catch (ParseException ex) {
                Logger.getLogger(GUIManagerClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            Meeting meeting = new Meeting();
            meeting.setId(Integer.parseInt(GUIManagerClient.jTable1.getValueAt(GUIManagerClient.jTable1.getSelectedRow(), 0).toString().substring(3)));
            meeting.setTitle(title);
            meeting.setDate(sqlDate);
            meeting.setTimeStart(timeValue);
            int i = meetingController.editMeeting(meeting);
            if (i > 0){
                JOptionPane.showMessageDialog(rootPane, "Success!");
                List<Meeting> list = meetingController.getMeetings();
                GUIManagerClient.updateTable(list);
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Failed! Please try again!");
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void addMeetingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMeetingButtonActionPerformed
        AddMeeting addMeetingForm = new AddMeeting();
        addMeetingForm.setVisible(true);
    }//GEN-LAST:event_addMeetingButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane,"Are you sure?", "", JOptionPane.YES_NO_OPTION) == 0){
            LoginForm lg = new LoginForm();
            lg.setVisible(true);
            this.setVisible(false);
            try{
                RemoteInterface stub = Register.registry();
                stub.clientLogoutMessage(GUIManagerClient.user);
            } catch (RemoteException | NotBoundException ex) {
                Logger.getLogger(GUIAdminClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            GUIManagerClient.user = new User();
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int rowSelected = GUIManagerClient.jTable1.getSelectedRow();
        if (rowSelected > 0){
            if(JOptionPane.showConfirmDialog(rootPane, "Are you sure?","",JOptionPane.YES_NO_OPTION) == 0){
                int meetingId = (int) GUIManagerClient.jTable1.getValueAt(rowSelected, 0);
                Meeting delmeeting = meetingController.getMeeting(meetingId);
                int i = meetingController.deleteMeeting(delmeeting);
                if (i > 0){
                    JOptionPane.showMessageDialog(rootPane, "Deleted!");
                    List<Meeting> list = meetingController.getMeetings();
                    GUIManagerClient.updateTable(list);
                }
                else
                    JOptionPane.showMessageDialog(rootPane, "Something's happened! Try again!");
            }
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Choose a meeting first!");
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportButtonActionPerformed
        int row = GUIManagerClient.jTable1.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(rootPane, "Choose a meeting first!");
        } else {
            int meetingId = Integer.parseInt(GUIManagerClient.jTable1.getValueAt(row, 0).toString().substring(3));
            Meeting meeting = meetingController.getMeeting(meetingId);
            if (meeting.getUserCreateId() == GUIManagerClient.user.getId()){
                List<Report> reports = reportController.getReports(meetingId);
                if(reports.isEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "Haven't have report yet! Generate report first!");
                    return;
                }
                GUIViewReport.meeting = meetingController.getMeeting(meetingId);
                GUIViewReport.user= GUIManagerClient.user;
                GUIViewReport viewReport = new GUIViewReport();
                viewReport.setVisible(true);
            }
            else {
                int creatorId = meetingController.getMeetingCreatorId(meeting);
                User creator = userController.getUser(creatorId);
                JOptionPane.showMessageDialog(rootPane, "You don't have permission to view report of this Meeting!\n"
                        + "Contact "+ creator.getUsername()+" to have the permission!");
            }
        }
    }//GEN-LAST:event_viewReportButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.meetingText.setText("");
        this.timeText.setText("HH:mm:ss");
        List<Meeting> list = meetingController.getMeetings();
        GUIManagerClient.updateTable(list);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        int row = GUIManagerClient.jTable1.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(rootPane, "Choose a meeting first!");
            return;
        }
        int meetingId = Integer.parseInt(GUIManagerClient.jTable1.getValueAt(row, 0).toString().substring(3));
        GUIReporter.meeting = this.meetingController.getMeeting(meetingId);
        GUIReporter guiReporter = new GUIReporter();
        guiReporter.setVisible(true);
    }//GEN-LAST:event_reportButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIManagerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIManagerClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMeetingButton;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField meetingText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton shareButton;
    private javax.swing.JTextField timeText;
    private javax.swing.JButton viewReportButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
