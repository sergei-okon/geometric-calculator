package com.calculator.model.dto;

import com.calculator.model.Shape;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ShapeResponseDto {

    private Shape shape;
    private Double area;
    private Double perimeter;

}
