package SpringBoot.kakaoDev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/address")
public class AddresController {
    @GetMapping("/main")
    public ModelAndView main(){
        return new ModelAndView("address");
    }
}
