package org.example.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ApplicationDto {
    private Long studentId;
    private Long postId;
    private String status;
    private String resumeLink;
}
