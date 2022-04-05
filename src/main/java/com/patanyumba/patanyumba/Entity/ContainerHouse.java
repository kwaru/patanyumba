package com.patanyumba.patanyumba.Entity;


import com.patanyumba.patanyumba.Utils.HouseEnums;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "container_house")
public class ContainerHouse extends House{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long containerHouseId;


    private HouseEnums inTrash;
    private Date dateCreated;
    private Date dateModified;
}
