/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Hardik
 */
public class HealthEventWorkRequest extends WorkRequest{
    
    private String ngoName;
    private String healthWorkshopName;
    private String doctorRequired;
    private String date;
    private String venue;
    private String duration;
    private String comments;
    private String deadline;
    Date eventDate;
    private ArrayList<String> enterpriseList;
    
    private ArrayList<Employee> doctorList;
    private ArrayList<Employee> doctorWaitList;
    
    public HealthEventWorkRequest(){
    this.doctorList = new ArrayList();
    this.doctorWaitList = new ArrayList();
    this.enterpriseList = new ArrayList();
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }    

    public ArrayList<String> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<String> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    
    

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public String getHealthWorkshopName() {
        return healthWorkshopName;
    }

    public void setHealthWorkshopName(String healthWorkshopName) {
        this.healthWorkshopName = healthWorkshopName;
    }

    public String getDoctorRequired() {
        return doctorRequired;
    }

    public void setDoctorRequired(String doctorRequired) {
        this.doctorRequired = doctorRequired;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public ArrayList<Employee> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Employee> doctorList) {
        this.doctorList = doctorList;
    }

    public ArrayList<Employee> getDoctorWaitList() {
        return doctorWaitList;
    }

    public void setDoctorWaitList(ArrayList<Employee> doctorWaitList) {
        this.doctorWaitList = doctorWaitList;
    }
    
    @Override
    public String toString() {
        return healthWorkshopName+" ";
    }
    
}
