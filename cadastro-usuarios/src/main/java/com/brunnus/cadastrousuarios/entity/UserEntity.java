package com.brunnus.cadastrousuarios.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.Entity;
import java.util.UUID;

@Data
@Entity
@EqualsAndHashCode
public class UserEntity {
    private UUID id;
    private String name;
    private String email;
    private String password;
}