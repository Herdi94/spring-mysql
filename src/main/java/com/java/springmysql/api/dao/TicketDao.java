package com.java.springmysql.api.dao;

import com.java.springmysql.api.model.Ticket;
import org.springframework.data.repository.CrudRepository;



public interface TicketDao extends CrudRepository<Ticket,Integer>{

}
