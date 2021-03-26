package ru.skillbox.blogengine.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.Instant;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isModerator;

    @CreationTimestamp
    private Instant regTime;

    private String name;

    private String email;

    private String password;

    private String code;

    private String photo;

    @OneToMany(mappedBy = "moderator")
    @JsonIgnore
    @ToString.Exclude
    private Set<Post> moderatedPosts;

    @OneToMany(mappedBy = "author")
    @JsonIgnore
    @ToString.Exclude
    private Set<Post> userPosts;

    @OneToMany(mappedBy = "author")
    @JsonIgnore
    @ToString.Exclude
    private List<PostVote> userVotes;
}
