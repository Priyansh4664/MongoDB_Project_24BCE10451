package college_management_system.controller;

import college_management_system.model.StudentM;
import college_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public StudentM createStudent(@RequestBody StudentM student) {
        return service.saveStudent(student);
    }

    @GetMapping
    public List<StudentM> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentM getStudentById(@PathVariable String id) {
        return service.getStudentById(id);
    }

    @PutMapping("/{id}")
    public StudentM updateStudent(@PathVariable String id,
                                  @RequestBody StudentM student) {
        student.setStudentId(id);
        return service.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable String id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }
}