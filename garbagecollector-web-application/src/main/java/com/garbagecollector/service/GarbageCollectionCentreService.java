package com.garbagecollector.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garbagecollector.domain.crud.GarbageCollectionCentreRepository;
import com.garbagecollector.domain.entity.CustomerDetails;
import com.garbagecollector.domain.entity.GarbageCollectionCentre;

@Service
public class GarbageCollectionCentreService {

	@Autowired
	private GarbageCollectionCentreRepository garbageCollectionCentreRepository;

	public GarbageCollectionCentre addGarbageCollectionCentre(GarbageCollectionCentre garbageCollectionCentre) {

		return garbageCollectionCentreRepository.save(garbageCollectionCentre);
	}

	public GarbageCollectionCentre getGarbageCollectionCentre(int id) {

		return garbageCollectionCentreRepository.findOne(id);
	}

	public List<GarbageCollectionCentre> getAllGarbageCollectionCentre() {

		List<GarbageCollectionCentre> gcLocDetails = new ArrayList<>();
		garbageCollectionCentreRepository.findAll().forEach(gcLocDetails::add);
		return gcLocDetails;

	}

}
