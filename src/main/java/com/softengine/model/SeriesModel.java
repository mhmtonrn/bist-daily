package com.softengine.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "series")
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SeriesModel {
    @Id
    @Getter
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    private String id;

    @Getter
    @Setter
    @Column(name = "firma")
    private String firma;

    @Getter
    @Setter
    @Column(name = "tarih")
    private String tarih;

    @Getter
    @Setter
    @Column(name = "deger")
    private Double deger;

}
