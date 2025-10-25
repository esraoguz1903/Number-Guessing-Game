package numberguessinggame;


public class Attempt {
    public static enum guessResult{
        LOW,
        HİGH,
        CORRECT
    }
    
    int guessValue; //Tahmin edilen değer
    String result; //ENUM değeri de olabilir LOW HİGH CORRECT şeklinde bir sonuç dönecek
    int attemptNo; //deneme nosu kaçıncı deneme olduğu
    
    //Constructor
    public Attempt(int guessValue, String result, int attemptNo) {
        this.guessValue = guessValue;
        this.result = result;
        this.attemptNo = attemptNo;
    }
    
    //Basit Erişçiler
    public int getGuessValue() {
        return guessValue;
    }

    public String getResult() {
        return result;
    }

    public int getAttemptNo() {
        return attemptNo;
    }
    
    
  
    
    

}
