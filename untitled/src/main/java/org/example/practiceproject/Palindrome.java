package org.example.practiceproject;

public class Palindrome {
    public static boolean isPali(int num) {
        int rev = 0;
        int ori = num;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return ori == rev;
    }

    public static void main(String[] args) {
        boolean res=Palindrome.isPali(121);
        if(res){
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("it is not a palindrome");
        }
    }
}
