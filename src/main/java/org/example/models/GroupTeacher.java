package org.example.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "group_teachers")
public class GroupTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    @Getter
    private Group group;

    @ManyToOne
    @JoinColumn(name = "teacher_email", nullable = false)
    private Teacher teacher;

    @Column(nullable = false)
    private String course;
}