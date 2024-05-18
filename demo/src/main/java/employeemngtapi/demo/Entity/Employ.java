package employeemngtapi.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Employ_tbl")
@NoArgsConstructor
@AllArgsConstructor
public class Employ {
    @Id

    @Column(name = "ID")
    @GeneratedValue
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "POST")
    private String post;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CONTACT")
    private int contact;

    @Column(name = "EMAIL")
    private String email;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPost() {
        return post;
    }

    public String getAddress() {
        return address;
    }

    public int getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

}
