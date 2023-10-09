package java8.solid.linkov;

public interface CollageManagement {
    Student addStudent(Student student);

    void removeStudent(int studentId);

    Student updateStudent(int studentId, Student student);

    Student viewStudent(int studentId);
}
