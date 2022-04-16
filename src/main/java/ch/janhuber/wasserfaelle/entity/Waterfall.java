package ch.janhuber.wasserfaelle.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Setter
@Getter
@Entity
public class Waterfall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "TEXT")
    String description;

    String title;

}
