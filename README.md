# 🚀 Ejercicio5MyApiGestor - API REST Backend

API REST desarrollada en **Java 21** con **Spring Boot 3.2.5** para la administración y gestión de proyectos, tareas y asignaciones de usuarios. Incluye integración continua con **Jenkins**, análisis estático de código con **SonarQube** y generación de reportes de cobertura de código con **JaCoCo**.

---

## 🛠️ Tecnologías y Herramientas

- **Lenguaje:** Java 21 (JDK 21)
- **Framework:** Spring Boot 3.2.5
- **Persistencia:** Spring Data JPA / Hibernate
- **Base de Datos:** MariaDB / MySQL (en contenedor Docker)
- **Pruebas Unitarias e Integración:** JUnit 5, Mockito
- **Cobertura de Código:** JaCoCo Maven Plugin (Objetivo: ≥80%)
- **Calidad y Seguridad:** SonarQube Scanner Plugin (v5.5.0.6356)
- **Gestión de Dependencias:** Maven (Surefire Plugin 3.2.5)
- **CI/CD:** Jenkins LTS Pipeline

---

## 📋 Endpoints Principales

| Método | Endpoint | Descripción | Body / Parámetros |
| :--- | :--- | :--- | :--- |
| `POST` | `/addProyecto` | Registra un nuevo proyecto | Payload JSON con datos del proyecto |
| `POST` | `/buscarProyectos` | Recupera la lista de proyectos registrados | N/A |
| `POST` | `/updateProyecto` | Actualiza un proyecto existente | Payload JSON con ID y campos modificados |
| `DELETE` | `/deleteProyecto` | Elimina un proyecto de la base de datos | Payload JSON / ID |

---

## ⚙️ Configuración del Entorno y Ejecución Local

### Requisitos Previos
- **Java 21** instalado y configurado en el PATH (`java -version`).
- **Maven 3.9+** instalado.
- **Docker Desktop** activo (para la base de datos MariaDB/MySQL).

### Pasos de Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/TU_USUARIO/Ejercicio5MyApiGestor.git](https://github.com/TU_USUARIO/Ejercicio5MyApiGestor.git)
   cd Ejercicio5MyApiGestor
