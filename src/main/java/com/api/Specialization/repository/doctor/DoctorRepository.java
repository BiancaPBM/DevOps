package com.api.Specialization.repository.doctor;

import com.api.Specialization.models.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;
import java.util.List;

//import com.api.Specialization.QDoctor;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String>,DoctorRepositoryCustom {
    List<Doctor> findByFirstNameIgnoreCase(String firstName);
    List<Doctor> findByLastNameIgnoreCase(String lastName);
    List<Doctor> findByFirstNameAndLastNameIgnoreCase(String firstname,String lastname);
    @Query(value = "{'workplace.city' : ?0}")
    List<Doctor> findByCity(String city);
    List<Doctor> findBySpeciality(String speciality);
}
