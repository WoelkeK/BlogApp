package pl.woelke.springblogwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.woelke.springblogwebapp.model.PostModel;
import pl.woelke.springblogwebapp.service.PostService;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class PostController {

    private static final Logger LOGGER = Logger.getLogger(PostController.class.getName());

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/admin/posts")
    public String findAllPost(Model model){
        List<PostModel> posts = postService.findAllPost();
        model.addAttribute("posts", posts);
        return "/admin/posts";

    }
}
