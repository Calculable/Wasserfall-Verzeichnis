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
    Long id;

    String waterfall_name;

    Long osm_id;

    Float height_meters;

    Boolean intermittent;

    String wikidata_tag;

    Double lat;

    Double lon;

    String name_german;

    String name_english;

    String name_french;

    String name_italian;

    String name_swiss_german;

    String imageurl;

}
