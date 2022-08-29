package com.example.shopproduct.product.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable // �� ��ü�� ����(��ƼƼ�� �ٸ��� ID�� ���� �� ��ü ��ü�� �����Ǿ� ��ü�Ǵ� ���·� ����)
@Data
public class ProductionDescription {
    @Enumerated(EnumType.STRING)
    private ColorType color;

    @Enumerated(EnumType.STRING)
    private SizeType size;
}
