package com.financeplus.Server.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal value; // The limit of card
    private String lastFourNumbers; // The last 4 numbers of card
    private LocalDateTime dueDate; // Due date of invoice

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
