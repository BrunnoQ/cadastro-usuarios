package com.brunnus.cadastrousuarios.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.UUID;

@Data
@EqualsAndHashCode
public class UserDTO {
    private UUID id;
    private String name;
    private String email;
    private String password;
}