package com.training.rest_services.entity;
import java.util.Objects;

public class Address {
    private int houseno;
    private String street;
    private String city;
    private String state;
    private int zip;

    public Address() {
    }

    public Address(int houseno, String street, String city, String state, int zip) {
        this.houseno = houseno;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getHouseno() {
        return this.houseno;
    }

    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return this.zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Address houseno(int houseno) {
        setHouseno(houseno);
        return this;
    }

    public Address street(String street) {
        setStreet(street);
        return this;
    }

    public Address city(String city) {
        setCity(city);
        return this;
    }

    public Address state(String state) {
        setState(state);
        return this;
    }

    public Address zip(int zip) {
        setZip(zip);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Address)) {
            return false;
        }
        Address address = (Address) o;
        return houseno == address.houseno && Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && zip == address.zip;
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseno, street, city, state, zip);
    }

    @Override
    public String toString() {
        return "{" +
            " houseno='" + getHouseno() + "'" +
            ", street='" + getStreet() + "'" +
            ", city='" + getCity() + "'" +
            ", state='" + getState() + "'" +
            ", zip='" + getZip() + "'" +
            "}";
    }
}
