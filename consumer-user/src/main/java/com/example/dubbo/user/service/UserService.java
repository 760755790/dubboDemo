package com.example.dubbo.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.ticket.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TicketService ticketService;


    public void bugTicket() {
        System.out.println(ticketService.getTicket());
    }
}
