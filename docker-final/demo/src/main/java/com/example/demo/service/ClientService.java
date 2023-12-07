package com.example.demo.service;


import com.example.demo.domain.Client;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;


    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Client saveOne(Client client){
        return clientRepository.save(client);
    }


}
