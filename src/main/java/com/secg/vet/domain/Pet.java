package com.secg.vet.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="mascota")
public class Pet {

    @Id
    private Integer id;
    @Column(name="nombre")
    private String name;
    @Column(name="razon")
    private String description;
    @OneToMany(mappedBy = "mascXMed", fetch = FetchType.LAZY)
    private List<Medicine> medicineList;

    public Pet() {
    }

    public Pet(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
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
