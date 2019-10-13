package com.secg.vet.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicina")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medicine {

    @Id
    Integer id;
    @Column(name="nombre")
    String name;
    @Column(name="dosis")
    String dose;
    @Column(name="cantidad")
    Integer quantity;
    @Column(name="descripcion")
    String description;

}
