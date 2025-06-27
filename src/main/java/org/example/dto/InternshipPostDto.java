package org.example.dto;

import lombok.*;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class InternshipPostDto {
    private String title;
    private String description;
    private String location;
    private String duration;
    private Date createBy;
    private String createByUsername;
}
