import java.util.Scanner;

public class PhoneNumber {
    Scanner scanner = new Scanner(System.in);

    public PhoneNumber() {

    }
    public void getPhoneNumber(){
        System.out.print("Enter your phone number starting with 265: ");
        String phoneNumber = scanner.next();
        String validNum = " ";

        if (phoneNumber.matches("^[d{265}0-9]{12}$")){
            validNum = phoneNumber;

//            System.out.println(phoneNumber);

            System.out.println("Welcome to Dzungu Kukoma Cafeteria!" + "\n");
            getChoices();

        }else {
            System.out.println("Invalid number");
            if (!validNum.equals(phoneNumber)){
                getPhoneNumber();
            }
        }
    }
    public void getChoices(){
        System.out.println("What do you want to do?");
        System.out.println("\t"+"1. Add new gyn members"+ "\n"+
                "\t" + "2. Delete gym member" +"\n" +
                "\t" + "3. Issue meal cards" + "\n" +
                "\t" + "4. Print report" + "\n" +
                "\t" + "5. Logout");
    }
}