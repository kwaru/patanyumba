package com.patanyumba.patanyumba.Repository;

import com.patanyumba.patanyumba.Entity.MabatiHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MabatiHouseRepository  extends JpaRepository<MabatiHouse,Long> {
}
