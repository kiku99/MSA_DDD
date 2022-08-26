package com.example.msa_ddd.account.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable // �� ��ü�� ����(��ƼƼ�� �ٸ��� ID�� ���� �� ��ü ��ü�� �����Ǿ� ��ü�Ǵ� ���·� ����)
@Data
public class Address {

    private String homeAddress;
    private int zipCode; // ������ȣ
}