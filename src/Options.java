import java.util.Objects;
import java.util.Scanner;

public class Options {
//    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  THIS WILL HANDLE ALL THE 5 CHOICES THAT THE USER ENTERS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    Scanner scanner = new Scanner(System.in);
    Student student = new Student();
    PhoneNumber phoneNumber = new PhoneNumber();
    int gotMeal = 0;
    public void getOptions(){
        System.out.print("Choice: ");
        int input = scanner.nextInt();

                if (input == 1){
                    getDetails();
//                    use student.get... to return the values you have set otherwise you get null values
                    System.out.println("You have successfully added "+" "+student.getName()+" "+"gym number"+" "+student.getGymNumber()+".");
                    phoneNumber.getChoices();
                    getOptions();
                }

                else if (input == 2){
//                  do what is supposed to be done if a user enters 2
                    System.out.print("No option is given");
                }
                else if (input ==3){
                    getGymNum();
                    phoneNumber.getChoices();
                    getOptions();
                }else if (input == 4){
                    System.out.print("The report has been exported to csv."+"\n");
                    phoneNumber.getChoices();
                    getOptions();
                }else if (input == 5){
                    System.out.print("Bye!  Bye!");
                }

//                continue with the remaining cases don't forget break after each case...
    }

//    get the name and surname separately coz at once didn't work for me
    public void getDetails(){
        System.out.print("Enter first name: ");
        String fName = scanner.next();

        System.out.print("Enter surname");
        String sName = scanner.next();
        String name = fName+ " " + sName;

//        use student.set... to set the value

        student.setName(name);
        System.out.print("Enter gym number: ");
        String gymNumber = scanner.next();
        if (gymNumber.length() == 6){
            student.setGymNumber(gymNumber);
            student.setGotMeal(0);
        }else {
            System.out.print("Invalid gym number! Please enter a 6-digit number"+"\n");
            phoneNumber.getChoices();
            getOptions();
        }

    }
    public void getGymNum(){
        System.out.print("Enter gym number: ");
        String gymNum = scanner.next();
                if (Objects.equals(gymNum, student.getGymNumber()) && Objects.equals(gotMeal,student.getGotMeal())) {
                    System.out.print("Take out the meal card on the printer"+"\n");
                    student.setGotMeal(1);
                }
                else if (!Objects.equals(gotMeal, student.getGotMeal()) || !Objects.equals(gymNum, student.getGymNumber())) {
                    System.out.print("Denied!" + "  " + student.getName() + " " + "has already been issued a free meal card "+"\n");
                }
//                }else {
//                    System.out.print("Wrong gym number");
//                }

        }

}
