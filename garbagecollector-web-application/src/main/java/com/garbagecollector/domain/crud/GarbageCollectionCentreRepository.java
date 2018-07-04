package com.garbagecollector.domain.crud;

import org.springframework.data.repository.CrudRepository;

import com.garbagecollector.domain.entity.GarbageCollectionCentre;

public interface GarbageCollectionCentreRepository extends CrudRepository<GarbageCollectionCentre, Integer> {

}
