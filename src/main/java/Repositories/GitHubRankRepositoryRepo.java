package Repositories;

import Entities.GitHubRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GitHubRankRepositoryRepo extends JpaRepository<GitHubRepository,Long>{
    List<GitHubRepository> findGitHubRepositoriesByIdIsNotNull();

}

