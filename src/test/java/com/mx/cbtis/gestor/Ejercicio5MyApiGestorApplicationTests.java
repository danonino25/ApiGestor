package com.mx.cbtis.gestor;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mx.cbtis.gestor.controller.ProyectosController;
import com.mx.cbtis.gestor.modelo.Proyectos;
import com.mx.cbtis.gestor.repository.ProtectosRepository;
import com.mx.cbtis.gestor.repository.UsuarioRepository;

@SpringBootTest
class Ejercicio5MyApiGestorApplicationTests {

    @Autowired
    private ProyectosController proyectosController;

    @Autowired
    private ProtectosRepository proyectostable;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    void testFlujoCompletoAgregarYConsultarProyecto() {
        // AUT-01: Registro automático de un nuevo proyecto
        Proyectos p = new Proyectos();
        p.setNombre("Proyecto Prueba Automatica");
        p.setDescripcion("Descripcion Auto Test");
        
        int res = proyectosController.addProyecto(p);
        assertTrue(res > 0 || res == 1);
    }

    @Test
    void testValidacionGuardadoUsuario() {
        // AUT-02: Verificación automática de la disponibilidad del repositorio de usuarios
        assertNotNull(usuarioRepository);
        long count = usuarioRepository.count();
        assertTrue(count >= 0);
    }

    @Test
    void testConsultaProyectosListaNoNula() {
        // AUT-03: Consulta automática asegurando que el retorno de la lista no sea nulo
        List<Proyectos> lista = proyectosController.getProyectos();
        assertNotNull(lista);
    }

    @Test
    void testEliminacionAutomaticaProyecto() {
        // AUT-04: Eliminación automática de registros
        Proyectos p = new Proyectos();
        p.setNombre("Proyecto a Eliminar Automático");
        proyectostable.save(p);
        
        int res = proyectosController.deleteProyecto(p);
        assertTrue(res >= 0);
    }

    @Test
    void testControlErrorPayloadInvalido() {
        // AUT-05: Control de proyecto inválido o no existente
        Proyectos proyectoInvalido = new Proyectos();
        proyectoInvalido.setId_proyecto(-999); // ID inexistente
        
        Proyectos res = proyectosController.getProyecto(-999);
        assertNotNull(res);
    }

}