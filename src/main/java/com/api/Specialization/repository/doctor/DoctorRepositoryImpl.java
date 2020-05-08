package com.api.Specialization.repository.doctor;

import com.api.Specialization.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class DoctorRepositoryImpl implements DoctorRepositoryCustom {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public DoctorRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<Doctor> solveQuery(Query query) {
        return mongoTemplate.find(query,Doctor.class);
    }
}
