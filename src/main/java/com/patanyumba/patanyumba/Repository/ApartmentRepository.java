package com.patanyumba.patanyumba.Repository;

import com.patanyumba.patanyumba.Entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment,Long> {
}
