package appl.Entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String gender;
    @Column
    private Date date_birth;

    public Client(int id, String name, String gender, Date date_birth) {
        this.id=id;
        this.name = name;
        this.gender = gender;
        this.date_birth = date_birth;
    }



    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateBirth() {
        return date_birth;
    }

    public void setDateBirth(Date date_birth) {
        this.date_birth = date_birth;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateBirth='" + date_birth + '\'' +
                '}';
    }
}
