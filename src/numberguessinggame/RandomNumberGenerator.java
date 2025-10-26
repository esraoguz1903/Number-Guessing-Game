package numberguessinggame;

import java.util.Random;

public class RandomNumberGenerator {

        
    //Gizli kalacak rastgele sayıyı üreten method
        static int generate(int min, int max){
            Random random = new Random();
           
            int randomNumber = random.nextInt(max - min + 1) + min;
            //System.out.println("Random number is created : " + randomNumber);
            
        return randomNumber;
    }

}
