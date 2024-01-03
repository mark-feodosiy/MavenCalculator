package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    //@GetMapping(path = "/calculator/plus")

    public String calculateSum (int num1, int num2) {
        return (num1 + " + " + num2 + " = " + (num1 + num2));
    }

   // @GetMapping(path = "/calculator/minus")
    public String calculateDifference (int num1, int num2) {
        return (num1 + " - " + num2 + " = " + (num1 - num2));
    }
   // @GetMapping(path = "/calculator/multiply")
    public String calculateProduct ( int num1, int num2) {
        return (num1 + " * " + num2 + " = " + (num1 * num2));
    }
  //  @GetMapping(path = "/calculator/divide")
    public String calculateQuotient (int num1, int num2) {
        return (double) num1 + " / " + num2 + " = " + (num1 / num2);

    }

}


