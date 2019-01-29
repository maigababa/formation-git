/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loga.formation.git;

/**
 *
 * @author Loga poste3
 */
public class Person {
    
    private Long id;
    private String firstname;
    private String lastname;
    private String adress;

    
    public Person(String firstname, String lastname, String adress, Long id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.id = id;
    }

    public Person() {
    }

     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    
    
}
