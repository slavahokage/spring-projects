package itstep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("/calc")
    @ResponseBody
    public String calc(@RequestParam Integer a){
        System.out.println(a);
        return a.toString();
    }

}
