package org.example.services;

import org.example.exceptions.StudentNotFoundException;
import org.example.models.Student;
import org.example.repositories.StudentRepositoryInterface;
import org.example.services.interfaces.StudentServiceInterface;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceInterface {
    private final StudentRepositoryInterface repo;

    public StudentService(StudentRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Student> getAll() {
        return repo.findAll(Sort.by("name"));
    }

    @Override
    public Student getByEmail(String email) {
        return repo.findByEmail(email);

    }

    @Override
    public Student create(Student student) {
        return repo.save(student);
    }
}
