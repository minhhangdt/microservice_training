package com.brownfield.pss.luggage.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.brownfield.pss.luggage.entity.Luggage;
import com.brownfield.pss.luggage.repository.LuggageRepository;

@Component 
public class LuggageComponent {
	private static final Logger logger = LoggerFactory.getLogger(LuggageComponent.class);

	LuggageRepository repository;
	Sender sender;
	
	public LuggageComponent(){
		
	}
	@Autowired
	public LuggageComponent(LuggageRepository repository,Sender sender){
		this.repository = repository;
		this.sender = sender;
	}

	public Luggage getLuggage(Long checkInId){ 
		return repository.getLuggageByCheckinId(checkInId);
	}                     

	public long createLuggage(Luggage luggage) {
		repository.save(luggage);
		logger.info("Save luggage into DB ");
		sender.send(luggage.getId());
		return luggage.getId();
	}
}
