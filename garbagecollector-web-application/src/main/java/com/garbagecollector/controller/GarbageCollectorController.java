package com.garbagecollector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.garbagecollector.domain.entity.CustomerDetails;
import com.garbagecollector.domain.entity.GarbageCollectionCentre;
import com.garbagecollector.service.GarbageCollectionCentreService;

@Controller
public class GarbageCollectorController {

	@Autowired
	private GarbageCollectionCentreService garbageCollectionCentreService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/addGarbageCollectionCentre")
	public String addGarbageCollectionCentre() {
		return "garbagecollectioncentre";
	}

	
	
	@RequestMapping(method = RequestMethod.POST, value = "/saveGarbageCollectionCentre")
	public String saveGarbageCollectionCentre(@RequestParam("isCollectorAvailable") boolean isCollectorAvailable, Model model) {
		GarbageCollectionCentre gcCentre = new GarbageCollectionCentre();
		gcCentre.setCollectoravailability(isCollectorAvailable);
		gcCentre.setGcaddrlatitude((float) 31.7167);
		gcCentre.setGcaddrlongitude((float)73.9850);
		
		gcCentre = garbageCollectionCentreService.addGarbageCollectionCentre(gcCentre);

		model.addAttribute("heading", "Garbage Collection Centre info Saved");
		model.addAttribute("Collector is Available", gcCentre.isCollectoravailability());
		

		return "garbagecollectioncentre";
	}

	
	
}
