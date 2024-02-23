package com.example.demothymeleaf.Service;

import com.example.demothymeleaf.Dto.TestDto;
import com.example.demothymeleaf.Repository.TestRepository;
import com.example.demothymeleaf.domain.Test;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public TestDto testServiceMethod(String str) {
        TestDto testDto = new TestDto(str);
        return testDto;
    }

    // 전체 조회
    public List<Test> findall(){
        return testRepository.findAll();
    }
}