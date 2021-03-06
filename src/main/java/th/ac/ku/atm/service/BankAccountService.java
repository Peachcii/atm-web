package th.ac.ku.atm.service;

import org.springframework.stereotype.Service;
import th.ac.ku.atm.model.BankAccount;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class BankAccountService {

    private RestTemplate restTemplate;

    public BankAccountService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public List<BankAccount> getCustomerBankAccount(int customerId) {
        String url = "http://localhost:8091/api/bankaccount/customer/" +
                customerId;
        ResponseEntity<BankAccount[]> response =
                restTemplate.getForEntity(url, BankAccount[].class);

        BankAccount[] accounts = response.getBody();

        return Arrays.asList(accounts);
    }

    public BankAccount findBankAccount(int id, BankAccount[] bankAccountsList) {
        for (BankAccount account : bankAccountsList) {
            if (account.getId() == id)
                return account;
        }
        return null;
    }
}
