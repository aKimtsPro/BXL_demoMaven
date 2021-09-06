package bxl.formation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "section")
@Entity
public class Section {

    @Id
    @Column(name = "section_id")
    private int id;

    @Column(name = "section_name")
    private String name;

    @Column(name = "delegate_id")
    private int delegateId;

    public Section() {
    }

    public Section(int id, String name, int delegateId) {
        this.id = id;
        this.name = name;
        this.delegateId = delegateId;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", delegateId=" + delegateId +
                '}';
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

    public int getDelegateId() {
        return delegateId;
    }

    public void setDelegateId(int delegateId) {
        this.delegateId = delegateId;
    }
}
