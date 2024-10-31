package com.example.springrestedu.controller;

import com.example.springrestedu.entity.Friend;
import com.example.springrestedu.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/friends")
public class FriendController {
    @Autowired
    private FriendRepository friendRepository;

    @GetMapping
    public ResponseEntity<List<Friend>> getAllFriends() {
        List<Friend> friends = friendRepository.findAll();
        return new ResponseEntity<>(friends, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Friend> getFriendById(@PathVariable int id) {
        Optional<Friend> friend = friendRepository.findById(id);
        return friend.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> {
                    HttpHeaders headers = new HttpHeaders();
                    headers.add("BAD_ID", String.valueOf(id));
                    return new ResponseEntity<>(null, headers, HttpStatus.NOT_FOUND);
                });
    }

    @GetMapping("/search")
    public ResponseEntity<List<Friend>> getFriendByName(@RequestParam String fname) {
        List<Friend> friends = friendRepository.findByFname(fname);
        return new ResponseEntity<>(friends, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Friend> addFriend(@RequestBody Friend friend) {
        Friend savedFriend = friendRepository.save(friend);
        return new ResponseEntity<>(savedFriend, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateFriend(@PathVariable int id, @RequestBody Friend friend) {
        if (friendRepository.existsById(id)) {
            friend.setId(id);
            friendRepository.save(friend);
            return new ResponseEntity<>(HttpStatus.RESET_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFriend(@PathVariable int id) {
        if (friendRepository.existsById(id)) {
            friendRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.RESET_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
