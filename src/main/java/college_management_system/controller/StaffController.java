package college_management_system.controller;

import college_management_system.model.StaffM;
import college_management_system.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService service;

    @PostMapping
    public StaffM createStaff(@RequestBody StaffM staff) {
        return service.saveStaff(staff);
    }

    @GetMapping
    public List<StaffM> getAllStaff() {
        return service.getAllStaff();
    }

    @GetMapping("/{id}")
    public StaffM getStaffById(@PathVariable String id) {
        return service.getStaffById(id);
    }

    @PutMapping("/{id}")
    public StaffM updateStaff(@PathVariable String id,
                              @RequestBody StaffM staff) {
        staff.setStaffId(id);
        return service.updateStaff(staff);
    }

    @DeleteMapping("/{id}")
    public String deleteStaff(@PathVariable String id) {
        service.deleteStaff(id);
        return "Staff deleted successfully";
    }
}
