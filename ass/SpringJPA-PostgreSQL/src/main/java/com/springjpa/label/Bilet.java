package com.springjpa.label;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity(name = "LABELS")
@Table(name = "labels")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "carrier", discriminatorType = DiscriminatorType.STRING)
public abstract class Bilet {

    @Id
    @SequenceGenerator(name = "label_id_seq", sequenceName = "label_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "label_id_seq")
    @Column(name = "label_id", nullable = false)
    private Long id;

    @Column(name = "tc")
    private String tc;

    @Column(name = "musteri_adi")
    private String musteriAdi;

    @Column(name = "soyadi")
    private String soyadi;

    @Column(name = "firma_adi")
    private String firmaAdi;

    @Column(name = "zpl_code")
    private String zplCode;

    @Column(name = "koltuk_no")
    private String koltukNo;

    @Column(name = "uretim_tarihi")
    private Date uretimTarihi;

     @Column(name = "Tracking_number")
     private Date trackingNumber;

    @Column(name = "generation_date")
    private Date generationDate;



}