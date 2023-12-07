package com.example.demo.controller;

import com.example.demo.domain.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {


    @Autowired
    ClientService clientService;



    @GetMapping("/clients")
    public ResponseEntity<List<Client>> getAll(){
        return ResponseEntity.ok(clientService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Client> saveOne(@RequestBody Client client){
        return ResponseEntity.ok(clientService.saveOne(client));

    }



}
