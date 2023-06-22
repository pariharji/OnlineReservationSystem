/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineRS.pojo;

/**
 *
 * @author Acer
 */
public class Trainpojo {

    public Trainpojo(int trno, String trainname, String startplace, String destination, double price) {
        this.trno = trno;
        this.trainname = trainname;
        this.startplace = startplace;
        this.destination = destination;
        this.price = price;
    }
    public Trainpojo() {
        
    }

    public int getTrno() {
        return trno;
    }

    public void setTrno(int trno) {
        this.trno = trno;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getStartplace() {
        return startplace;
    }

    public void setStartplace(String startplace) {
        this.startplace = startplace;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    private int trno;
    private String trainname;
    private String startplace;
    private String destination;
    private double price;
}
