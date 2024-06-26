package com.springboot.blog.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(
        name = "posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class Post {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "content", nullable = false)
    private String content;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Comment> comment = new HashSet<>();
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
<<<<<<< HEAD
>>>>>>> 5f653ff (update with JWT function)
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
}
