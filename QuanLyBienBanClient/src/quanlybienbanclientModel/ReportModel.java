/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybienbanclientModel;

import entity.Report;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import registry.Register;
import remoteInterface.RemoteInterface;

/**
 *
 * @author thanhdovan
 */
public class ReportModel {
    public int generateReport(Report report){
        try {
            RemoteInterface stub = Register.registry();
            return stub.generateReport(report);
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(ReportModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
