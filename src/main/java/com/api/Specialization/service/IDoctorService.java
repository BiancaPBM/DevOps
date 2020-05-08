package com.api.Specialization.service;

import com.api.Specialization.models.Doctor;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public interface IDoctorService {
    List<Doctor> findAll(Sort sortOrder);
    void insert(Doctor doctor);
    void update(Doctor doctor);
    void deleteById(String _id);
    List<Doctor> solve(Query query);
}
