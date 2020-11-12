package Entities;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class GitHubRepository {
    @NumberFormat
    private Long id;

    private String name;

    @OneToMany() @Nullable
    private User repoOwnerUser;

    @OneToMany @Nullable
    private Organization repoOwnerOrganisation;

    private List<User> contributors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Nullable
    public User getRepoOwnerUser() {
        return repoOwnerUser;
    }

    public void setRepoOwnerUser(@Nullable User repoOwnerUser) {
        this.repoOwnerUser = repoOwnerUser;
    }

    @Nullable
    public Organization getRepoOwnerOrganisation() {
        return repoOwnerOrganisation;
    }

    public void setRepoOwnerOrganisation(@Nullable Organization repoOwnerOrganisation) {
        this.repoOwnerOrganisation = repoOwnerOrganisation;
    }

    public List<User> getContributors() {
        return contributors;
    }

    public void setContributors(List<User> contributors) {
        this.contributors = contributors;
    }
}
