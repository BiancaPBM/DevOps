package com.api.Specialization.service;

import com.api.Specialization.models.Speciality;
import com.api.Specialization.repository.speciality.SpecialityRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SpecialityService implements ISpecialityService {
    private SpecialityRepository specialityRepository;

    public SpecialityService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    public List<Speciality> findAll(Sort sortOrder) {
        return specialityRepository.findAll(sortOrder);
    }

    public List<Speciality> findByNameContaining(String name) {
        return specialityRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Speciality> findByKeyword(String word) {
        return specialityRepository.findByDescriptionContainingIgnoreCase(word);
    }

    public void insert(Speciality speciality) {
        specialityRepository.insert(speciality);
    }

    public void update(Speciality speciality) {
        specialityRepository.save(speciality);
    }

    public void deleteById(String _id) {
        specialityRepository.deleteById(_id);
    }
}
