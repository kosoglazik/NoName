/*
Компоненты
type - тип компонента (камень/видеокарта/БП и т.п.)
nameComponents название компонента
description - описание компонента
company - компания (nvidia/amd/asus/be quiet и т.п.
price - цена
 */
package entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pupil
 */
public class Component {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic()
    @Column()
    private String type;
    private String nameComponents;
    private String descripton;
    private String company;
    private int price;
    public Component(){}

    public Component(Long id, String type, String namecomponents, String descripton, String company, int price) {
        this.id = id;
        this.type = type;
        this.nameComponents = namecomponents;
        this.descripton = descripton;
        this.company = company;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNamecomponents() {
        return nameComponents;
    }

    public void setNamecomponents(String namecomponents) {
        this.nameComponents = namecomponents;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + Objects.hashCode(this.nameComponents);
        hash = 97 * hash + Objects.hashCode(this.descripton);
        hash = 97 * hash + Objects.hashCode(this.company);
        hash = 97 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Component other = (Component) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.nameComponents, other.nameComponents)) {
            return false;
        }
        if (!Objects.equals(this.descripton, other.descripton)) {
            return false;
        }
        if (!Objects.equals(this.company, other.company)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Components{" + "id=" + id + ", type=" + type + ", namecomponents=" + nameComponents + ", descripton=" + descripton + ", company=" + company + ", price=" + price + '}';
    }
    
}
