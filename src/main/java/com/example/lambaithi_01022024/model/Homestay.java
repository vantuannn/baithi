package com.example.lambaithi_01022024.model;

import javax.persistence.*;

@Entity
@Table(name = "homestays")
public class Homestay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;
    private int numberRoom;
    private double price;
    private int numberWC;
    private String details;

    @Override
    public String toString() {
        return "Homestay{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", numberRoom=" + numberRoom +
                ", price=" + price +
                ", numberWC=" + numberWC +
                ", details='" + details + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberWC() {
        return numberWC;
    }

    public void setNumberWC(int numberWC) {
        this.numberWC = numberWC;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Homestay() {
    }

    public Homestay(int id, String name, String city, int numberRoom, double price, int numberWC, String details) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.numberRoom = numberRoom;
        this.price = price;
        this.numberWC = numberWC;
        this.details = details;
    }
}
