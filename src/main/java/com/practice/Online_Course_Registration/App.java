package com.practice.Online_Course_Registration;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Online COurce Registration! ");

		System.out.println("Choose an option:" + "\n1.Registration for Cource" + "\n2.Update Fees Paid "
				+ "\n3.Delete Registration By ID" + "\n4.View all record" + "\n5. Set_Details" + "\n6. Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");

		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {

		case 1:
			RegisterForCourse r1 = new RegisterForCourse();
			r1.Register();
			break;

		case 2:
			UpdateFeesPaid u = new UpdateFeesPaid();
			u.updateFees();
			break;

		case 3:
			DeleteRegistrationByID d = new DeleteRegistrationByID();
			d.deleteRegistration();
			break;

		case 4:
			ViewAllRecord v = new ViewAllRecord();
			v.viewRecord();
			break;

		case 5:
			Set_Details s = new Set_Details();
			s.Details();
			break;
			
		case 6:
			System.out.println("Exiting program. Goodbye!");
			System.exit(0); // Terminates the program immediately
			break;
		}

	}
}
