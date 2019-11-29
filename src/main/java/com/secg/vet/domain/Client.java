package com.secg.vet.domain;

import javax.persistence.*;

@Entity
@Table(schema="public",name="cliente")
public class Client {

    @Id
    @GeneratedValue(generator = "duenio_id_user_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "duenio_id_user_seq", sequenceName = "public.duenio_id_user_seq", allocationSize = 1)
    @Column(name="id")
    private int pk_duenio;

    @Column(name="nombre")
    private String name;

    @Column(name="telefono")
    private Integer phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_mascota")
    private Pet mascota;

    public Client() {
    }

    public int getPk_duenio() {
        return pk_duenio;
    }

    public void setPk_duenio(int pk_duenio) {
        this.pk_duenio = pk_duenio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() { return phone; }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Pet getPet() { return mascota; }

    public void setPet(Pet mascota) {
        this.mascota = mascota;
    }
}
