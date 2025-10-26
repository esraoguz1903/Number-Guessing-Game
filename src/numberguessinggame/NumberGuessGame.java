package numberguessinggame;


public class NumberGuessGame {
    GameConfig config;
    int secretNumber;
    
    public NumberGuessGame(GameConfig config, int secretNumber) {
        this.config = config;
        this.secretNumber = secretNumber;
    }

    
    
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
    
    int remainingAttempt(){
        return config.maxAttempts;
    }
    
    
    
    
    
}