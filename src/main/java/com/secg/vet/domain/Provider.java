package com.secg.vet.domain;

import javax.persistence.*;

@Entity
@Table(schema="public",name="proveedor")
public class Provider {

    @Id
    @GeneratedValue(generator = "proveedor_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "proveedor_id_seq", sequenceName = "public.proveedor_id_seq", allocationSize = 1)
    @Column(name="id")
    private int pk_proveedor;

    @Column(name="nombre_proveedor")
    private String nombre_proveedor;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="telefono_principal")
    private String telefono_principal;

    public Provider() {
    }

    public Provider(String nombre_proveedor, String descripcion, String telefono_principal) {
        this.nombre_proveedor = nombre_proveedor;
        this.descripcion = descripcion;
        this.telefono_principal = telefono_principal;
    }

    public int getPk_proveedor() {
        return pk_proveedor;
    }

    public void setPk_proveedor(int pk_proveedor) {
        this.pk_proveedor = pk_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono_principal() {
        return telefono_principal;
    }

    public void setTelefono_principal(String telefono_principal) {
        this.telefono_principal = telefono_principal;
    }
}
