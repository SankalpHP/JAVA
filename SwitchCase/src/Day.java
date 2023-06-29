import java.util.Scanner;

public class Day {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
//         System.out.println("Enter a Name");
//         String emp = in.next();
//         String Company = in.next();

//        System.out.println("Enter the Day");
//         int day = in.nextInt();

//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        switch (day) {
//            case 1,2,3,4,5 -> System.out.println("Week Days");
//            case 6,7 -> System.out.println("Weekend");
//
//        }

//        switch (emp) {
//            case "Java" -> System.out.println("Sankalp Selokar");
//            case "C" -> System.out.println("Lakhan");
//            case "Industry" -> {
//                System.out.println("Industry Entered");
//                switch (Company) {
//                    case "Wipro" -> System.out.println("Sankalp Works in Wipro");
//                    case "SaleMan" -> System.out.println("Lakhan Works in SaleMan");
//                    default -> System.out.println("No Department enterted");
//                }
//
//            }
//            case "Exit" -> System.out.println("End of the switch");
//        }

        System.out.println("Enter empID");
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {

            case 1-> System.out.println("Sankalp Selokar");
            case 2-> System.out.println("Rahul Rana");
            case 3-> {
                System.out.println("Emp Number 3");
                switch(department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }

    }

