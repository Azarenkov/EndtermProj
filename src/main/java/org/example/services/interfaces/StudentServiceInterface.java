package org.example.services.interfaces;

import org.example.models.Student;

import java.util.List;

public interface StudentServiceInterface {
    List<Student> getAll();
    Student getByEmail(String email);
    Student create(Student student);
}
