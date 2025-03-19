package com.example.demo.auth.model;

import com.example.demo.auth.model.enums.RoleName;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_roles")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private RoleName name;

}
