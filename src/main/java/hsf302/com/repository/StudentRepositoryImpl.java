package hsf302.com.repository;

import hsf302.com.pojo.Student;
import hsf302.com.dao.StudentDAO;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private StudentDAO studentDAO;

    public StudentRepositoryImpl(String fileConfig) {
        studentDAO = new StudentDAO(fileConfig);
    }

    @Override
    public void save(Student student) {
        studentDAO.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentDAO.getStudents();
    }

    @Override
    public void delete(int studentID) {
        studentDAO.delete(studentID);
    }

    @Override
    public Student findById(int studentID) {
        return studentDAO.findById(studentID);
    }

    @Override
    public void update(Student student) {
        studentDAO.update(student);
    }
}
