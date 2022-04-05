package com.patanyumba.patanyumba.Entity;

import com.patanyumba.patanyumba.Utils.HouseEnums;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mabati_house")
public class MabatiHouse extends  House{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mabatiHouseId;

    private HouseEnums inTrash;
    private Date dateCreated;
    private Date dateModified;


}
