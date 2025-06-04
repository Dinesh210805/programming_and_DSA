// 1) Discount giver  =>  purchase > 2000 discount => 500
// 2) last digit even and last before digit 7
// 3) Find sum of digit of a numbers last 2 digit
// 4) eligible to vote or not
// 5) i/p: h o/p: head  i/p: t o/p: tail
//    i/p: H o/p: HEAD

// 6) i/p: train ticket discount => child  -> 1/2
//                                  adult  -> 1
//                                  seniorc-> -300
// 7) i/p: A        i/p: f
//    o/p: Vowel    o/p: Consonent
import java.util.*;

public class Assignment {

    // 1) Discount giver  =>  purchase > 2000 discount => 500
    static void discountGiver(int purchaseAmount) {
        if (purchaseAmount > 2000)
            System.out.println("Discount: 500");
        else
            System.out.println("No Discount");
    }

    //2) last digit even and last before digit 7
    static void checkDigits(int number) {
        int last = number % 10;
        int sLast = (number / 10) % 10;

        if (last % 2 == 0 && sLast == 7)
            System.out.println("true ");
        else
            System.out.println("false");
    }

    //3) Find sum of digit of a numbers last 2 digit
    static void sumLastTwoDigits(int number) {
        int last = number % 10;
        int sLast = (number / 10) % 10;
        System.out.println("Sum of Last Two Digits: " + (last + sLast));
    }

    //  4) eligible to vote or not

    static void voteEligibility(int age) {
        if (age >= 18)
            System.out.println("Eligible ");
        else
            System.out.println("Not Eligible ");
    }

    // 5) i/p: h o/p: head  i/p: t o/p: tail  i/p: H o/p: HEAD
    static void headOrTail(char ch) {
        switch (Character.toLowerCase(ch)){
            case 'h':
                System.out.println(Character.isUpperCase(ch) ? "HEAD" : "head");
                break;
            case 't':
                System.out.println(Character.isUpperCase(ch) ? "TAIL" : "tail");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    // 6) i/p: train ticket discount => child  -> 1/2 | adult  -> 1 | seniorc-> -300
    static void trainTicketDiscount(String category) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base ticket price: ");
        double basePrice = sc.nextDouble();
        switch (category.toLowerCase()) {
            case "child":
                System.out.println("Discounted Ticket Price: " + (basePrice * 0.5));
                break;
            case "adult":
                System.out.println("Ticket Price: " + basePrice);
                break;
            case "seniorc":
                System.out.println("Discounted Ticket Price: " + (basePrice - 300));
                break;

        }
    }
    

    // 7) i/p: A        i/p: f    o/p: Vowel    o/p: Consonent
    static void checkVowelOrConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        if ("aeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else if (Character.isLetter(ch))
            System.out.println("Consonant");
        else
            System.out.println("Invalid Character");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("1. Enter purchase amount:");
        discountGiver(sc.nextInt());

        System.out.println("\n2. Enter a number:");
        checkDigits(sc.nextInt());

        System.out.println("\n3. Enter a number:");
        sumLastTwoDigits(sc.nextInt());

        System.out.println("\n4. Enter age:");
        voteEligibility(sc.nextInt());

        System.out.println("\n5. Enter H/h or T/t:");
        headOrTail(sc.next().charAt(0));

        System.out.println("\n6. Enter ticket category (child/adult/seniorc):");
        trainTicketDiscount(sc.next());

        System.out.println("\n7. Enter a character:");
        checkVowelOrConsonant(sc.next().charAt(0));

        sc.close();
    }
}
