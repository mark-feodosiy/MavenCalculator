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
    @GetMapping(path = "/calculator/plus")
        public String calculateSum (@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
        return (num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
