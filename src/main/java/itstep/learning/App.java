package itstep.learning;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        PhoneList view = new PhoneList();
        Scanner scanner = new Scanner( System.in );
        boolean isWork = true;
        do {
            switch (menu()) {
                case 1: {
                    System.out.println("------Users------");
                    view.printAll();
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("----Find by phone----");
                    System.out.print("Phone: ");     String phone = scanner.next();
                    System.out.println();
                    User user = view.findByPhone(phone);
                    if (user != null) System.out.println(user.toString());
                    else System.out.println("Not found");
                    break;
                }
                case 3: {
                    System.out.println("----Find by name----");
                    System.out.print("Name: ");     String name = scanner.next();
                    System.out.println();
                    User user = view.findByName(name);
                    if (user != null) System.out.println(user.toString());
                    else System.out.println("Not found");
                    break;
                }
                case 4: {
                    System.out.println("----Add user----");
                    System.out.print("Name: ");     String name = scanner.next();
                    System.out.print("Phone: ");  String phone = scanner.next();
                    view.addUser(name, phone);
                    break;
                }
                case 0: {
                    isWork = false;
                }
            }
        } while (isWork);


    }

    public static int menu() {
        Scanner scanner = new Scanner( System.in );
        int res = 0;
        do {
            System.out.println("1 - вивести все");
            System.out.println("2 - пошук за тлф");
            System.out.println("3 - пошук за іменем");
            System.out.println("4 - додати запис");
            System.out.println("0 - вихід");
            res = scanner.nextInt();
        } while ( !(0 <= res && res <= 4) );
        return res;
    }
}
