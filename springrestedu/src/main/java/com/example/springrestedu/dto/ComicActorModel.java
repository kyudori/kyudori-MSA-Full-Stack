package com.example.springrestedu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;
@Getter
@AllArgsConstructor
public class ComicActorModel extends RepresentationModel<ComicActorModel> {
    String name;
}
