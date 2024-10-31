package com.example.springrestedu.controller;

import com.example.springrestedu.entity.Friend;
import com.example.springrestedu.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

//        DB 넣는 코드
//		Friend friend1 = new Friend("둘리", 25);
//		Friend friend2 = new Friend("또치", 26);
//		Friend friend3 = new Friend("도우너", 27);
//		Friend friend4 = new Friend("마이콜", 28);
//
//		friendRepository.save(friend1);
//		friendRepository.save(friend2);
//		friendRepository.save(friend3);
//		friendRepository.save(friend4);

    @GetMapping
    public ResponseEntity<List<Friend>> getAllFriends() {
        List<Friend> friends = friendRepository.findAll();
        return new ResponseEntity<>(friends, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Friend>> getFriendById(@PathVariable int id) {
        Optional<Friend> friend = friendRepository.findById(id);

        if (friend.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(friend, HttpStatus.OK);
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
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFriend(@PathVariable int id) {
        if (friendRepository.existsById(id)) {
            friendRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
