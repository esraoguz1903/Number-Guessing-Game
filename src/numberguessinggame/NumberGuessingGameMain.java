package numberguessinggame;

import java.util.InputMismatchException;
import java.util.Scanner;


public class NumberGuessingGameMain {

    public static void main(String[] args) {
        
//GameConfig nesnesi oluşturuldu.
        GameConfig gameConfig = new GameConfig();
        
        //GameConfig sınıfındaki aralık seçme fonksiyonu çağrıldı
        System.out.println("Range (1)1-100, (2)1-1000");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        
        //Seçtiğim aralığa uygun random sayıyı randomNumber değişkenine eşitliyorum.
        int randomNumber = gameConfig.range(range);
        
        //Eğer seçtiğim aralık 1 ve 2 sayılarının dışındaysa tekrar seçtiriyorum.
        while(randomNumber == 0){
            System.out.println("Range (1)1-100, (2)1-1000");
            range = sc.nextInt();
            randomNumber = gameConfig.range(range);
        }
        
        //GameConfig sınıfındaki maksimum deneme hakkının tutulduğu fonksiyon çağrıldı
        gameConfig.maxAttempts();
        
        //NumberGuessGame nesnesi oluşturuldu ve alt tarafta bu sınıfa ait remainingAttempt metodu çağrıldı.
        NumberGuessGame numberGuessGame = new NumberGuessGame(gameConfig, randomNumber);
            
        
        int attemptResult = numberGuessGame.remainingAttempt();
        while(numberGuessGame.remainingAttempt() > 0){
          
            
            try {
                
                System.out.println("Tahmininizi girin: ");
                int guess = sc.nextInt();
                
                Attempt.guessResult guessresult= numberGuessGame.evaluateGuess(guess);
                System.out.println(guessresult);
                
                //Aralık dışı olan değeri kontrol eden kısım
                int max = gameConfig.max;
                int min = gameConfig.min;
                
                if(guess < min || guess > max){
                    System.out.println("Aralık dışı bir değer girdiniz! Lütfen " + min + " ile " + max + " arasında bir değer giriniz..." );
                    continue;
                }
                
                if(guessresult == Attempt.guessResult.CORRECT){
                    System.out.println("Tebrikler sayıyı buldunuz...");
                    break;
                }
                attemptResult--;
            
                System.out.println("Kalan hakkınız:"+ attemptResult);
            
                if(attemptResult == 0){
                    System.out.println("Hakkınız bitti... Tahmin etmeniz gereken sayı:"+ randomNumber);
                    break;
                }
                
                } catch (InputMismatchException e) {
                  
                    System.out.println("Sayı dışında bir değer girdiniz... Lütfen sayı giriniz!");
                    sc.next();
                }
                
            
            
        }
        
        
    }

}
