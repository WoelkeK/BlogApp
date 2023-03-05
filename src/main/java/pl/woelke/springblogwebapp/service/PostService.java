package pl.woelke.springblogwebapp.service;

import pl.woelke.springblogwebapp.model.PostModel;

import java.util.List;

public interface PostService {

    List<PostModel>findAllPost();
}
