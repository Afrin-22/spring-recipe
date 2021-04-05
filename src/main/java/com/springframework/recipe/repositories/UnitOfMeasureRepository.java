package com.springframework.recipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springframework.recipe.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{

	Optional<UnitOfMeasure> findByUom(String uom);
	
}
