package com.patanyumba.patanyumba.Entity;

import com.patanyumba.patanyumba.Utils.HouseEnums;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bungalow_table")
public class Bungalow extends House{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bungalowId;



    private HouseEnums inTrash;
    private Date dateCreated;
    private Date dateModified;
}
