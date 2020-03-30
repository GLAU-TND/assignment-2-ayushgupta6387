/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.node.Node;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyCircularQueue circularQueue = new MyCircularQueue();
        int count = 0;

        System.out.println("Enter number of records you wants to enter");
        int numberOfRecords = scan.nextInt();
        while (numberOfRecords != 0) {
            Student student = new Student();
            Node node = new Node();

            System.out.println("Enter name");
            student.setName(scan.next().trim());
            System.out.println("Enter roll number");
            student.setRollNumber(scan.nextInt());
            System.out.println("Enter backlogs");
            int backLogs = scan.nextInt();
            if (backLogs > 2) {
                System.out.println("This student is not allowed");
                continue;
            }
            student.setBackLog(backLogs);

            node.setStudent(student);

            circularQueue.enQueue(node);

            numberOfRecords--;
        }
        System.out.println("Your input details");
        circularQueue.traverseQueue();
        System.out.println("Removing the students if they have zero backlog");
        circularQueue.removeZeroBacklogRecords();

        System.out.println("Remaining record after deletion");
        circularQueue.traverseQueue();
    }
}