package com.brownfield.pss.luggage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.brownfield.pss.luggage.entity.Luggage;

public interface LuggageRepository extends JpaRepository<Luggage, Long>{
	Luggage getLuggageByCheckinId(Long checkinId);
}
