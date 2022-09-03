package com.sourav.springbootschdeuler.service;

import com.sourav.springbootschdeuler.dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import com.sourav.springbootschdeuler.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    //shcedule a job to add object in database after every 5 seconds
    @Scheduled(fixedRate = 5000)
    public void addToDbJob() {
        User user = new User();
        user.setName("Sourav" + new Random().nextInt(5000));
        userDao.save(user);
        System.out.println("User saved at " + new Date().toString());
    }

    //schedule to fetch data from database after every 15 seconds
    @Scheduled(cron = "0/15 * * * * *")
    public void fetchFromDb() {
        List<User> users = userDao.findAll();
        System.out.println("User fetched at " + new Date());
        System.out.println("No of records = " + users.size());
        log.info("Users {}", users);
    }
}
