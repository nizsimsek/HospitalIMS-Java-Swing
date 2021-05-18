package com.nizsimsek.hospitalims.Entities.Concrete;

import com.nizsimsek.hospitalims.Entities.Abstract.IEntity;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User implements IEntity {

    @Column(name = "Id")
    private int Id;

    @Id
    @Column(name = "Username")
    private String Username;

    @Column(name = "Password")
    private String Password;

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public User() {
    }

    public User(String username, String password) {
        Username = username;
        Password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
