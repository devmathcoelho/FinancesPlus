package com.financeplus.Server.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Exit of User
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Expense> expenses;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Bill> bills;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Card> cards;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Category> categories;

    private BigDecimal totalRevenue;
    private BigDecimal totalExpense;
    private BigDecimal totalBalance;

    private LocalDateTime createdAt = LocalDateTime.now();
}
