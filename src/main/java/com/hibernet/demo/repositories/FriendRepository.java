package com.hibernet.demo.repositories;

import com.hibernet.demo.models.Friend;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FriendRepository extends CrudRepository<Friend,Long> {
    List<Friend> findFriendByName(String name);
    List<Friend> findFriendByAdress(String adress);
    List<Friend> findFriendByEmail(String email);
    List<Friend> findFriendByPhonenumber(String phonenumber);
    List<Friend> findFriendByNameAndPhonenumber(String name,String phonenumber);
}
