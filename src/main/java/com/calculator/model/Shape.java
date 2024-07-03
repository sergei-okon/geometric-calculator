package com.calculator.model;

import com.calculator.model.enums.ShapeType;
import com.calculator.model.shapes.Circle;
import com.calculator.model.shapes.Rectangle;
import com.calculator.model.shapes.Square;
import com.calculator.model.shapes.Triangle;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Square.class, name = "square"),
        @JsonSubTypes.Type(value = Rectangle.class, name = "rectangle"),
        @JsonSubTypes.Type(value = Triangle.class, name = "triangle"),
        @JsonSubTypes.Type(value = Circle.class, name = "circle")
})
public interface Shape {

    double calculateArea();

    double calculatePerimeter();

    ShapeType getShapeType();

}
