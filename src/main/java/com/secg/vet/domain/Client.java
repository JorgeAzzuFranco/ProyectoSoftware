package com.secg.vet.domain;

import javax.persistence.*;

@Entity
@Table(schema="public",name="client")
public class Client {

    @Id
    @GeneratedValue(generator = "client_pk_client_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "client_pk_client_seq", sequenceName = "public.client_pk_client_seq", allocationSize = 1)
    @Column(name="pk_client")
    private int pk_client;

    @Column(name="nombre")
    private String name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="phone")
    private Integer phone;

    public Client() {
    }

    public Client(String name, String last_name, Integer phone) {
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
    }

    public int getPk_client() {
        return pk_client;
    }

    public void setPk_client(int pk_client) {
        this.pk_client = pk_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
