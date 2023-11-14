package uk.ng85.modules.persistence.jpa.test.model.entity;

import jakarta.persistence.*;
import lombok.*;
import uk.ng85.modules.persistence.api.model.entity.GenericEntity;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee implements GenericEntity<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

}