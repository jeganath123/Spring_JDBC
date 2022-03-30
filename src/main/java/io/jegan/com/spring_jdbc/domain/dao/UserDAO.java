package io.jegan.com.spring_jdbc.domain.dao;

import io.jegan.com.spring_jdbc.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

//we have to use repositroy instead of component because its related to storing data
@Repository
public class UserDAO {
    private JdbcTemplate jdbcTemplate;



    public void printdetails(){
        String sql=" SELECT * from user_detail";
        List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        users.forEach(System.out::println);
    }
}
