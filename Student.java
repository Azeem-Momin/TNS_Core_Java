import java.util.Scanner;
class Student {

    // default constructor
    Student() {
        System.out.println("Student object is created");
    }


    public static void main(String[] args) {

        Student s = new Student();
        Commission commission = new Commission();

        commission.acceptDetails();
        // System.out.println("Commission : " + commission.calculateCommission());
        commission.displayDetailsAndCommission();
    }

}


class Commission {
    // Data Members
     String name;
     String address;
     String phone;
     double salesAmount;

    // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Address: ");
        address = scanner.nextLine();

        System.out.print("Enter Phone: ");
        phone = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = scanner.nextDouble();
    }

    // Method to calculate the commission
    public double calculateCommission() {
        double commission = 0.0;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        }

        return commission;
    }

    // Method to display the details and commission
    public void displayDetailsAndCommission() {
        System.out.println("Sales Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + calculateCommission());
    }

    
}
