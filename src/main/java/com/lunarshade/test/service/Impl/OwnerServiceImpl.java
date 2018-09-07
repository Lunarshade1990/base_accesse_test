package com.lunarshade.test.service.Impl;

import com.lunarshade.test.entity.Owner;
import com.lunarshade.test.repository.OwnerRepository;
import com.lunarshade.test.service.OwnerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;


    @Override
    public Owner addOwner(Owner owner) {
        Owner savedOwner = ownerRepository.saveAndFlush(owner);
        return savedOwner;
    }

    @Override
    public void delete(Integer id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner editOwner(Owner owner) {
        return ownerRepository.saveAndFlush(owner);
    }

    @Override
    public List<Owner> getAll() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner findByName(String name) {
        return ownerRepository.findByName(name);
    }
}
