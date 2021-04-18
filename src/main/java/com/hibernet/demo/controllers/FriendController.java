package com.hibernet.demo.controllers;

import com.hibernet.demo.models.Friend;
import com.hibernet.demo.repositories.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/friend")
public class FriendController {
    @Autowired
    private FriendRepository friendRepository;
    //genom get method adda kompis
    @GetMapping(path="/add")
    public String addFriend(@RequestParam String name,@RequestParam String adress,@RequestParam String email,@RequestParam String phonenumber){
        Friend friend1=new Friend();
        friend1.setName(name);
        friend1.setAdress(adress);
        friend1.setEmail(email);
        friend1.setPhonenumber(phonenumber);
        System.out.println(friend1);
        friendRepository.save(friend1);
        return "friend is saved";
    }
    //minilab6
    @GetMapping(path="/all")
    public Iterable<Friend> friends(){
       return friendRepository.findAll();

    }
    @GetMapping(path="/remove")
    public String removeFriendByName(@RequestParam ("name")String name){
        List<Friend> friendToRemove= friendRepository.findFriendByName(name);
        friendRepository.deleteAll(friendToRemove);
        return name+"Successfully removed";

    }
}
