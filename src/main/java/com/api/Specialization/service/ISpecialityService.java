package com.api.Specialization.service;

        import com.api.Specialization.models.Speciality;
        import org.springframework.data.domain.Sort;

        import java.util.List;

public interface ISpecialityService {
    List<Speciality> findAll(Sort sortOrder);
    List<Speciality> findByNameContaining(String name);
    List<Speciality> findByKeyword(String word);
    void insert(Speciality speciality);
    void update(Speciality speciality);
    void deleteById(String _id);
}
