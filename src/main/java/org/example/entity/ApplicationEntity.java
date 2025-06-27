package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "application")

public class ApplicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;

    @ManyToOne
    @JoinColumn(name = "student_Id",nullable = false)
    private UserEntity studentId;

    @ManyToOne
    @JoinColumn(name = "post_Id",nullable = false)
    private InternshipPostEntity postId;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String resumeLink;
}
