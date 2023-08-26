import java.util.*;
import java.lang.String;
import java.io.*;
class Info
{
    Info()
    {
        //Welcome To Pizza Cashier System will be Displayed
        System.out.print("\n\n");
        System.out.println("\t\t\t\t\t\t\t\t ________________________________________________________");
        System.out.println("\t\t\t\t\t\t\t\t|                                                         |");
        System.out.println("\t\t\t\t\t\t\t\t|                                                         |");
        System.out.println("\t\t\t\t\t\t\t\t|                                                         |");
        System.out.println("\t\t\t\t\t\t\t\t|                   Welcome To Pizza Hub                  |");
        System.out.println("\t\t\t\t\t\t\t\t|                                                         |");
        System.out.println("\t\t\t\t\t\t\t\t|                                                         |");
        System.out.println("\t\t\t\t\t\t\t\t --------------------------------------------------------- ");
    }
    //Declaration of variables
    Scanner scan = new Scanner(System.in);
    String cust_name;
    String cust_addr;
    long cust_phno;
    int qnty;
    int choice;
    char check;
    int piz_price;
    int sum;
    int del;
    int pay;
    int a;
    //login page
    void login()
    {
        String paswd;
        String emp_name;
        int emp_id;
        System.out.print("\n\n");
        System.out.println("\t\t\t\t\t\t\t\t =======================================================");
        System.out.println("\t\t\t\t\t\t\t\t|                      PIZZA HUB                        |");
        System.out.println("\t\t\t\t\t\t\t\t =======================================================");
        System.out.print("\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("\t\t\t\t\t\t\t\t\t|                                |");
        System.out.println("\t\t\t\t\t\t\t\t\t|              LOGIN             |");
        System.out.println("\t\t\t\t\t\t\t\t\t|                                |");
        System.out.println("\t\t\t\t\t\t\t\t\t -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.print("\n");
        System.out.print("\t\t\t\t\t\t\t\t\tEnter Login Password : ");
        paswd = scan.next();
        if(paswd.equals("PizzaHub"))
        {
            System.out.println("\n\t\t\t\t\t\t\t\t\tAccess Granted");
            System.out.print("\n\n\t\t\t\t\t\t\t\t\tEmployee Name : ");
            emp_name = scan.next();
            System.out.println("\t\t\t\t\t\t\t\t\t--------------");
            if(emp_name.equals("Sakshi") || emp_name.equals("Rahul") || emp_name.equals("Sanjana") || emp_name.equals("Ruhi") || emp_name.equals("Shubham"))
            {
                list();
            }
            else
            {
                System.out.println("\n\t\t\t\t\t\t\t\t\tWrong Employee");
                exit();
            }
        }
        else
        {
            System.out.println("\n\t\t\t\t\t\t\t\t\tAccess Aborted");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Try Again");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Exit");
            System.out.print("\n\t\t\t\t\t\t\t\t\tEnter your choice : ");
            try {
                a = scan.nextInt();
                if(a==1)
                {
                    login();
                }
                else if (a==2)
                {
                    exit();
                }
                else{
                    System.out.print("\n\t\t\t\t\t\t\t\t\tInvalid Choice");
                    exit();
                }

            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter the Valid Option !");
                login();
            }

        }
    }
    void list()
    {
        char m;
        System.out.println("\n\n");
        System.out.println("\t\t\t\t\t\t\t\t *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("\t\t\t\t\t\t\t\t|                          PIZZA HUB                        |");
        System.out.println("\t\t\t\t\t\t\t\t *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("\n\t\t\t\t\t\t\t\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t\t\t\t\t|                                                         |");
        System.out.println("\t\t\t\t\t\t\t\t|                  1.) Customer Details                   |");
        System.out.println("\t\t\t\t\t\t\t\t|                  2.) Menu                               |");
        System.out.println("\t\t\t\t\t\t\t\t|                  3.) Delivery Mode                      |");
        System.out.println("\t\t\t\t\t\t\t\t|                  4.) Payment Mode                       |");
        System.out.println("\t\t\t\t\t\t\t\t|                  5.) Bill                               |");
        System.out.println("\t\t\t\t\t\t\t\t|                  6.) Exit                               |");
        System.out.println("\t\t\t\t\t\t\t\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("\n\t\t\t\t\t\t\t\tSelect from Above Options : ");
        m = scan.next().charAt(0);
        switch(m)
        {
            case '1' : custdetail();
                System.out.println("\n\t\t\t\t\t\t\t\t...............................Menu...............................");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t1. Onion Pizza Rs.150");
                System.out.println("\t\t\t\t\t\t\t\t\t\t2. Capsicum Pizza Rs.180");
                System.out.println("\t\t\t\t\t\t\t\t\t\t3. Golden Corn Pizza Rs.180");
                System.out.println("\t\t\t\t\t\t\t\t\t\t4. BBQ chicken Pizza Rs.200");
                System.out.println("\t\t\t\t\t\t\t\t\t\t5. Chicken Sausage Pizza Rs.200");
                System.out.println("\t\t\t\t\t\t\t\t\t\t6. Chicken Pepperoni Pizza Rs.220");
                System.out.println("\n\t\t\t\t\t\t\t\t..................................................................");

                do
                {
                    menu();
                    System.out.print("\n\t\t\t\t\t\t\t\tEnter Y if you want to order more : ");
                    check = scan.next().charAt(0);
                }while(check == 'Y');
                System.out.println("\n\t\t\t\t\t\t\t\tTotal Amount : "+sum);
                break;

            case '2' :

                System.out.println("\n\t\t\t\t\t\t\t\t...............................Menu...............................");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t1. Onion Pizza Rs.150");
                System.out.println("\t\t\t\t\t\t\t\t\t\t2. Capsicum Pizza Rs.180");
                System.out.println("\t\t\t\t\t\t\t\t\t\t3. Golden Corn Pizza Rs.180");
                System.out.println("\t\t\t\t\t\t\t\t\t\t4. BBQ chicken Pizza Rs.200");
                System.out.println("\t\t\t\t\t\t\t\t\t\t5. Chicken Sausage Pizza Rs.200");
                System.out.println("\t\t\t\t\t\t\t\t\t\t6. Chicken Pepperoni Pizza Rs.220");
                System.out.println("\n\t\t\t\t\t\t\t\t..................................................................");
                break;

            case '3' :
                System.out.println();
                System.out.println("\t\t\t\t\t\t\t\t1. Dine In");
                System.out.println("\t\t\t\t\t\t\t\t2. Pick Up");
                System.out.println("\t\t\t\t\t\t\t\t3. Home Delivery");
                delivery();
                break;

            case '4' :

                System.out.println();
                System.out.println("\t\t\t\t\t\t\t\t1. COD");
                System.out.println("\t\t\t\t\t\t\t\t2. Google Pay/Paytm");
                System.out.println("\t\t\t\t\t\t\t\t3. Credit/Debit");
                payment();
                break;


            case '5' : bill();
                break;

            case '6' : exit();
                break;

            default :  System.out.println("\n\t\t\t\t\t\t\t\tInvalid Option !! " );
                System.out.println("\n\t\t\t\t\t\t\t\tTry Again !! " );
                list();
        }
        list();
    }
    void custdetail()
    {
        System.out.print("\n\n\t\t\t\t\t\t\t\tCustomer Name : ");
        cust_name = scan.next();
        System.out.print("\n\t\t\t\t\t\t\t\tCustomer Address : ");
        cust_addr = scan.next();
        System.out.print("\n\t\t\t\t\t\t\t\tCustomer Phone No : ");
        cust_phno = scan.nextLong();
    }
    void menu()
    {
        int q;
        System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice : ");
        choice=scan.nextInt();

        switch (choice)
        {
            case 1:
                System.out.print("\n\t\t\t\t\t\t\t\tEnter the Quantity : ");
                q = scan.nextInt();
                System.out.println("\n\t\t\t\t\t\t\t\tYour order has been placed");
                System.out.println("\n\t\t\t\t\t\t\t\tOnion Pizza Rs.150");
                sum += 150*q;
                qnty += 1*q;
                break;

            case 2:
                System.out.print("\n\t\t\t\t\t\t\t\tEnter the Quantity : ");
                q = scan.nextInt();
                System.out.println("\n\t\t\t\t\t\t\t\tYour order has been placed");
                System.out.println("\n\t\t\t\t\t\t\t\tCapsicum Pizza Rs.180");
                sum += 180*q;
                qnty +=1*q;
                break;

            case 3:
                System.out.print("\n\t\t\t\t\t\t\t\tEnter the Quantity : ");
                q = scan.nextInt();
                System.out.println("\n\t\t\t\t\t\t\t\tYour order has been placed");
                System.out.println("\n\t\t\t\t\t\t\t\tGolden Corn Pizza Rs.180");
                sum += 180*q;
                qnty +=1*q;
                break;

            case 4:
                System.out.print("\n\t\t\t\t\t\t\t\tEnter the Quantity : ");
                q = scan.nextInt();
                System.out.println("\n\t\t\t\t\t\t\t\tYour order has been placed");
                System.out.println("\n\t\t\t\t\t\t\t\tBBQ chicken Pizza Rs.200");
                sum += 200*q;
                qnty +=1*q;
                break;

            case 5:
                System.out.print("\n\t\t\t\t\t\t\t\tEnter the Quantity : ");
                q = scan.nextInt();
                System.out.println("\n\t\t\t\t\t\t\t\tYour order has been placed");
                System.out.println("\n\t\t\t\t\t\t\t\tChicken Sausage Pizza Rs.200");
                sum += 200*q;
                qnty +=1*q;
                break;

            case 6:
                System.out.print("\n\t\t\t\t\t\t\t\tEnter the Quantity : ");
                q = scan.nextInt();
                System.out.println("\n\t\t\t\t\t\t\t\tYour order has been placed");
                System.out.println("\n\t\t\t\t\t\t\t\tChicken Pepperoni Pizza Rs.220");
                sum += 220*q;
                qnty +=1*q;
                break;

            default:
                System.out.println("\n\t\t\t\t\t\t\t\tInvalid Choice");
        }

    }

    void delivery(){

        System.out.print("\n\t\t\t\t\t\t\t\t\t\tEnter Delivery Mode : ");
        del=scan.nextInt();

        switch(del){
            case 1 :
                System.out.print("\t\t\t\t\t\t\t\t\t\tDine In");
                break;
            case 2 :
                System.out.print("\t\t\t\t\t\t\t\t\t\tPick up");
                break;
            case 3:
                System.out.print("\t\t\t\t\t\t\t\t\t\tHome Delivery");
                break;
            default:
                System.out.println("\t\t\t\t\t\t\t\t\t\tInvalid Option !");
        }
    }

    void payment()
    {
        System.out.print("\n\t\t\t\t\t\t\t\t\t\tEnter Payment Mode :");
        pay=scan.nextInt();

        switch(pay)
        {
            case 1 :
                System.out.println("\t\t\t\t\t\t\t\t\t\tCOD");
                break;
            case 2:
                System.out.println("\t\t\t\t\t\t\t\t\t\tGoogle Pay/Paytm");
                break;
            case 3:
                System.out.println("\t\t\t\t\t\t\t\t\t\tCredit/Debit");
                break;
            default:
                System.out.println("\t\t\t\t\t\t\t\t\t\tInvalid Option !");
        }
    }

    void bill()
    {
        System.out.println("\n\t\t\t\t\t\t\t\tCustomer Name : "+cust_name);
        System.out.println("\n\t\t\t\t\t\t\t\tCustomer Address : "+cust_addr);
        System.out.println("\n\t\t\t\t\t\t\t\tCustomer Phone No : "+cust_phno);
        System.out.println("\n\t\t\t\t\t\t\t\tQuantity : "+qnty);
        System.out.print("\n");
        if(del == 1){
            System.out.print("\t\t\t\t\t\t\t\tDelivery Mode : ");
            System.out.print("Dine In");
            System.out.print("\n");
        }
        else if(del == 2){
            System.out.print("\t\t\t\t\t\t\t\tDelivery Mode : ");
            System.out.print("Pick Up");
            System.out.print("\n");
        }
        else
        {
            System.out.print("\t\t\t\t\t\t\t\ttDelivery Mode : ");
            System.out.print("Home Delivery");
            System.out.print("\n");
        }
        if(pay == 1)
        {
            System.out.print("\n");
            System.out.print("\t\t\t\t\t\t\t\ttPayment Mode : ");
            System.out.print("COD");
            System.out.print("\n");
        }
        else if(pay == 2)
        {
            System.out.print("\n");
            System.out.print("\t\t\t\t\t\t\t\tPayment Mode : ");
            System.out.print("Google Pay/Paytm");
            System.out.print("\n");
        }
        else
        {
            System.out.print("\n");
            System.out.print("\t\t\t\t\t\t\t\tPayment Mode : ");
            System.out.print("Credit/Debit");
            System.out.print("\n");
        }
        System.out.println("\n\t\t\t\t\t\t\t\tTotal Bill : "+sum);
    }

    void exit()
    {
        System.out.println("\n\t\t\t\t\t\t\t\t ________________________________________________________");
        System.out.println("\t\t\t\t\t\t\t\t|                                                         |");
        System.out.println("\t\t\t\t\t\t\t\t|                                                         |");
        System.out.println("\t\t\t\t\t\t\t\t|                                                         |");
        System.out.println("\t\t\t\t\t\t\t\t|                Thank You for Visiting !!                |");
        System.out.println("\t\t\t\t\t\t\t\t|                                                         |");
        System.out.println("\t\t\t\t\t\t\t\t|                                                         |");
        System.out.println("\t\t\t\t\t\t\t\t --------------------------------------------------------- ");
        System.exit(0);
    }


}
public class cashiersys
{
    public static void main(String args[])
    {
        Info i = new Info();
        i.login();
        i.list();
    }
}