package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name ="grades")
public class Grade {
    @Id
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String teacher;
    @Column(nullable = false)
    private String student;
    @Column(nullable = false)
    private String percentage;
}
