package numberguessinggame;

import static numberguessinggame.RandomNumberGenerator.generate;

public class NumberGuessGame {
    GameConfig config;
    int secretNumber;
    
    public NumberGuessGame(GameConfig config) {
        this.config = config;
        this.secretNumber = generate(config.min, config.max);
    }

    
    
    Attempt.guessResult evaluateGuess(int guess){
       //Attempt.guessResult result;
        if(guess > secretNumber){
            return Attempt.guessResult.HİGH;
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