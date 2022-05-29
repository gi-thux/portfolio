package com.portfolio.sunny.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity(name="personal_info")
@Table
public class PersonalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    @Setter
    @Getter
    @NotEmpty
    private String name;
    @Column
    @Setter
    @Getter
    @NotEmpty
    private int age;
    @Column(length=1000)
    @Setter
    @Getter
    @NotEmpty
    private String address;
    @Column
    @Setter
    @Getter
    @NotEmpty
    private String email;
    @Column()
    @Setter
    @Getter
    @NotEmpty
    private String phoneno;
    //private String resume;
    @Column
    @Setter
    @Getter
    @NotEmpty
    private String description;
    /*@Column
    @Setter
    private Another another   ;*/
}
