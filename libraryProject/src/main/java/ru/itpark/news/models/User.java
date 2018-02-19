package ru.itpark.news.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "news_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String surname;
  private String email;

  private String hashPassword;

  private LocalDateTime registrationTime;

  private String confirmCode;
  private LocalDateTime expiredDate;


  @Enumerated(value = EnumType.STRING)
  private State state;

  @Enumerated(value = EnumType.STRING)
  private Role role;
//  @OneToMany(mappedBy = "user")
//  List<Book> books;

}
