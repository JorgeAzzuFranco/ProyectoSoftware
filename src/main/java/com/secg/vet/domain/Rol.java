package com.secg.vet.domain;

import javax.persistence.*;

@Entity
@Table(schema="public",name="role")
public class Rol {

    @Id
    @GeneratedValue(generator = "role_id_role_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "role_id_role_seq", sequenceName = "public.role_id_role_seq", allocationSize = 1)
    @Column(name="id_role")
    private int pk_role;

    @Column(name="rol")
    private String rol;

    public Rol() {
    }

    public int getPk_role() {
        return pk_role;
    }

    public void setPk_role(int pk_role) {
        this.pk_role = pk_role;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
