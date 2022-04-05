package com.patanyumba.patanyumba.Repository;

import com.patanyumba.patanyumba.Entity.BedSitter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedSitterRepository extends JpaRepository<BedSitter,Long> {
}
