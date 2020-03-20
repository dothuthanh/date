import java.util.Scanner;

public class Date {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Which month that you want to count days?");
        int month = sc.nextInt();
        String dayaInMonth;
        switch (month){
            case 2:
                dayaInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayaInMonth = "31";
                break;
            case 4:
            case 6:
            case 11:
                dayaInMonth = "30";
                break;
            default:
                dayaInMonth = "";
        }
        if (dayaInMonth != "")
            System.out.printf("The month '%d' has %s days!", month,dayaInMonth);
        else
            System.out.print("Invalid input");

    }
}
