package org.example;

public class Address{
    protected Integer streetNumber;
    protected String streetName;
    protected String postCode;

    public Address(Integer streetNumber, String streetName, String postCode){
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postCode = postCode;
    }
}
