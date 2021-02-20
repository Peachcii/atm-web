package th.ac.ku.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import th.ac.ku.atm.model.BankAccount;

import java.util.ArrayList;

@Controller
public class BankAccountController {
    ArrayList<BankAccount> bankAccount = new ArrayList<>();

    @GetMapping("/bankaccount")
    public String getBankPage(Model model) {
        ArrayList<BankAccount> bankaccount= new ArrayList<>();
       //...
        model.addAttribute("allBankAccount", bankaccount);
        return "bankaccount";  // customer.html
    }
    @PostMapping("/bankaccount")
    public String registerBankAccount(@ModelAttribute BankAccount bankaccount, Model model) {
        bankaccount.add(bankaccount);
        model.addAttribute("allBankAccount", bankaccount);
        return "redirect:bankaccount";
    }
}