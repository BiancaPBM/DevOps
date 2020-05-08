package com.api.Specialization.repository.speciality;

import com.api.Specialization.models.Speciality;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//DOAR INCEPUT...va fi implementat ulterior
@Repository
public interface SpecialityRepository extends MongoRepository<Speciality, String>{
    List<Speciality> findAll(Sort sortOrder);
    List<Speciality> findByNameContainingIgnoreCase(String name);
    List<Speciality> findByDescriptionContainingIgnoreCase(String word);

}
