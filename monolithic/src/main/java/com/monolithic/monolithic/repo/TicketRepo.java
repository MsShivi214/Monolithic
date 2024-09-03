package com.monolithic.monolithic.repo;

import com.monolithic.monolithic.model.TicketModel;
import com.monolithic.monolithic.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<TicketModel, String> {
    //create custom crud method


}