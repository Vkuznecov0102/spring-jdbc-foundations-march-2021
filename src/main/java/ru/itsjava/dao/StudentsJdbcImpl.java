package ru.itsjava.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentsJdbcImpl implements StudentsJdbc {


    @Override
    public int countStudentByName(String fio) {
        return 0;
    }
}
