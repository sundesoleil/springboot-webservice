package com.sun.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> { // Posts 클래스로 DB 접근하게 해 주는 역할

}
