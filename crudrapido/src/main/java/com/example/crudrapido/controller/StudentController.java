package com.example.crudrapido.controller;

import com.example.crudrapido.entity.Student;
import com.example.crudrapido.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*
  En Spring Boot, "@RestController" es una anotación que se utiliza para marcar una clase como un controlador REST.
Un controlador REST es un componente de una aplicación web que maneja las solicitudes HTTP entrantes y devuelve las
respuestas HTTP correspondientes.
  Cuando se utiliza la anotación "@RestController", todos los métodos de la clase se consideran
de forma predeterminada como métodos que devuelven datos en formato JSON o XML. La anotación "@ResponseBody" se
aplica automáticamente a cada método de la clase, por lo que no es necesario anotar cada método individualmente.
  La anotación "@RestController" también proporciona la capacidad de manejar automáticamente los
errores y excepciones, y es compatible con la anotación "@RequestMapping"
para permitir la asignación de rutas URL a los métodos del controlador.
  En resumen, la anotación "@RestController" en Spring Boot se utiliza para marcar una clase
como un controlador REST. La anotación combina la funcionalidad de las anotaciones "@Controller" y
"@ResponseBody" y permite que los métodos de la clase devuelvan datos en formato JSON o XML.
También proporciona la capacidad de manejar automáticamente los errores y excepciones y
es compatible con la anotación "@RequestMapping".
*/
@RestController


@RequestMapping(path = "api/v1/students")
/*En Spring Boot, "@RequestMapping" es una anotación que se utiliza para
asignar una URL a un método de controlador específico. Es una anotación
muy útil para definir la ruta de acceso para las solicitudes HTTP
y mapear los métodos del controlador que procesan las solicitudes.*/

public class StudentController {

    @Autowired
    private StudentService studentService;

    /*La anotación "@GetMapping" en Spring Boot se utiliza para asignar una URL a un método
de controlador específico que maneja las solicitudes HTTP GET. La anotación es una variante
más específica de la anotación "@RequestMapping" que se utiliza cuando se desea definir una
ruta de acceso para una solicitud GET específica. La anotación puede ser utilizada a nivel de
clase y de método, y permite definir una ruta de acceso específica para una solicitud GET.*/
    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getBId(@PathVariable("/{studentId}") Long studentId){
        return studentService.getStudent(studentId);
    }

    /*En resumen, la anotación "@PostMapping" en Spring Boot se utiliza para asignar una URL a
    un método de controlador específico que maneja las solicitudes HTTP POST. La anotación es una
    variante más específica de la anotación "@RequestMapping" que se utiliza cuando se desea definir
    una ruta de acceso para una solicitud POST específica. La anotación puede ser utilizada a nivel de
    clase y de método, y permite definir una ruta de acceso específica para una solicitud POST.*/
    @PostMapping
    public void saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student);
    }

    /*En resumen, la anotación "@DeleteMapping" en Spring Boot se utiliza para
asignar una URL a un método de controlador específico que maneja las solicitudes
HTTP DELETE. La anotación es una variante más específica de la anotación
"@RequestMapping" que se utiliza cuando se desea definir una ruta de acceso para
una solicitud DELETE específica. La anotación puede ser utilizada a nivel de clase
y de método, y permite definir una ruta de acceso específica para una solicitud DELETE.*/
    @DeleteMapping("/{studentId}")
    public void delete(@PathVariable("{studentId}") Long studentId){
        studentService.delete(studentId);
    }


}
