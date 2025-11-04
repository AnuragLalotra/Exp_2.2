import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int studentID;
    String name;
    double grade;

    public Student(int studentID, String name, double grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    public void display() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class StudentSerializationDemo {
    public static void main(String[] args) {
        String filename = "student.dat";
        Student s1 = new Student(101, "Anurag", 88.5);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(s1);
            System.out.println("Student object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student s2 = (Student) ois.readObject();
            System.out.println("\nDeserialized Student Data:");
            s2.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
