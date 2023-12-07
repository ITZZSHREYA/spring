//package com.student.std;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/students")
//public class StudentController {
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @GetMapping
//    public List<Student> getAllStudentDetails() {
//        return studentRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Student getStudentDetails(@PathVariable int id) {
//        return studentRepository.findById(id).orElse(null);
//    }
//
//    @PostMapping
//    public void addStudentDetails(@RequestBody Student student) {
//        studentRepository.save(student);
//    }
//
//    @PutMapping("/{id}")
//    public void updateStudentDetails(@RequestBody Student student, @PathVariable int id) {
//        Student existingStudent = studentRepository.findById(id).orElse(null);
//        if (existingStudent != null) {
//            existingStudent.setName(student.getName());
//            existingStudent.setBranch(student.getBranch());
//            studentRepository.save(existingStudent);
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudentDetails(@PathVariable int id) {
//        studentRepository.deleteById(id);
//    }
//}
