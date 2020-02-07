package guru.springframework.springmvcrest.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="first_name")
    private String first_name;
    @Column(name="last_name")
    private String last_name;

}
