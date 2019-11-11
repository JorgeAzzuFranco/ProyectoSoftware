package com.secg.vet.domain;

import javax.persistence.*;
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
    @Column(name="fnac")
    private Date birthDate;
    @Column(name = "peso")
    private Double weight;
    @OneToMany(mappedBy = "mascXMed", fetch = FetchType.LAZY)
    private List<Medicine> medicineList;

    public Pet() {
    }

    public Pet(String name, String description, String race, Date birthDate, Double weight) {
        this.name = name;
        this.description = description;
        this.race = race;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
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

    public List<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(List<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
}
