package com.vega.springgit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Link extends Auditable{
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

    // link may have many comments
    @OneToMany(mappedBy = "Link")
    private List<Comment> comments = new ArrayList<>();


}
