package ru.itpark.news.models;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameBook;
    private String autorBook;
    private String gerne;
    private int ageExit;
    private String descriptionBook;
    private String storageName;
    private String originalName;
    @Column(name = "size")
    private long size;
    private String type;
    private String url;
//    @ManyToOne
//    @JoinColumn(name = "users_id")
//    private User user;
}
