import java.util.Scanner;
class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll no: ");
        int rollno = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter your section: ");
        String section = sc.nextLine();

        System.out.print("Enter your mobile number: ");
        int mobile = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter your course: ");
        String course = sc.nextLine();

        System.out.print("Enter your last sem. cgpa: ");
        int cgpa = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter your class 10th %: ");
        int percent = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter your class 12th %: ");
        int percentage = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your aadhar card no: ");
        int aadhar = sc.nextInt();
        
        System.out.println("Your name is : "+ name);
        System.out.println("Your roll no is : "+ rollno);
        System.out.println("Your section is : "+ section);
        System.out.println("Your mobile number is : "+ mobile);
        System.out.println("Your course is : "+ course);
        System.out.println("Your last sem cgpa is : "+ cgpa);
        System.out.println("Your class 10th % is : "+ percent);
        System.out.println("Your class 12th % is : "+ percentage);
        System.out.println("Your address is : "+ address);
        System.out.println("Your aadhar card no is : "+ aadhar);
    }
}