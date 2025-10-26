package numberguessinggame;


public class NumberGuessGame {
    GameConfig config;
    int secretNumber;
    
    public NumberGuessGame(GameConfig config, int secretNumber) {
        this.config = config;
        this.secretNumber = secretNumber;
    }

    
    //Kullanıcının tahmin girişi ile oluşturulan random sayının karşılaştırılmasının yapıldığı method
    Attempt.guessResult evaluateGuess(int guess){
       //Attempt.guessResult result;
        if(guess > secretNumber){
            return Attempt.guessResult.HIGH;
        }
        else if(guess < secretNumber){
            return Attempt.guessResult.LOW;
        }
        else{
            return Attempt.guessResult.CORRECT;
            
        }
        
    }
    
    //Kullanıcının kalan hakkını kontrol eden method.
    int remainingAttempt(){
        return config.maxAttempts;
    }
    
    
    
    
    
}