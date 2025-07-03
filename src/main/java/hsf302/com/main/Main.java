package hsf302.com.main;

import hsf302.com.pojo.Book;
import hsf302.com.pojo.Student;
import hsf302.com.service.StudentService;
import hsf302.com.service.StudentServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String fileName = "JPAs";
        StudentService studentService = new StudentServiceImpl(fileName);
        Student student = new Student("lamnn@gmail.com", "1234@", "Lan", "Nguyen", 9);
        Book book = new Book("Java Programming", "John Doe", "123-4567890123");
        student.getBooks().add(book);
        studentService.save(student);
    }
}