package hsf302.com.repository;

import java.util.List;
import hsf302.com.pojo.Student;

public interface StudentRepository {

    public List<Student> findAll();

    public Student findById(int studentID);

    public void save(Student student);

    public void delete(int studentID);

    public void update(Student student);
}
