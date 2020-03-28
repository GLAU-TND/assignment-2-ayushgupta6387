/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.details.Student;
import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue<Student> queue = new MyPriorityQueue<>();
        queue.add(new Student(1, "ram"));
        queue.add(new Student(5, "shyam"));
        queue.add(new Student(3, "henriques"));
        queue.add(new Student(2, "michael"));
    }
}
