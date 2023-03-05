package pl.woelke.springblogwebapp.service.Impl;

import org.springframework.stereotype.Service;
import pl.woelke.springblogwebapp.entity.PostEntity;
import pl.woelke.springblogwebapp.mapper.PostMapper;
import pl.woelke.springblogwebapp.model.PostModel;
import pl.woelke.springblogwebapp.respository.PostRepository;
import pl.woelke.springblogwebapp.service.PostService;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private static final Logger LOGGER = Logger.getLogger(PostServiceImpl.class.getName());

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostModel> findAllPost() {
        LOGGER.info("findAllPost()");
        List<PostEntity> postEntities = postRepository.findAll();
        List<PostModel> postModels = postEntities.stream()
                .map(PostMapper::mapEntityToModel)
                .collect(Collectors.toList());
        LOGGER.info("findAllPost(...)");
        return postModels;

    }
}
