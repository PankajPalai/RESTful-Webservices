package com.pk.model;

import java.util.List;

import lombok.Data;

@Data
public class ExamData {
	private String studentName;
	private Integer academicYear;
	private List<Float> marks;
	private Float avg;
}
