/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author thanhdovan
 */
public class Report implements Serializable{
    private int id;
    private int meetingId;
    private List<PersonContentTime> personContentTimes;

    public Report() {
    }

    public int getId() {
        return id;
    }

    public int getMeetingId() {
        return meetingId;
    }

    public List<PersonContentTime> getPersonContentTimes() {
        return personContentTimes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMeetingId(int meetingId) {
        this.meetingId = meetingId;
    }

    public void setPersonContentTimes(List<PersonContentTime> personContentTimes) {
        this.personContentTimes = personContentTimes;
    }
    
}
