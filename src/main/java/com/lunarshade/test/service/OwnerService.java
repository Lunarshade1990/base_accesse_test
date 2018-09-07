package com.lunarshade.test.service;

import java.util.List;

import com.lunarshade.test.entity.Owner;

public interface OwnerService {

     Owner addOwner(Owner owner);
     void delete(Integer id);
     Owner editOwner(Owner owner);
     List<Owner> getAll();
     Owner findByName(String name);
}


