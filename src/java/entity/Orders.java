/*
Получание заказа на покупку
status прочтен/не прочтен
Запись имени пользователя
адерса
цены
status отправлен/не отправлен

*/
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Orders implements Serializable{
 @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
 private Long id;
 @OneToOne
 private Component component;
 @OneToOne
 private Person person;
}
