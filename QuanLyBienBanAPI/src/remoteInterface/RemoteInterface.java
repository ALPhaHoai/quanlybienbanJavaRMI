/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remoteInterface;

import entity.Meeting;
import entity.PeopleEditReport;
import entity.Report;
import entity.ReportPart;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import entity.User;

/**
 *
 * @author thanhdovan
 */
public interface RemoteInterface extends Remote{
    // server
    public void clientLogoutMessage(User user) throws RemoteException;
    
    // interface for user
    public List<User> getUsers() throws RemoteException;
    public User getUser(String username, String password) throws RemoteException;
    public User getUser(int id) throws RemoteException;
    public int addUser(User user) throws RemoteException;
    public int editUser(User user) throws RemoteException;
    public int deleteUser(User user) throws RemoteException;
    
    // end interface for user
    
    // interface for meeting
    public List<Meeting> getMeetings() throws RemoteException;
    public Meeting getMeeting(int meetingId) throws RemoteException;
    public int addMeeting(Meeting meeting) throws RemoteException;
    public int editMeeting(Meeting meeting) throws RemoteException;
    public int deleteMeeting(Meeting meeting) throws RemoteException;
    
    // end interface for Meeting
    
    //interface for report
    public int generateReport(Report report, Meeting meeting) throws RemoteException;
    public List<Report> getReports(int meetingId) throws RemoteException;
    public String getReportContent(int reportId) throws RemoteException;
    public Report getReport(int reportId) throws RemoteException;
    public int addReport(Report report) throws RemoteException;
    //end interface for report
    
    //interface for filetext
    public int deleteReportPart(int reportPartId) throws RemoteException;
    public int uploadFile(ReportPart reportPart) throws RemoteException;
    public List<ReportPart> getReportParts(int type, int meetingId) throws RemoteException;
    public String getReportPartContent(int reportPartId) throws RemoteException;
    //end interface for filetext

    public int addPeopleEdit(PeopleEditReport per) throws RemoteException;
    public List<Integer> getIdOfUserEdit(int reportId) throws RemoteException;
    public int getPeopleEdit(PeopleEditReport per) throws RemoteException;
    public int removePeopleEdit(int peopleEditId) throws RemoteException;
}
