package model;

public class Contacts {
    private String name;
    private String phoneno;
    private String address;
    private  String email;
    private int imageid;

    //constructor
    public Contacts(String name, String phoneno,String address,String email, int imageid) {
        this.name = name;
        this.phoneno = phoneno;
        this.imageid = imageid;
        this.address = address;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
}
