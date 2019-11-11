package com.secg.vet.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="duenio")
public class Owner {

    @Id
    private Integer id;
    @Column(name="nombre")
    private String name;
    @Column(name="mascota")
    private String pet;

    public Owner(){

    };

    public Owner(Integer id, String name, String pet) {
        this.id = id;
        this.name = name;
        this.pet = pet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }
}
