package Services;

import Entities.GitHubRepository;
import Repositories.GitHubRankRepositoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GitHubRepositoryService {
    @Autowired
    private GitHubRankRepositoryRepo gitHubRankRepositoryRepo;


    public List<GitHubRepository> getAllGitHubRepositories() {
        return gitHubRankRepositoryRepo.findGitHubRepositoriesByIdIsNotNull();
    }
}
