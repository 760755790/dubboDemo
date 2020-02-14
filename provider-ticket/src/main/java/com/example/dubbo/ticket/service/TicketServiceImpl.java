package com.example.dubbo.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service //属于Dubbo的@Service注解，非Spring  作用：暴露服务
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "这是一张通往幸福的门票";
    }
}
