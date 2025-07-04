package com.lhw.jenkins.controller;

import com.lhw.jenkins.dto.CalculatorDto;
import com.lhw.jenkins.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//주석 추가
@Slf4j
@RestController
@RequiredArgsConstructor
public class CalcuratorController {
    private final CalculatorService calculatorService;

    @GetMapping("/health")
    public String healthCheck(){
        return "ArgoCd Change!!😍🥰";
    }
    @GetMapping("/plus")


    public ResponseEntity<CalculatorDto> plusTwoNumbers(CalculatorDto calculatorDto) {
        log.info("핸들러 실행 여부 및 값 확인 :  {} ", calculatorDto);

        /* Service 계층으로 기능 요청 */
        int result = calculatorService.plusTwoNumbers(calculatorDto);

        calculatorDto.setSum(result);
        return ResponseEntity.ok(calculatorDto);
    }
}
