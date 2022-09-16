package com.springboot.firstapp.Repository;

import com.springboot.firstapp.Data.DepartmentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentDto, Integer> {

    List<DepartmentDto> findByhorizontal(String horizontal);

    @Query(value = "select d from DepartmentDto d where d.id IN:names")
    List<DepartmentDto> fetchByDepartmentId(@Param("names") List<Integer> Ids);

    @Query(value = "select * from department where vertical in:names",nativeQuery = true)
    List<DepartmentDto>  departmentWithSameVertical(@Param("names")  List<String> vertical);
}
