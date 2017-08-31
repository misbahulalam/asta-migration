package com.cefalo.asta.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author <a href="mailto:misbahulalam@gmail.com">Md. Misbahul Alam Chowdhury</a> on Aug 31, 2017
 * @since 1.0
 */

@Entity
@Table(name = "depotinstitusjon")
@Getter
@Setter
public class Institute implements Serializable {

    @Id
    @Column(name = "ID", length = 255)
    protected String id;

    @Column(name = "ADRESSE", length = 255)
    protected String address;

    @Column(name = "NAVN", length = 255, nullable = false)
    protected String name;

    @Column(name = "FILTJENESTEURL", length = 255)
    protected String fileServiceUrl;

    @Column(name = "INSTITUSJONSEPOST", length = 300, nullable = false)
    protected String institutionsEMail;

    @Column(name = "TELEFON", length = 255, nullable = false)
    protected String telephone;

    @Column(name = "FAKS", length = 255)
    protected String fax;

    @Column(name = "LOGOURN", length = 255)
    protected String logoUrn;

    @Column(name = "HENVENDELSEEPOST", length = 300, nullable = false)
    protected String enquiryEmail;

    @Column(name = "POSTNR", length = 255, nullable = false)
    protected String postalCode;

    @Column(name = "POSTSTED", length = 255, nullable = false)
    protected String postal;

    @Column(name = "APNINGSTIDER", length = 255)
    protected String openingHours;

    @Column(name = "nettside", length = 255)
    protected String webPage;

    @Column(name = "KLAUSULERTMATERIALE", length = 2000)
    protected String restrictedMaterial;

    @Column(name = "BESKRIVELSE", length = 4000)
    protected String description;

    @Column(name = "ADRESSE2", length = 400)
    protected String address2;

    @Column(name = "besoksadresse", length = 255, nullable = false)
    protected String officeAddress;

    @Column(name = "postadresse", length = 255, nullable = false)
    protected String mailingAddress;

}
