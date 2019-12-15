package org.regeneration.efkajpa.service;

import org.regeneration.efkajpa.entity.Doctors;
import org.regeneration.efkajpa.entity.Specialties;
import org.regeneration.efkajpa.entity.Users;
import org.regeneration.efkajpa.repository.DoctorRepository;
import org.regeneration.efkajpa.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DoctorService {
    @Autowired
    public DoctorRepository doctorRepository;

    public Set<Doctors> retrieve(Specialties specialty){
        return doctorRepository.findBySpecialties(specialty);
    }
}