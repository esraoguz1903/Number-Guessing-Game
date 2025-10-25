package numberguessinggame;

import java.util.Scanner;


public class GameConfig {

    int min;
    int max;
    int maxAttempts;
    
    Scanner sc = new Scanner(System.in);
    int range(int secim){
        if(secim == 1){
            min = 1;
            max = 100;
            System.out.println("Seçtiğiniz aralık: 1-100");
            return RandomNumberGenerator.generate(min, max);
        }
        else if(secim ==  2){
            min = 1;
            max = 1000;
            System.out.println("Seçtiğiniz aralık: 1-1000");
            return RandomNumberGenerator.generate(min, max);
        }
        
        else{
            System.out.println("Lütfen sadece 1 ve 2 sayılarından birini giriniz!");
        }
        return 0;
    }
    
    void maxAttempts(){
        System.out.println("Please enter the maximum number of attempts ");
        maxAttempts = sc.nextInt(); 
        System.out.println("Maximum Attempts: " + maxAttempts);
        
    }
    
    
    
    

    
}
