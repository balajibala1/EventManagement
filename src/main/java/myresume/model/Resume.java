package myresume.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Resume {
    @Id
    private int resume_id;
    private String name;
    private String education;
    private String skills;
    private String years_of_experience;
    private String languages;
    private String address;
    private String email_id;
    private String phone_number;
}
