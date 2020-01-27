/*
Компоненты
type - тип компонента (камень/видеокарта/БП и т.п.)
nameComponents название компонента
description - описание компонента
company - компания (nvidia/amd/asus/be quiet и т.п.
price - цена
 */
package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pupil
 */
@Entity
public class Component implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic()
    @Column()
    private String type;
    private String nameComponents;
    private String description;
    private String company;
    private int price;
    private int quantity;
    public Component(){}

    public Component(String type, String nameComponents, String description, String company, int price, int quantity) {
        this.type = type;
        this.nameComponents = nameComponents;
        this.description = description;
        this.company = company;
        this.price = price;
        this.quantity = quantity;
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

    public String getNameComponents() {
        return nameComponents;
    }

    public void setNameComponents(String nameComponents) {
        this.nameComponents = nameComponents;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.type);
        hash = 23 * hash + Objects.hashCode(this.nameComponents);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.company);
        hash = 23 * hash + this.price;
        hash = 23 * hash + this.quantity;
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
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.nameComponents, other.nameComponents)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
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
        return "Component{" + "id=" + id + 
                ", type=" + type + 
                ", nameComponents=" + nameComponents + 
                ", description=" + description + 
                ", company=" + company + 
                ", price=" + price + 
                ", quantity=" + quantity + 
                '}';
    }
    
}