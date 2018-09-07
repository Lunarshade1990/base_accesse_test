package com.lunarshade.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lunarshade.test.entity.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {
    Owner findByName(String name);
}
