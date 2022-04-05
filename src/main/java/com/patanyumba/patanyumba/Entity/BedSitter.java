package com.patanyumba.patanyumba.Entity;

import com.patanyumba.patanyumba.Utils.HouseEnums;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bed_sitter")
public class BedSitter extends House{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bedSitterId;


    private HouseEnums inTrash;
    private Date dateCreated;
    private Date dateModified;
}
