package com.nizsimsek.hospitalims.Entities.Concrete;

import com.nizsimsek.hospitalims.Entities.Abstract.IEntity;

import javax.persistence.*;

@Entity
@Table(name = "Patient")
public class Patient implements IEntity {

    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Surname")
    private String Surname;

    @Id
    @Column(name = "NationalId")
    private String NationalId;

    @Column(name = "Gender")
    private String Gender;

    @Column(name = "Status")
    private String Status;

    @Override
    public String toString() {
        return "Patient{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", NationalId='" + NationalId + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }

    public Patient() {
    }

    public Patient(String name, String surname, String nationalId, String gender, String status) {
        Name = name;
        Surname = surname;
        NationalId = nationalId;
        Gender = gender;
        Status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getNationalId() {
        return NationalId;
    }

    public void setNationalId(String nationalId) {
        NationalId = nationalId;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
