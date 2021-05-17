package com.sun.book.springboot.web;

import com.sun.book.springboot.service.posts.PostsService;
import com.sun.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor // 생성자로 Bean을 받아 @Autowired와 동일한 효과
@RestController
public class PostApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestsDto){
        return postsService.save(requestsDto);
    }
}
