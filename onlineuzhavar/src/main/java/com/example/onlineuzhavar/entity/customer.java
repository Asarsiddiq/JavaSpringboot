package com.example.onlineuzhavar.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Customer")
public class customer {

    @Id
    @Column(name = "Customer_id",length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    @Column(name = "Customer_name",length = 50)
    private String cname;
    @Column(name = "Customer_mob",length = 12)
    private int contact;

    public customer(int cid, String cname, int contact) {
        this.cid = cid;
        this.cname = cname;
        this.contact = contact;
    }

    public customer(String cname, int contact) {

        this.cname = cname;
        this.contact = contact;
    }

    public customer() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }



    @Override
    public String toString() {
        return "customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", contact=" + contact +
                '}';
    }
}
