package com.thoughtworks.capability.gtb.entrancequiz.domain;


@Entity
@Table(name = "team_form")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class team {
    @GeneratedValue
    private String name;
}

