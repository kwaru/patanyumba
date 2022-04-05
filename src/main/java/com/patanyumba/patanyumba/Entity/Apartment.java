package com.patanyumba.patanyumba.Entity;

import com.patanyumba.patanyumba.Utils.HouseEnums;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "apartment_table")
public class Apartment extends House{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long apartmentId;


    private HouseEnums inTrash;
    private Date dateCreated;
    private Date dateModified;
}
