import java.util.Scanner;

// import java.util.Scanner;

// // import java.util.Scanner;

// // public class Student {

// //     private String name;
// //     private int id;
// //     private double cgpa;

// //     public static void main(String[] args) {
// //         Scanner input = new Scanner(System.in);
// //         //  int n =input.nextInt(); 

// //         Student[] arr1 = new Student[4];
// //         for (int i = 0; i < 4; i++) {
// //             arr1[i] = new Student();
// //             arr1[i].name = input.nextLine();
// //             arr1[i].id = input.nextInt();
// //             arr1[i].cgpa = input.nextDouble();
// //             input.nextLine();
// //         }
// //         for (int i = 0; i < 4; i++) {
// //             System.out.println("Student Name = " + arr1[i].name + " " + "Student Id =" + arr1[i].id + " "
// //                     + "Student Name = " + arr1[i].cgpa);
// //         }
// //     }

// //     public void insertRecord(String name, int id, double cgpa){
// //         String nam =name;
// //         int d = id;
// //         double Cgpa = cgpa;

// //     }

// // }

// public class Student {
//     private String name;
//     private int id;
//     private double cgpa;

//     public String getName() {
//         return name;
//     }

//     public int getId() {
//         return id;
//     }

//     public double getCgpa() {
//         return cgpa;
//     }

//     void inset(String name, int id, double cgpa) {
//         this.name = name;
//         this.id = id;
//         this.cgpa = cgpa;
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         // int n = input.nextInt();
//         Student[] s = new Student[2];
//         for (int i = 0; i < 2; i++) {
//             s[i] = new Student();
//             s[i].name = input.next();
//             s[i].id = input.nextInt();
//             s[i].cgpa = input.nextDouble();

//         }

//         display(s);

//     }

//     static void display(Student[] s) {
//         for (int i = 0; i < 2; i++) {
//             System.out.println("name =" + s[i].getName() + "id =" + s[i].getId() + "Cgpa =" + s[i].getCgpa());

//         }
//     }

// }

class Student {
    String name;
    int id;
    double cgpa;

    Student() {
        this.name = "ayon";
        this.id = 3366;
        this.cgpa = 3.87;
    }

    Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
   static Scanner input = new Scanner(System.in);
   public  static void insert(Student[] s ) {
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
            s[i].name = input.next();
            s[i].id = input.nextInt();
            s[i].cgpa = input.nextDouble();

        }
}
    void display() {
        System.out.println(name + ": " + id + ": " + cgpa);
    }

    // void display(Student student) {
    // System.out.println(student.name + ": " + student.id + ": " + student.cgpa);
    // }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter number of object");
        int n = input.nextInt();
        Student[] s = new Student[n];
    insert(s);

        for (int i = 0; i < n; i++) {
            s[i].display();

        }

    }

}




