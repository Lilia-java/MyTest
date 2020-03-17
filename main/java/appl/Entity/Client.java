package appl.Entity;


import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String gender;
    @Column
    private String dateBirth;

    public Client(int id, String name, String gender, String dateBirth) {
        this.id=id;
        this.name = name;
        this.gender = gender;
        this.dateBirth = dateBirth;
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

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }
}
