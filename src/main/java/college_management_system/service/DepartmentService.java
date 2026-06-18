package college_management_system.service;

import college_management_system.model.DepartmentM;
import college_management_system.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo repo;

    public DepartmentM saveDepartment(DepartmentM department) {
        return repo.save(department);
    }

    public List<DepartmentM> getAllDepartments() {
        return repo.findAll();
    }

    public DepartmentM getDepartmentById(String id) {
        return repo.findById(id).orElse(null);
    }

    public DepartmentM updateDepartment(DepartmentM department) {
        return repo.save(department);
    }

    public void deleteDepartment(String id) {
        repo.deleteById(id);
    }
}