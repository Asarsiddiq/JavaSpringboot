package com.example.onlineuzhavar.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class CustomerDTO {


    private int cid;


    private String cname;

    private int contact;


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

    public CustomerDTO() {
    }

    public CustomerDTO(int cid, String cname, int contact) {
        this.cid = cid;
        this.cname = cname;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", contact=" + contact +
                '}';
    }
}
