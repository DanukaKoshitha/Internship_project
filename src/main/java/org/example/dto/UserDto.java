package org.example.dto;

import lombok.*;
import org.example.util.UserRole;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UserDto {
    private String userName;
    private String password;
    private UserRole userRole;
}
