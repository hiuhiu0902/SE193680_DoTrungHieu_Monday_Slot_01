package hsf302.com.service;

import java.util.List;

import hsf302.com.pojo.Student;
import hsf302.com.repository.StudentRepository;
import hsf302.com.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
    private StudentRepository iStudentRepo = null;

    public StudentServiceImpl(String fileName) {
        iStudentRepo = new StudentRepositoryImpl(fileName);
    }

    @Override
    public void save(Student student) {
        iStudentRepo.save(student);
    }

    @Override
    public List<Student> findAll() {
        return iStudentRepo.findAll();
    }

    @Override
    public void delete(int id) {
        iStudentRepo.delete(id);
    }

    @Override
    public Student findById(int id) {
        return iStudentRepo.findById(id);
    }

    @Override
    public void update(Student student) {
        iStudentRepo.update(student);
    }
}
