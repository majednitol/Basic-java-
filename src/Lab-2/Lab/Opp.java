
// // // import java.util.Scanner;

// // import java.util.Scanner;

// // public class Problem1 {

// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);
// //         int A = sc.nextInt();
// //         int B = sc.nextInt();
// //         int C = sc.nextInt();
// //         int D = sc.nextInt();

// //         System.out.println(A * B - C * D);
// //         System.out.println(A * A - B - D * D * D);
// //         System.out.println(A * A + B * B - C * C - D * D);
// //         System.out.println(A * A * A + B - C * C);

// //     }
// // }

// // public class Problem2 {

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         String name = sc.nextLine();
// //         int age = sc.nextInt();

// //         double cgpa = sc.nextDouble();
// //         sc.nextLine();
// //         String department = sc.nextLine();
// //         String section = sc.next();

// //         System.out.println(name + " " + age + " " + cgpa + " " + department + " " + section);

// //     }
// // }

// // public class Problem3 {

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int a = sc.nextInt();
// //         int b = sc.nextInt();
// //         int c = sc.nextInt();

// //         if (a > b && a > c) {
// //             System.out.println("A is greater than");

// //         } else if (b > a && b > c) {
// //             System.out.println("B is greater than");
// //         } else {
// //             System.out.println("C is greater than");
// //         }

// //     }
// // }

// // import java.util.Scanner;

// // public class Problem4 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int a = sc.nextInt();
// //         int b = sc.nextInt();
// //         int sum = a + b;
// //         System.out.println(sum);

// //     }

// // }

// // public class Problem5 {
// //     public static void main(String[] args) {
// //         final double x = 3.1416;
// //         Scanner sc = new Scanner(System.in);
// //         double r = sc.nextDouble();
// //         double a = x * r * r;
// //         System.out.printf("%.2f", a);
// //     }
// // }

// // public class Problem6 {

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         for (int i = 1; i <= 10; i++) {
// //             System.out.println(n + "*" + i + "=" + n * i);
// //         }
// //     }
// // }

// // public class Problem7 {

// //     public static void main(String[] args) {
// //         Scanner input = new Scanner(System.in);
// //         System.out.println("Enter your mark: ");
// //         int n = input.nextInt();
// //         if (n >= 80)
// //             System.out.println("A+");
// //         if (n < 80 && n >= 75)
// //             System.out.println("A");
// //         if (n < 75 && n >= 70)
// //             System.out.println("A-");
// //         if (n < 70 && n >= 65)
// //             System.out.println("B+");
// //         if (n < 65 && n >= 60)
// //             System.out.println("B");
// //         if (n < 60 && n >= 55)
// //             System.out.println("B-");
// //         if (n < 55 && n >= 50)
// //             System.out.println("C+");
// //         if (n < 50 && n >= 45)
// //             System.out.println("C");
// //         if (n < 45 && n >= 40)
// //             System.out.println("D");
// //         if (n < 40)
// //             System.out.println("F");
// //     }
// // }

// // public class Problem8 {

// //     public static void main(String[] args) {
// //         char n = '8';
// //         if ('0' <= n && n >= '9') {
// //             System.out.println("digit");
// //         }
// //         if ('a' == n || 'e' == n || 'i' == n || 'o' == n || n >= 'u' || 'A' == n ||
// //                 'E' == n || 'I' == n
// //                 || 'O' == n || n == 'U') {
// //             System.out.println("Alphabet and vowel");
// //         } else {
// //             System.out.println("Alphabet and consonant");
// //         }
// //     }
// // }

// // public class Problem9 {
// //     public static void main(String[] args) {

// //         int i;
// //         for (i = 1; i < 100; i++) {
// //             if (i % 3 == 0 || i % 6 == 0) {
// //                 if (i == 30 || i == 60 || i == 90) {
// //                     continue;

// //                 }
// //                 System.out.println(i + " is prime number");

// //             }
// //         }

// //     }
// // }

// // public class Problem10 {

// //     public static void main(String[] args) {
// //         Scanner s = new Scanner(System.in);
// //         int n = s.nextInt();
// //         for (int i = 0; i < n; i++) {
// //             int m = s.nextInt();
// //             if (m % 2 == 0) {
// //                 System.out.println("Even ");
// //             } else {
// //                 System.out.println("prime number");
// //             }

// //         }
// //     }
// // }

// 1.

// import java.util.Scanner;

// public class Problem1 {
// public static void main(String[] args) {
// Scanner input=new Scanner(System.in);
// int n,i,j,temp=0;
// System.out.println("How many numbers you want to insert?\n");
// n=input.nextInt();
// int[]a=new int[n];
// System.out.println("Enter Array Elements ");
// for(i=0;i<n;i++){
// a[i]=input.nextInt();
// }
// for(i=0;i<n;i++){
// for(j=i+1;j<n;j++){
// if(a[i]>a[j]){
// temp=a[i];
// a[i]=a[j];
// a[j]=temp;
// }
// }
// }
// System.out.println("Array after sort\n");
// for(i=0;i<n;i++){
// System.out.println(a[i]);
// }
// }
// }2.
// import java.util.Scanner;

// public class Problem2 {
// public static void main(String[] args) {
// Scanner input=new Scanner(System.in);
// int n,i,data,count=0;
// System.out.println("Enter array size\n");
// n=input.nextInt();
// int[]a=new int[n];
// System.out.println("Enter array elements: ");
// for(i=0;i<n;i++){
// a[i]=input.nextInt();
// }
// System.out.println("Enter the data you want to search in this array: ");
// data=input.nextInt();
// for(i=0;i<n;i++){
// if(a[i]==data){
// count++;
// break;
// }
// }
// if(count==0){
// System.out.println("Data "+data+" not Found in Array");
// }
// else{
// System.out.println("Data "+data+" has been found in Index:"+i);
// }
// }
// }3.
// import java.util.Scanner;

// public class Problem3 {
// public static void main(String[]args){
// int n,i;
// Scanner input=new Scanner(System.in);
// System.out.println("Enter array Size: ");
// n=input.nextInt();
// double[]a=new double[n];
// double min=0.0,max=0.0;
// System.out.println("Enter Cgpa: ");
// for(i=0;i<n;i++){
// a[i]=input.nextDouble();
// }
// min=a[0];
// for(i=1;i<n;i++){
// if(a[i]<min){
// min=a[i];
// }
// }
// max=a[0];
// for(i=1;i<n;i++){
// if(a[i]>max){
// max=a[i];
// }
// }
// System.out.println("Minimum CGPA = "+min);
// System.out.println("Maximum CGPA = "+max);
// }
// }4.
// import java.util.Scanner;

// public class Problem4 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int n, x, i, y;
//         System.out.println("Enter array Size for Array1: ");
//         n = input.nextInt();
//         int[] a = new int[n];
//         System.out.println("Enter array elemnts for array 1\n");
//         for (i = 0; i < n; i++) {
//             a[i] = input.nextInt();
//         }
//         System.out.println("Enter size of Array2: ");
//         x = input.nextInt();
//         int[] b = new int[x];
//         System.out.println("Enter array elements for array 2\n");
//         for (i = 0; i < x; i++) {
//             b[i] = input.nextInt();
//         }
//         for (i = 0; i < n; i++) {
//             System.out.println("Array 1: " + a[i]);
//         }
//         for (i = 0; i < x; i++) {
//             System.out.println("Array 2: " + b[i]);
//         }
//         y = n + x;
//         int[] c = new int[y];
//         for (i = 0; i < n; i++) {
//             c[i] = a[i];
//         }
//         for (i = 0; i < x; i++) {
//             c[i + n] = b[i];
//         }
//         System.out.println("The new array is");
//         for (i = 0; i < y; i++) {
//             System.out.println(c[i]);
//         }
//     }
// }

// Math Class
// Problem Solve:
// 5.
// import java.lang.Math;
// import java.util.Scanner;

// public class Math1 {
// public static void main(String[] args) {
// double n;
// Scanner input=new Scanner(System.in);
// System.out.println("Enter any number: ");
// n=input.nextDouble();
// System.out.println("Absoulute value = "+Math.abs(n)+", Floor value = "+Math.floor(n)+", Celling
// Value = "+Math.ceil(n)+", Round = "+Math.round(n)+", Square root = "+Math.sqrt(n));
// }
// }6.
// import java.lang.Math;
// import java.util.Scanner;

// public class Math2 {
// public static void main(String[] args) {
// Scanner input=new Scanner(System.in);
// int a,b,c;
// System.out.println("a = ");
// a=input.nextInt();
// System.out.println("b = ");
// b=input.nextInt();
// System.out.println("c = ");
// c=input.nextInt();
// System.out.println("Maximum = "+Math.max(c,Math.max(a, b)));
// System.out.println("Minimum = "+Math.min(a,Math.min(b,c)));
// }
// }7.
// import java.lang.Math;

// public class Random {
// public static void main(String[] args) {
// double a;
// int i;
// for(i=0;i<5;i++){
// a=(Math.random()*200);
// System.out.println((int)+a);
// }
// }
// }8.
// import java.lang.Math;
// import java.util.Scanner;

// public class Math3 {
// public static void main(String[] args) {
// Scanner input=new Scanner(System.in);
// System.out.println("Enter any number : ");
// int n,i;
// n=input.nextInt();
// for(i=0;i<=n;i++){
// System.out.println(Math.pow(2, i));
// }
// }
// }9.
// import java.lang.Math;
// import java.util.Scanner;

// public class Math4 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         double r;
//         System.out.println("Enter Value of R: ");
//         r = input.nextDouble();
//         System.out.println("The area is : " + (Math.PI * (Math.pow(r, 2))));
//     }
// }
