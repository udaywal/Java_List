/* List */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

    public static void main(String[] args) {

        // Student s1 = new Student("Vaibhav", 21);
        // Student s2 = new Student("Prakher", 22);
        // Student s3 = new Student("VK", 23);

        // Student[] students = {s1, s2, s3};

        /* But here the problem is, we can't add or remove the values of the students "Array"
        That's why we need ArrayList to have the add/remove functionality */

        /* ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Vaibhav", 21));
        students.add(new Student("Prakher", 22));
        students.add(new Student("VK", 23));

        ArrayList<Integer> randomArray = new ArrayList<Integer>();

        int element1 = 1;
        Object element2 = "Vaibhav";
        Object element3 = new Student("StudentName", 54);

        randomArray.add(element1);
        // randomArray.add(element2);
        // randomArray.add(element3);

        printArrayList(randomArray); */

        // ArrayList<Float> students = new ArrayList<Float>();

        // students.add(1f);
        // students.add(2f);
        // students.add(3f);
        // students.add(5f);

        // System.out.println(students.contains(5f));
        
        // for (int i=0; i<students.size(); i++) {
        //     System.out.println("-----" + i + "-----");
        //     System.out.println(students.get(i));
        //     // System.out.println(students.get(i));
        // }

        List<Student> students1 = new ArrayList<Student>();
        List<Student> students2 = new LinkedList<Student>();

        students1.add(new Student("Vaibhav", 1));
        students1.add(new Student("Prakher", 2));
        students2.add(new Student("VK", 3));
        students2.add(new Student("Bharat", 4));

        // printStudentList(students1);
        // iterateFwd(students1);
        // iterateBkwd(students1);

        List<Integer> n1 = new LinkedList<Integer>();

        n1.add(1);
        n1.add(2);
        n1.add(3);
        n1.add(4);

        // iterate(n1);

        UniversityStudent u1 = new UniversityStudent("Krishna", 21);

        u1.printClassNameOld();

    }

    static void printStudentList(List<Student> students) {
        for(Student s: students) {
            System.out.println(s.name);
            /* No need to cast as we are using the generics. And also the data is the same type "Student". */
            // Student n = (Student) o;
            // System.out.println(n.name);
        }
    }

    static void iterateFwd(List<Student> students) {
        ListIterator<Student> it = students.listIterator(1);
        while (it.hasNext()) {
            System.out.println(it.next().name);
        }
    }

    static void iterateBkwd(List<Student> students) {
        ListIterator<Student> it = students.listIterator(students.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous().name);
        }
    }

    static void iterate (List<Integer> numberList) {
        ListIterator<Integer> it = numberList.listIterator(1);
        it.next();
        it.next();
        it.previous();
        System.out.println(it.next()); 
    }

}

class Student {

    String name;
    int rollNo;

    Student (String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void printClassName () {
        System.out.println("Student");
    }
    
}

class UniversityStudent extends Student {
    
    UniversityStudent (String name, int rollNo) {
        super(name, rollNo);
    }
    
    @Deprecated
    void printClassNameOld () {
        System.out.println("UniversityStudentOld");
    }

    void printClassName () {
        System.out.println("UniversityStudent");
    }

}