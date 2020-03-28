package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlogController {

    private PostRepository postRepository;

    public BlogController (PostRepository obj) {
        postRepository = obj;
    }

    @RequestMapping("/")
    public String listPosts(ModelMap obj) {

        List<Post> listPostObj = postRepository.getAllPosts();

        obj.put("posts", "listPostObj");
        return "home";
    }
}
