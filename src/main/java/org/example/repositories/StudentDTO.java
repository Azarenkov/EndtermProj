package org.example.repositories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class StudentDTO {
    private String email;
    private String name;
    private String surname;
    private String password;
    private Long groupId;
}