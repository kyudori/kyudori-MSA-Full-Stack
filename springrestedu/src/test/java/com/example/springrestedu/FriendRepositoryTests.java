package com.example.springrestedu;

import com.example.springrestedu.entity.Friend;
import com.example.springrestedu.repository.FriendRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class FriendRepositoryTests {

    @Autowired
    private FriendRepository friendRepository;

    @Test
    @Transactional
    @DisplayName("CURD TEST")
    public void testCRUD() {
        Friend friend1 = new Friend("둘리",25);
        Friend friend2 = new Friend("또치",26);
        Friend friend3 = new Friend("도우너",27);
        Friend friend4 = new Friend("마이콜",28);

        friendRepository.save(friend1);
        friendRepository.save(friend2);
        friendRepository.save(friend3);
        friendRepository.save(friend4);

        List<Friend> friends = friendRepository.findAll();
        assertTrue(friends.size() >= 1);

        Friend friend = friendRepository.findById(friend4.getId()).orElseThrow();
        friend.setFage(24);
        friendRepository.save(friend);

        friendRepository.delete(friend);
        friends = friendRepository.findAll();
        assertTrue(friends.size() >= 3);
    }

//	@Test
//	@DisplayName("CREATE TEST")
//	public void testC() {
//		Friend friend1 = new Friend("둘리", 25);
//		Friend friend2 = new Friend("또치", 26);
//		Friend friend3 = new Friend("도우너", 27);
//		Friend friend4 = new Friend("마이콜", 28);
//
//		friendRepository.save(friend1);
//		friendRepository.save(friend2);
//		friendRepository.save(friend3);
//		friendRepository.save(friend4);
//
//		List<Friend> friends = friendRepository.findAll();
//		assertTrue(friends.size() >= 1);
//	}
//
//	@Test
//	@DisplayName("READ TEST")
//	public void testR() {
//		List<Friend> friends = friendRepository.findAll();
//		assertTrue(friends.size() >= 1);
//	}
//
//	@Test
//	@DisplayName("UPDATE TEST")
//	public void testU() {
//		Friend friend = friendRepository.findById(4).orElseThrow();
//		friend.setFage(20);
//		friendRepository.save(friend);
//		assertEquals(20, (int) friend.getFage());
//	}
//
//	@Test
//	@DisplayName("DELETE TEST")
//	public void testD() {
//		Friend friend = friendRepository.findById(4).orElseThrow();
//		friendRepository.delete(friend);
//
//		// 삭제 후 존재하지 않는지 확인
//		assertFalse(friendRepository.findById(4).isPresent());
//	}
}
