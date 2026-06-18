package college_management_system.service;

import college_management_system.model.StaffM;
import college_management_system.repository.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffRepo repo;

    public StaffM saveStaff(StaffM staff) {
        return repo.save(staff);
    }

    public List<StaffM> getAllStaff() {
        return repo.findAll();
    }

    public StaffM getStaffById(String id) {
        return repo.findById(id).orElse(null);
    }

    public StaffM updateStaff(StaffM staff) {
        return repo.save(staff);
    }

    public void deleteStaff(String id) {
        repo.deleteById(id);
    }
}