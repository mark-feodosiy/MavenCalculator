package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    //@GetMapping(path = "/calculator/plus")

    public int calculateSum (int num1, int num2) {
        return num1 + num2;
    }

   // @GetMapping(path = "/calculator/minus")
    public int calculateDifference (int num1, int num2) {
        return num1 - num2;
    }
   // @GetMapping(path = "/calculator/multiply")
    public int calculateProduct ( int num1, int num2) {
        return num1 * num2;
    }
  //  @GetMapping(path = "/calculator/divide")
    public double calculateQuotient (int num1, int num2) {
        return  (double) num1 / num2;

    }

}


