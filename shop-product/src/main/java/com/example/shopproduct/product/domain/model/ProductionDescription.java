package com.example.shopproduct.product.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable // 값 객체를 정의(엔티티와 다르게 ID가 없고 값 객체 전체가 생성되어 대체되는 형태로 변경)
@Data
public class ProductionDescription {
    @Enumerated(EnumType.STRING)
    private ColorType color;

    @Enumerated(EnumType.STRING)
    private SizeType size;
}
