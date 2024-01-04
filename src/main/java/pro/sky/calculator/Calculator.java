package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/calculator")
public class Calculator {

    @GetMapping()
        public String calculator () {
        return "Добро пожаловать в калькулятор";
    }
    private final CalculateService calculateService;
    public Calculator(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping(path = "/plus")
        public String calculateSum (@RequestParam("num1") int num1, @RequestParam ("num2") int num2) {
        return num1 + " + " + num2 + " = " + calculateService.calculateSum (num1, num2);

    }
    @GetMapping(path = "/minus")
    public String calculateDifference (@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
       return num1 + " * " + num2 + " = " + calculateService.calculateDifference (num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String calculateProduct (@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
       return num1 + " * " + num2 + " = " + calculateService.calculateProduct (num1, num2);
    }
    @GetMapping(path = "/divide")
    public String calculateQuotient (@RequestParam (value = "num1", required = false) Integer num1, @RequestParam (value = "num2", required = false) Integer num2) {
        if ((num1 == null) || (num2 == null)) {
            return "Ошибка. Не заданы значения!";
        }
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + calculateService.calculateQuotient (num1, num2);
        }
        else return "Ошибка. На ноль делить нельзя!";


    }

}
