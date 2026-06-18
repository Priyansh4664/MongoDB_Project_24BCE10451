package college_management_system.service;

import college_management_system.model.StudentM;
import college_management_system.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public StudentM saveStudent(StudentM student) {
        return repo.save(student);
    }

    public List<StudentM> getAllStudents() {
        return repo.findAll();
    }

    public StudentM getStudentById(String id) {
        return repo.findById(id).orElse(null);
    }

    public StudentM updateStudent(StudentM student) {
        return repo.save(student);
    }

    public void deleteStudent(String id) {
        repo.deleteById(id);
    }
}
