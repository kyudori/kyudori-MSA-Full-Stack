package com.example.springrestedu.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springrestedu.dto.ComicActor;
import com.example.springrestedu.dto.ComicActorModel;

import java.util.Collection;

@RestController
public class HateoasRestController {
    @GetMapping("/all")
    public CollectionModel<ComicActorModel> allActor() {

        Collection<ComicActorModel> models = new java.util.ArrayList<>();
        models.add(new ComicActorModel("둘리").add(Link.of("http://localhost:8088/dooly")));
        models.add(new ComicActorModel("또치").add(Link.of("http://localhost:8088/ddochi")));
        models.add(new ComicActorModel("도우너").add(Link.of("http://localhost:8088/dauner")));

        return CollectionModel.of(models);
    }

    @GetMapping("/dooly")
    public ResponseEntity<ComicActor> getDooly() {
        ComicActor model = new ComicActor("둘리", "쌍문동", "dooly.png");
        return ResponseEntity.ok().body(model);
    }

    @GetMapping("/ddochi")
    public ResponseEntity<ComicActor> getDdochi() {
        ComicActor model = new ComicActor("또치", "아프리카", "ddochi.png");
        return ResponseEntity.ok().body(model);
    }

    @GetMapping("/dauner")
    public ResponseEntity<ComicActor> getDauner() {
        ComicActor model = new ComicActor("도우너", "깐따삐아", "dauner.png");
        return ResponseEntity.ok().body(model);
    }
}
