package com.api.Specialization.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "doctorlist3")
public class Doctor {
    @Id
    private String _id;
    @Field("age")
    private int age;
    @Field("firstname")
    private String firstName;
    @Field("lastname")
    private String lastName;
    @Field("speciality")
    private List<String> speciality;
    @Field("rating")
    private double rating;
    @Field("contact")
    private Contact contact;
    @Field("workplace")
    private List<Workplace> workplace;
    @Field("disponibility")
    private List<String> disponibility;
    public Doctor(String _id, int age, String firstName, String lastName, List<String> speciality, double rating, Contact contact, List<Workplace> workplace, List<String> disponibility) {
        this._id = _id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.rating = rating;
        this.contact = contact;
        this.workplace = workplace;
        this.disponibility = disponibility;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Workplace> getWorkplace() {
        return workplace;
    }

    public void setWorkplace(List<Workplace> workplace) {
        this.workplace = workplace;
    }

    public List<String> getSpeciality() {
        return speciality;
    }

    public void setSpeciality(List<String> speciality) {
        this.speciality = speciality;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getDisponibility() {
        return disponibility;
    }

    public void setDisponibility(List<String> disponibility) {
        this.disponibility = disponibility;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
