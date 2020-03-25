package com.bartekmat.bikesystem.repositories;

import com.bartekmat.bikesystem.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
