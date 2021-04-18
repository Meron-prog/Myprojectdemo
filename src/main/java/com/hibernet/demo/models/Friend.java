package com.hibernet.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //när en klass motsvarar av en tabell i en databas
public class Friend {
    @Id
    @GeneratedValue //default typ auto increment
    private Long id;
    private String name;
    private String adress;
    private String email;
    private String phonenumber;

    public Friend() { //måste ha en tom constructor
    }
    public Friend(Long id, String name, String adress,String email, String phonenumber){
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.email=email;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Adress='" + adress + '\'' +
                ", Email='" + email + '\'' +
                ", Phonenumber='" + phonenumber + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
