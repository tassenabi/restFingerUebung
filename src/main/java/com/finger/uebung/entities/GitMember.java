package com.finger.uebung.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class GitMember implements Serializable {

    private long id;
    //login -> UserName
    private String login;
    private String url; //--> hier steckt das Feld "name" (https://api.github.com/users/0x4a616e)
    private String repos_url; //-> https://api.github.com/users/0x4a616e/repos


    @JsonIgnoreProperties
    private List<GitMemberRepo> repositories;

}
