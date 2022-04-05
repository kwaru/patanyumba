package com.patanyumba.patanyumba.Repository;

import com.patanyumba.patanyumba.Entity.AirBNB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AirBnbRepository extends JpaRepository<AirBNB, Long> {


}
