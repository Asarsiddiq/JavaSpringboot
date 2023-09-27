package com.example.onlineuzhavar.DTO;

public class CustomerSaveDTO {




    private String cname;

    private int contact;



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

    public CustomerSaveDTO() {
    }

    public CustomerSaveDTO(String cname, int contact) {

        this.cname = cname;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +

                ", cname='" + cname + '\'' +
                ", contact=" + contact +
                '}';
    }
}
