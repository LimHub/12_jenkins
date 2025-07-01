package com.lhw.jenkins.service;


import com.lhw.jenkins.dto.CalculatorDto;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plusTwoNumbers(CalculatorDto calculatorDto) {
        return calculatorDto.getNum1()+calculatorDto.getNum2();
    }
}
