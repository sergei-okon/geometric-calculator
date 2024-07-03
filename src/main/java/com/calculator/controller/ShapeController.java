package com.calculator.controller;

import com.calculator.model.Shape;
import com.calculator.model.dto.ShapeResponseDto;
import com.calculator.service.ShapeCalculationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/api/v1/shape")
@RequiredArgsConstructor
public class ShapeController {

    private final ShapeCalculationService shapeCalculationService;

    @PostMapping("/calculate")
    public ResponseEntity<ShapeResponseDto> calculate(@Valid @RequestBody Shape shape) {
        ShapeResponseDto shapeResponseDto = shapeCalculationService.calculate(shape);

        log.info("ShapeResponseDto: [{}]", shapeResponseDto);
        return ResponseEntity.ok(shapeResponseDto);
    }
}