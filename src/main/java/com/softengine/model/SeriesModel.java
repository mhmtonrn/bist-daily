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

    @Getter
    @Setter
//    @Temporal(value = "UST")
    private Double ust;

    @Getter
    @Setter
//    @Temporal("ALT")
    private Double alt;

    @Getter
    @Setter
//    @Temporal("FARK")
    private Double fark;
}
