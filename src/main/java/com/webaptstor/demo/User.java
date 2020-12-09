package com.webaptstor.demo;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.sql.Timestamp;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String login;

    private String first_name;

    private String last_name;

    private String email;

    private String password;

    private Timestamp created_at;
    private Timestamp updated_at;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String name) {
        this.login = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
