package com.example.general.demo.data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PhoneJdbcTemplateRepository implements PhoneRepository {

    private final JdbcTemplate jdbcTemplate;

    public PhoneJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}

    @Override
    public boolean recordPush(String message) {

        final String sql = "insert into button_pushes (message) values (?);";

        return jdbcTemplate.update(sql, message) > 0;

    }
}
