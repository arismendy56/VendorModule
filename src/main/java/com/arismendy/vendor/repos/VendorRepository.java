package com.arismendy.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arismendy.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
