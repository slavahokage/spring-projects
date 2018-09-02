package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/greeting2")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting2";
    }

    @PostMapping("/greeting2")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }

    @GetMapping("/calc")
    public String calc(@RequestParam(name="a",  required=false, defaultValue="0") Integer a, @RequestParam(name="b",  required=false, defaultValue="0") Integer b, Model model) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        return "calc";
    }

    @GetMapping("/calc2")
    public String calc2Form(Model model){
        model.addAttribute("calculator", new Calculator());
        return "calc2";
    }

    @PostMapping("/calc2")
    public String calc2Submit(@ModelAttribute Calculator calculator) {
        return "calc2";
    }


}