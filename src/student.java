import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        int N;   //variable for number of students entered by the user
        int a[];
        profile[] s = new profile[9];
        Scanner input = new Scanner(System.in);
        System.out.println("How Many Students' Data Would you like to Enter? ");
        N = input.nextInt();
        System.out.println("N: " + N);
        a = new int[N];
        System.out.println("Okay, now Please Enter Student Profile Details One by One.");
        for (int j = 0; j < N; j++) {
            s[j] = new profile();
            input.nextLine();
            String  fname       = input.nextLine();
            String  lname       = input.nextLine();
            int     pid         = input.nextInt();
            input.nextLine();
            String  cstanding   = input.nextLine();
            String  eid         = input.nextLine();
            String  address     = input.nextLine();
            String  city        = input.nextLine();
            String  state       = input.nextLine();
            int     zip         = input.nextInt();
            s[j].getInfo(fname, lname, pid, cstanding, eid, address, city, state, zip);
        }
        System.out.println("Student Details for the Department of ILT");
        for (int j = 0; j < N; j++) {
            System.out.println("Student: " + j + ":");
            s[j].displayInfo();
            System.out.println("\t");
        }
        System.out.println("Total Number of Students" + N);
    }
}