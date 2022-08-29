package com.example.lesson4.repository;

import com.example.lesson4.entity.District;
import com.example.lesson4.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {
}
