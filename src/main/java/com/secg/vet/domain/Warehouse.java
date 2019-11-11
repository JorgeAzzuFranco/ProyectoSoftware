package com.secg.vet.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema="public",name="almacen")
public class Warehouse {

    @Id
    @GeneratedValue(generator = "almacen_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "almacen_id_seq", sequenceName = "public.almacen_id_seq", allocationSize = 1)
    @Column(name="id")
    private int pk_almacen;

    @NotEmpty(message="Ingrese el código")
    @NotNull
    @Column(name="sku")
    private String sku;

    @NotEmpty(message="Ingrese el nombre del producto")
    @NotNull
    @Column(name="nombre_producto")
    private String nombre_producto;

    @NotNull
    @Column(name="cantidad")
    private int cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proveedor")
    private Provider provider;

    public int getPk_almacen() {
        return pk_almacen;
    }

    public void setPk_almacen(int pk_almacen) {
        this.pk_almacen = pk_almacen;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
