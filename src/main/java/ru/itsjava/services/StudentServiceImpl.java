package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itsjava.dao.StudentsJdbc;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl  implements StudentService{

    private final StudentsJdbc studentsJdbc;

    @Override
    public int countStudentByName(String fio) {
        return studentsJdbc.countStudentByName(fio);
    }
}
