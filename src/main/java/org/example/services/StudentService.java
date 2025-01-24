package org.example.services;

import org.example.exceptions.StudentNotFoundException;
import org.example.models.Student;
import org.example.models.Teacher;
import org.example.repositories.StudentRepositoryInterface;
import org.example.services.interfaces.StudentServiceInterface;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceInterface {

}
