import java.io.*;
import java.util.*;

public class check_palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse = "";
        int l = A.length();
        for(int i =l-1; i>= 0;i--){
            reverse += A.charAt(i);
        }
        if(reverse.equals(A)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}