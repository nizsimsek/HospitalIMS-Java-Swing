package com.nizsimsek.hospitalims.Entities.Concrete;

import com.nizsimsek.hospitalims.Entities.Abstract.IEntity;

import javax.persistence.*;

@Entity
@Table(name = "Personnel")
public class Personnel implements IEntity {

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

    @Column(name = "Field")
    private String Field;

    @Override
    public String toString() {
        return "Personnel{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", NationalId='" + NationalId + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Field='" + Field + '\'' +
                '}';
    }

    public Personnel() {

    }

    public Personnel(String name, String surname, String nationalId, String gender, String field) {
        Name = name;
        Surname = surname;
        NationalId = nationalId;
        Gender = gender;
        Field = field;
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

    public String getField() {
        return Field;
    }

    public void setField(String field) {
        Field = field;
    }
}
