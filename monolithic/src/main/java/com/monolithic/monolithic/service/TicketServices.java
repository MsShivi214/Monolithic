package com.monolithic.monolithic.service;

import com.monolithic.monolithic.model.TicketModel;
import com.monolithic.monolithic.repo.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TicketServices {
    @Autowired
    private TicketRepo repo;

    //create user
    public TicketModel createTicket(TicketModel model){
        String ticketId = UUID.randomUUID().toString();
        model.setTicketId(ticketId);
        return repo.save(model);
    }

    //get user by id
    public TicketModel getTicketById(String ticketId){
        return repo.findById(ticketId).get();
    }

    //get all users
    public List<TicketModel> getAllTickets()
    {
        return repo.findAll();
    }
}