package BM23AI045;

import java.util.Scanner;

class gymmembershipmanagement {
    String name;
    int age;
    boolean inactive;
    int duration;
    int fee;

    gymmembershipmanagement() {
    }

    void calculate() {
        this.fee = this.duration * 50;
    }

    void displayDetails() {
        System.out.println("\nMembership Details:");
        String var10001 = this.name;
        System.out.println("Name:" + var10001);
        int var1 = this.age;
        System.out.println("Age:" + var1);
        System.out.println("Inactive status:" + (this.inactive ? "Yes" : "No"));
        System.out.println("Duration:" + this.duration + " months");
        System.out.println("Fee:$" + this.fee);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many membership do you want to enter?");
        int numMembers = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < numMembers; ++i) {
            System.out.println("\nEntering details for member" + (i + 1) + ":");
            gymmembershipmanagement g1 = new gymmembershipmanagement();
            System.out.print("Enter name:");
            g1.name = sc.nextLine();
            System.out.print("Age:");
            g1.age = sc.nextInt();
            System.out.print("Enter membership duration in months:");
            g1.duration = sc.nextInt();
            System.out.print("Is the membership inactive?(true/false):");
            g1.inactive = sc.nextBoolean();
            sc.nextLine();
            g1.calculate();
            g1.displayDetails();
        }

        sc.close();
    }
}


//OUTPUT:
How many membership do you want to enter?2

Entering details for member1:
Enter name:A
Age:19
Enter membership duration in months:8
Is the membership inactive?(true/false):false

Membership Details:
Name:A
Age:19
Inactive status:No
Duration:8 months
Fee:$400

Entering details for member2:
Enter name:B
Age:20
Enter membership duration in months:12
Is the membership inactive?(true/false):true

Membership Details:
Name:B
Age:20
Inactive status:Yes
Duration:12 months
Fee:$600

Process finished with exit code 0
