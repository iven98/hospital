package com.zakary.services;

import com.zakary.dao.Doctor;

public interface DoctorService {
    Doctor getDoctor(Doctor user);
    void register(Doctor user);
    Doctor findByDoctorId(Integer doctorId);
}