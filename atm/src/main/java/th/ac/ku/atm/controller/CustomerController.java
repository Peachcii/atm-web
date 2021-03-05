package th.ac.ku.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.atm.model.Customer;
import th.ac.ku.atm.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    //private List<Customer> customer = new ArrayList<>();
    private CustomerService CustomerService;

    public CustomerController(th.ac.ku.atm.service.CustomerService customerService) {
        CustomerService = customerService;
    }

    @GetMapping
    public String getCustomerPage(Model model){

        model.addAttribute("allCustomers",CustomerService.getCustomers());

        return "customer";  // customer in resource/templates
    }
    @PostMapping
    public String registerCustomer(@ModelAttribute Customer customer, Model model) {

        CustomerService.createCustomer(customer);
        model.addAttribute("allCustomers", CustomerService.getCustomers());
        return "redirect:customer";
    }

}
