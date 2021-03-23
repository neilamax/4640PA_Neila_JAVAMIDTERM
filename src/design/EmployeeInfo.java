package design;

import java.util.Scanner;

public class EmployeeInfo extends Employee2 implements Employee {

    /*
    This class should implement the Employee interface. You can do that by directly implementing it, however you must
        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
        go to FortuneEmployee class to apply all the fields and attributes.
    Important: YOU MUST USE:
        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
        - Use all kind of keywords (super, this, static, final, etc)
        - Implement nested class below (DateConversion)
        - Use Exception Handling
     */

    /*
     * Make sure to declare and use static, non-static & final fields
     */
    static String companyName="ESTES";
    String name;
    int employeeId;
    static int numOfYears;
    static int salary;
    int employeeSSN;
    double wage;
    double  numberOfhours;




    public double getNumberOfhours() {
        return numberOfhours;
    }

    public static int getSalary() {
        return salary;
    }

    public static int getNumOfYears() {
        return numOfYears;
    }
/*
     You must implement the logic for below 2 methods and
        following 2 methods are prototype as well for other methods need to be design,
        as you will come up with the new ideas.
     */

    /*
     You must have/use multiple constructors
     */
    public EmployeeInfo(){

    }
    public EmployeeInfo(int employeeId) {
        this.employeeId=employeeId;


    }

    public EmployeeInfo(String name, int employeeId) {
        this.name=name;
        this.employeeId=employeeId;

    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee bonus based on salary and performance.
        It should return the total yearly bonus.
            Example: 10% of salary for best performance, 8% of salary for average performance and so on.
            You can set arbitrary number for performance, so you probably need to send 2 arguments.
     *
     */
    public  int calculateEmployeeBonus(String performance, int salary) {

        double total = 0;
        switch (performance) {
            case "Best performance":
                total = (salary * 0.10);
                System.out.println("the bonus is $" + total);
                break;
            case "Average performance":
                total = (salary * 0.08);
                System.out.println("the  bonus is $" + total);
                break;
            case "Bellow Average performance":
                total = salary * 0.05;
                System.out.println("the  bonus is $" + total);
                break;
            case "not Good performance":
                total = salary * 0.03;
                System.out.println("the  bonus is $" + total);

                break;
            default:
                System.out.println("sorry no bonus for this time.");
        }
        return (int) total;
    }


    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
     *
     */
    public int calculateEmployeePension(int numOfYears) {
        int total = 0;


        numOfYears = getNumOfYears();

        if (getSalary() == 0) {
            System.out.println("can not find the salary,please entre it");
        }
        if (numOfYears >= 15) {
            total = (int) (getSalary() * 0.75);
            System.out.println("the  pension that you get with our company is $ " + total);
        }
        if (numOfYears < 15 && numOfYears >= 10) {
            total = (int) (getSalary() * 0.5);
            System.out.println("the  pension that you get with our company is $ " + total);
        }
        if (numOfYears < 10 && numOfYears >= 5) {
            total = (int) (getSalary() * 0.05);
            System.out.println("the  pension that you get with our company is $ " + total);
        }
        if (numOfYears < 5) {
            total = (int) (getSalary() * 0.01);
            System.out.println("he  pension that you get with our company is $ " + total);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
        // Calculate pension

        return total;
    }

    @Override
    public int numOfYearsWorked() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the num of the year you worked i this company: ");
        int numOfYears=scanner.nextInt();


        return numOfYears;
    }

    @Override
    public int employeeSSn() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("type your Social security number : ");
        employeeSSN = scanner1.nextInt();
        System.out.println("please,check the SSN number one more time if it correct press 'Next'");


        return employeeSSN;
    }

    @Override
    public int employeeId() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("type your employee Id : ");
        employeeId = scanner1.nextInt();
        System.out.println("please,check the Id number one more time if it correct press 'Next'");
        return employeeId;
    }

    @Override
    public String employeeName() {
        String firstName;
        String lastName;
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("type your first name: ");
        firstName = sc.next();

        System.out.print("Enter your last name: ");
        lastName = scanner.next();
        name = firstName + " "+ lastName;
        System.out.println("welcome "+ name + " you are member of ESTES team now ");

        return name;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public void assignDepartment(int dept) {
        String deptName;
        switch (dept) {
            case 1:
                deptName = "sales";
                System.out.println(name+ " You are in " + deptName + " departments");
                break;
            case 2:
                deptName = "hr";
                System.out.println(name+ " You are  in " + deptName+ " departments");
                break;
            case 3:
                deptName = "accounting";
                System.out.println(name +" You are  in " + deptName+ " departments");
                break;
            case 4:
                deptName = "marketing";
                System.out.println(name+ " You are in " + deptName+ " departments");
                break;
            case 5:
                deptName = "IT";
                System.out.println(name +" You are in " + deptName+ " departments");
                break;



            default:
                deptName = null;
                System.out.println("no Department.");
        }


    }

    @Override
    public int calculateSalary() {
        return salary;
    }

    @Override
    public int calculateSalary(int numberOfhours, int wage) {
        salary = (int) (numberOfhours * wage * 52);
        System.out.println(name + " the salary that you get in "+ companyName + " is " + salary);

        return  salary;
    }


    @Override
    public void benefitLayout() {


    }

    private static class DateConversion {

        public DateConversion(Months months) {
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}