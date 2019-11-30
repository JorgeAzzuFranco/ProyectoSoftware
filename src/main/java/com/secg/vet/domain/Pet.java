package com.secg.vet.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="mascota")
public class Pet {

    @Id
    @GeneratedValue(generator = "mascota_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "mascota_id_seq", sequenceName = "public.mascota_id_seq", allocationSize = 1)
    private Integer id;
    @Column(name="nombre")
    private String name;
    @Column(name="razon")
    private String description;
    @Column(name="raza")
    private String race;
    @Column(name = "peso")
    private Double weight;

    @OneToMany(mappedBy = "mascXMed", fetch = FetchType.LAZY)
    private List<Medicine> medicineList;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="duenio_id")
    private Client client;

    public Pet() {
    }

    public Pet(String name, String description, String race, Double weight, Client client) {
        this.name = name;
        this.description = description;
        this.race = race;
        this.weight = weight;
        this.client = client;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Client getClient() {
        return client;
    }

    public String getClientName(){
        return this.client.getName();
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(List<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
}
