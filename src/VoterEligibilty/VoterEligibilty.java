package VoterEligibilty;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class VoterEligibilty {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        if(age <= 18 ){
            System.out.println("is not eligible");
        }
        else{
            System.out.println("is eligible");
        }



        }


    }





