package dev.sevier.RevShopApp.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.ui.Model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import dev.sevier.RevShopApp.entity.Account;
import dev.sevier.RevShopApp.service.AccountService;
import dev.sevier.RevShopApp.entity.Item;
import dev.sevier.RevShopApp.service.ItemService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin
public class RevShopAppController {
    private final AccountService accountService;
    private final ItemService itemService;
    @Autowired
    public RevShopAppController(AccountService accountService, ItemService itemService) {
        this.accountService = accountService;
        this.itemService = itemService;
    }

    @PostMapping(value = "/register")
    public ResponseEntity<Account> register(@RequestBody Account a) {
        if (a.getPassword().length()<4 || a.getPassword().length()>10){
            return (ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(null));
        }
        Account newAccount = accountService.registerAccount(a);
        if (newAccount != null) {
            return ResponseEntity.status(HttpStatus.OK).body(newAccount);
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
    }

    @PostMapping(value = "/login")
    public ResponseEntity<Account> login(@RequestBody Account a) {
        Account loginAcc = accountService.loginAccount(a);
        if (loginAcc != null && loginAcc.getPassword().equals(a.getPassword())) {
            return ResponseEntity.status(HttpStatus.OK).body(loginAcc);
        }
        else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }

    @GetMapping(value = "/items")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
}
