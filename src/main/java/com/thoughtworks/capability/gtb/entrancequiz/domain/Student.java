package com.thoughtworks.capability.gtb.entrancequiz.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "studeng_form")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
}
