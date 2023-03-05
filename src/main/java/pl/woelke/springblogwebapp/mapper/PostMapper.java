package pl.woelke.springblogwebapp.mapper;

import pl.woelke.springblogwebapp.entity.PostEntity;
import pl.woelke.springblogwebapp.model.PostModel;

import java.util.logging.Logger;

public class PostMapper {

    private static final Logger LOGGER = Logger.getLogger(PostMapper.class.getName());

    public static PostModel mapEntityToModel(PostEntity postEntity) {

        LOGGER.info("mapEntityToModel" + postEntity);
        return PostModel.builder()
                .id(postEntity.getId())
                .title(postEntity.getTitle())
                .url((postEntity.getUrl()))
                .content(postEntity.getContent())
                .shortDescription(postEntity.getShortDescription())
                .createdOn(postEntity.getCreatedOn())
                .updatedOn(postEntity.getUpdatedOn())
                .build();

    }

    public static PostEntity mapModelToEntity(PostModel postModel) {
        LOGGER.info("mapModelToEntity" + postModel);
        return PostEntity.builder()
                .id(postModel.getId())
                .title(postModel.getTitle())
                .url(postModel.getUrl())
                .content(postModel.getContent())
                .shortDescription(postModel.getShortDescription())
                .createdOn(postModel.getCreatedOn())
                .updatedOn(postModel.getUpdatedOn())
                .build();
    }
}
