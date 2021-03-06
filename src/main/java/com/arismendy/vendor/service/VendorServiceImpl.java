package com.arismendy.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arismendy.vendor.entities.Vendor;
import com.arismendy.vendor.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	VendorRepository vendorRepository;

	@Override
	public Vendor saveVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		vendorRepository.delete(vendor);
	}

	@Override
	public Vendor getVendorById(int id) {
		return vendorRepository.findById(id).get();
	}

	@Override
	public List<Vendor> getAllVendors() {
		return vendorRepository.findAll();
	}

	public VendorRepository getVendorRepository() {
		return vendorRepository;
	}

	public void setVendorRepository(VendorRepository vendorRepository) {
		this.vendorRepository = vendorRepository;
	}

}
