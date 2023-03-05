package pl.woelke.springblogwebapp.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.woelke.springblogwebapp.entity.PostEntity;

import java.util.Optional;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

    Optional<PostEntity> findByUrl(String url);
}
