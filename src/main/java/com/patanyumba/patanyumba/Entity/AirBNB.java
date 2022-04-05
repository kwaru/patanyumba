package com.patanyumba.patanyumba.Entity;

import com.patanyumba.patanyumba.Utils.HouseEnums;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "air_bnb_table")
public class AirBNB extends House{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long airBnbId;


    private HouseEnums inTrash;
    private Date dateCreated;
    private Date dateModified;
}
