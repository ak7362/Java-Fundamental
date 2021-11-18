import java.util.Scanner;

public class Course {
    public static void studied(int n, String s) {
        if (n == 1) {
            System.out.println("For all Branches:");
            System.out.println("English,Math,Science");
        } else if (n == 2) {
            if (s.equalsIgnoreCase("CSE")) {
                System.out.printf("%d year of Computer Science Branch of Subject: \n",n);
                System.out.println("Operating System, Java, Data Structure");
            }
           else if (s.equalsIgnoreCase("ECE")) {
                System.out.printf("%d year of E Branch of Subject: \n",n,s);
                System.out.println("Micro processors, Logic switching theory");
            }
           else if (s.equalsIgnoreCase("MECH")) {
                System.out.printf("%d year of Mechanical Branch of Subject: \n",n);
                System.out.println("Drawing, Manufacturing Machines");
            }
             else
                System.out.println("Invalid input");
        } else if (n == 3) {
            if (s.equalsIgnoreCase("CSE")) {
                System.out.printf("%d year of Computer Science  Branch of Subject: \n",n);
                System.out.println("Computer Organization, MultiMedia");
            }
            else if (s.equalsIgnoreCase("ECE")) {
                System.out.printf("%d year of %s Branch of Subject: \n",n,s);
                System.out.println("Fundamentals of logic Design, Microelectronics");
            }
           else if (s.equalsIgnoreCase("MECH")) {
                System.out.printf("%d year of Mechanical Branch of Subject: \n",n);
                System.out.println("Internal Combustion Engines, Mechanical Vibration");
            } 
            else
                System.out.println("Invalid input");
        }
         else if (n == 4) {
            if (s.equalsIgnoreCase("CSE")) {
                System.out.printf("%d year of Computer Science Branch of Subject: \n",n);
                System.out.println("Data Communication and Network, MultiMedia");
            }
             else if (s.equalsIgnoreCase("ECE")) {
                System.out.printf("%d year of %s Branch of Subject: \n",n,s);
                System.out.println("Embedded System,Image Processing");
            } 
            else if (s.equalsIgnoreCase("MECH")) {
                System.out.printf("%d year of Mechanical Branch of Subject: \n",n);
                System.out.println("Production Technology, Thermal Engineering");
            } 
            else
                System.out.println("Invalid input");
        } 
        else
        System.out.println("Invalid input");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you are which year(inti.e 1,2,3,4):");
        int year = sc.nextInt(5);
        System.out.print("Enter you Branch(String,i.e ECE,CSE,MECH):");
        String branch = sc.next();
        System.out.println();
        studied(year, branch);

        // System.out.println(year);
        sc.close();
    }
}
