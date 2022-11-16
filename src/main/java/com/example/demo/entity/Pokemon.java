package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pokemon implements PokeApiResource {
    @Id
    private Integer id;
    private String url;
    private Integer height;
    private String name;
    private Sprites sprites;
    private Integer weight;
}
