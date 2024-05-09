package com.example.lesson18;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface Course {

    List<BlockProfessionItem> getCourses();

    List<BlockProfessionItem> getAdditionalCourses();

    List<String> getOpportunities();

//    <T extends Course> goToCategory(String category);
}
