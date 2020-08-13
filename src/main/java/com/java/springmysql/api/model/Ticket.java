package com.java.springmysql.api.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Ticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket {

    @Id
    @GeneratedValue
    private int id;
    private double amount;
    private String catagory;
}
