package com.karabeinikovAntonSikret87.app.homework.lesson17.HIW1;

import java.io.Serializable;

/**
 * Created by AntonKa on 6/6/2017.
 */
public class Record implements Serializable, Cloneable {
    private final long id;
    private String phone;
    private String name;
    private String address;
    Record(long id, String phone, String name, String address) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        return name + ": " + phone + ", " + address;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Record other = (Record) obj;
        if ((this.phone == null) ? (other.phone != null) : !this.phone.equals(other.phone)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.address == null) ? (other.address != null) : !this.address.equals(other.address)) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 61 * hash + (this.phone != null ? this.phone.hashCode() : 0);
        hash = 61 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 61 * hash + (this.address != null ? this.address.hashCode() : 0);
        return hash;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public long getId() {
        return id;
    }
    public String getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

}
