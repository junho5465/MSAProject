package com.dream.productservice.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
	private int proNo;	//��ǰ ��ȣ
	private String proName;	//��ǰ �̸�
	private double proLimit;	// ���� �ѵ�
	private String description;	// ��ǰ ����
	private Date term;	//���� �Ⱓ
}