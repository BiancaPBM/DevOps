package com.api.Specialization.repository.doctor;

import com.api.Specialization.models.Doctor;
import org.springframework.data.mongodb.core.query.Query;
import java.util.List;

public interface DoctorRepositoryCustom {
   List<Doctor> solveQuery(Query query);
}
