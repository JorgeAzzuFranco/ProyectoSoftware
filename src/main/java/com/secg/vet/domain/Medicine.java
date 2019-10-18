package com.secg.vet.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicina")
public class Medicine {

    @Id
    private Integer id;
    @Column(name="nombre")
    private String name;
    @Column(name="dosis")
    private String dose;
    @Column(name="cantidad")
    private Integer quantity;
    @Column(name="descripcion")
    private String description;

    public Medicine() {
    }

    public Medicine(Integer id, String name, String dose, Integer quantity, String description) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantity = quantity;
        this.description = description;
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

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
