package com.example.crudrapido.repository;

import com.example.crudrapido.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*Un repositorio en spring es un mecanismo que encapsula, el almacenamiento, búsqueda y recuperación en una colección de
objetos, esto es una implementación la cual busca que las tareas repetitivas de mantenimiento en las colecciones de
datos se realicen de una forma más fácil, por eso Spring Data proporciona el uso de una interfaz la cual implementa
la mayoría de métodos para realizar, las operaciones más comunes de mantenimiento en los datos y así el desarrollador
se enfoque en la lógica del negocio y menos en dichas tareas.*/
/*La anotación Spring @Repository se utiliza para indicar que la clase proporciona el mecanismo para la operación de
 almacenamiento, recuperación, búsqueda, actualización y eliminación de objetos.*/

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
