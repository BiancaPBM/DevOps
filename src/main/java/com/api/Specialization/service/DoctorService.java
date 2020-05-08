package com.api.Specialization.service;

import com.api.Specialization.models.Doctor;
import com.api.Specialization.repository.doctor.DoctorRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService implements IDoctorService {
    private DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> findAll(Sort sortOrder) {
        return doctorRepository.findAll(sortOrder);
    }

    public void insert(Doctor doctor) {
        doctorRepository.insert(doctor);
    }

    public void update(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public void deleteById(String _id) {
        doctorRepository.deleteById(_id);
    }

    public List<Doctor> solve(Query query) {
        return doctorRepository.solveQuery(query);
    }
}
