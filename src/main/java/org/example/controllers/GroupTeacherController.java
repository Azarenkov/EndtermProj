package org.example.controllers;

import org.example.models.GroupTeacher;
import org.example.services.GroupTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/group-teachers")
public class GroupTeacherController {

    @Autowired
    private GroupTeacherService groupTeacherService;

    @GetMapping
    public List<GroupTeacher> getAllGroupTeachers() {
        return groupTeacherService.findAll();
    }

    @GetMapping("/get_by_id/{id}")
    public ResponseEntity<GroupTeacher> getGroupTeacherById(@PathVariable Long id) {
        Optional<GroupTeacher> groupTeacher = groupTeacherService.findById(id);
        return groupTeacher.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public GroupTeacher createGroupTeacher(@RequestBody GroupTeacher groupTeacher) {
        return groupTeacherService.save(groupTeacher);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<GroupTeacher> updateGroupTeacher(@PathVariable Long id, @RequestBody GroupTeacher groupTeacherDetails) {
        Optional<GroupTeacher> groupTeacher = groupTeacherService.findById(id);
        if (groupTeacher.isPresent()) {
            GroupTeacher updatedGroupTeacher = groupTeacher.get();
            updatedGroupTeacher.setGroup(groupTeacherDetails.getGroup());
            updatedGroupTeacher.setTeacher(groupTeacherDetails.getTeacher());
            updatedGroupTeacher.setCourse(groupTeacherDetails.getCourse());
            groupTeacherService.save(updatedGroupTeacher);
            return ResponseEntity.ok(updatedGroupTeacher);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteGroupTeacher(@PathVariable Long id) {
        if (groupTeacherService.findById(id).isPresent()) {
            groupTeacherService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}