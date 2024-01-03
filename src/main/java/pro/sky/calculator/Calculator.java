package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @GetMapping(path = "/calculator")
        public String calculator () {
        return "Добро пожаловать в калькулятор";
    }
    private final CalculateService calculateService;
    public Calculator(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping(path = "/calculator/plus")
        public String calculateSum (@RequestParam("num1") int num1, @RequestParam ("num2") int num2) {
        return calculateService.calculateSum (num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String calculateDifference (@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
        return calculateService.calculateDifference (num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String calculateProduct (@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
        return calculateService.calculateProduct (num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String calculateQuotient (@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
        return calculateService.calculateQuotient (num1, num2);
    }
}
