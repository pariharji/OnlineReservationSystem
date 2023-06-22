/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineRS.pojo;

import java.sql.Date;

/**
 *
 * @author Acer
 */
public class Bookingpojo {

    public Bookingpojo(String name, int age, String gender, String trainname, int trainNo, double price, String pnr, Date date, String destination, String boording) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.trainname = trainname;
        this.trainNo = trainNo;
        this.price = price;
        this.pnr = pnr;
        this.date = date;
        this.destination = destination;
        this.boording = boording;
    }
    public Bookingpojo(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getBoording() {
        return boording;
    }

    public void setBoording(String boording) {
        this.boording = boording;
    }
    private String name;
    private int age;
    private String gender;
    private String trainname;
    private int trainNo;
    private double price;
    private String pnr;
    private Date date;
    private String destination;
    private String boording;
    
}
