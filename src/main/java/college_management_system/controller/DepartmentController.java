package college_management_system.controller;

import college_management_system.model.DepartmentM;
import college_management_system.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping
    public DepartmentM createDepartment(@RequestBody DepartmentM department) {
        return service.saveDepartment(department);
    }

    @GetMapping
    public List<DepartmentM> getAllDepartments() {
        return service.getAllDepartments();
    }

    @GetMapping("/{id}")
    public DepartmentM getDepartmentById(@PathVariable String id) {
        return service.getDepartmentById(id);
    }

    @PutMapping("/{id}")
    public DepartmentM updateDepartment(@PathVariable String id,
                                        @RequestBody DepartmentM department) {
        department.setDepartmentId(id);
        return service.updateDepartment(department);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable String id) {
        service.deleteDepartment(id);
        return "Department deleted successfully";
    }
}