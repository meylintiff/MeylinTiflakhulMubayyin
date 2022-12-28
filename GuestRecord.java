import java.util.ArrayList;
import java.util.Scanner;

public class GuestRecord {
    public static void main(String[] args) {
        Scanner inputTamu = new Scanner(System.in);
        EventOrganiser s1 = new EventOrganiser("001", "melin", "tegal", "melin@gmail.com", "087654321");
        EventOrganiser s2 = new EventOrganiser("002", "andi", "tegal", "andi@gmail.com", "09878987654");
        EventOrganiser s3 = new EventOrganiser("003", "didi", "tegal", "didi@gmail.com", "09878987654");
        EventOrganiser s4 = new EventOrganiser("004", "rara", "tegal", "rara@gmail.com", "08987654456");
        EventOrganiser s5 = new EventOrganiser("005", "lili", "majalengka", "lili@gmail.com", "085263736748");
        EventOrganiser s6 = new EventOrganiser("006", "fizi", "cirebon", "fizi@gmail.com", "084367654321");
        EventOrganiser s7 = new EventOrganiser("007", "ijat", "tegal", "ijat@gmail.com", "081456734567");
        EventOrganiser s8 = new EventOrganiser("008", "jarjit", "majalengka", "jarjit@gmail.com", "0846782456");
        EventOrganiser s9 = new EventOrganiser("009", "mail", "brebes", "mail@gmail.com", "082355667384");
        EventOrganiser s10 = new EventOrganiser("010", "ikhsan", "cirebon", "ikhsan@gmail.com", "089967436736");

        s1.PrintGuests();
        s2.PrintGuests();
        s3.PrintGuests();
        s4.PrintGuests();
        s5.PrintGuests();
        s6.PrintGuests();
        s7.PrintGuests();
        s8.PrintGuests();
        s9.PrintGuests();
        s10.PrintGuests();

    }
}