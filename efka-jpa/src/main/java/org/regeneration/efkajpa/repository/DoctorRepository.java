package org.regeneration.efkajpa.repository;

import org.regeneration.efkajpa.entity.Doctors;
import org.regeneration.efkajpa.entity.Specialties;
import org.regeneration.efkajpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctors, String> {
    List<Doctors> findBySpecialties(Specialties specialty);
    Doctors findByDoctorId(String doctorId);
    List<Doctors> findAll();
    Doctors findByUsers(Users user);
}
