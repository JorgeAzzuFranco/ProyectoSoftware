package com.secg.vet.domain;

import javax.persistence.*;

@Entity
@Table(name="medicina")
public class Medicine {

    @Id
    @GeneratedValue(generator = "medicina_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "medicina_id_seq", sequenceName = "public.medicina_id_seq", allocationSize = 1)
    private Integer id;
    @Column(name="nombre")
    private String name;
    @Column(name="dosis")
    private String dose;
    @Column(name="cantidad")
    private Integer quantity;
    @Column(name="descripcion")
    private String description;
    @Column(name = "mascxmed")
    private Integer mascXMed;

    public Medicine() {
    }

    public Medicine(String name, String dose, Integer quantity, Integer mascXMed) {
        this.name = name;
        this.dose = dose;
        this.quantity = quantity;
        this.mascXMed = mascXMed;
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

    public Integer getMascXMed() {
        return mascXMed;
    }

    public void setMascXMed(Integer mascXMed) {
        this.mascXMed = mascXMed;
    }
}
