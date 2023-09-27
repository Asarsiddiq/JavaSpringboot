package com.example.onlineuzhavar.DTO;

public class CustomerUpdateDTO {

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

    public CustomerUpdateDTO() {
    }

    public CustomerUpdateDTO(int cid, String cname, int contact) {
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
