package com.dw.jpaapp.repository;

import com.dw.jpaapp.dto.CourseDTO;
import com.dw.jpaapp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course,Long> {
   // 과제1. 검색어를 매개변수로 전달하고 검색어를 포함한 title를 가진 과목을 API로 조회
   List<Course> findByTitleLike(String title);

}
