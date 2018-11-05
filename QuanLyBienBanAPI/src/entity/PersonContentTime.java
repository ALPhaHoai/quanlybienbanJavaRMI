/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author thanhdovan
 */
public class PersonContentTime implements Serializable{
    private String name;
    private String content;
    private String timeBegin;
    private String timeEnd;

    public PersonContentTime() {
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getTimeBegin() {
        return timeBegin;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTimeBegin(String timeBegin) {
        this.timeBegin = timeBegin;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }
    
}
