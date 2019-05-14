package com.application.model;

import org.springframework.beans.factory.annotation.Required;

public class Students {
    private Integer studentId;

    private String studentsName;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentsName() {
        return studentsName;
    }
    @Required
    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }
}
