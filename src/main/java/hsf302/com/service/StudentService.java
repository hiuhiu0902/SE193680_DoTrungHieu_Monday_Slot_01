package hsf302.com.service;

import java.util.List;
import hsf302.com.pojo.Student;

public interface StudentService {

    public List<Student> findAll();

    public void save(Student student);

    public void delete(int student);

    public Student findById(int studentID);

    public void update(Student student);
}
