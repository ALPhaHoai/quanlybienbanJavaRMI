/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybienbanclientController;

import entity.Report;
import quanlybienbanclientModel.ReportModel;

/**
 *
 * @author thanhdovan
 */
public class ReportController {
    private ReportModel reportModel;

    public ReportController() {
        this.reportModel = new ReportModel();
    }
    
    public int generateReport(Report report){
        return reportModel.generateReport(report);
    }
}
