package com.hcl.project.accountmanagement.AccountMain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.project.accountmanagement.AccountMain.entity.Blog;

import java.util.List;

@Repository
public interface BlogRespository extends JpaRepository<Blog, Integer> {

    List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);

}
