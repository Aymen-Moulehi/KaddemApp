# KaddemApp
This project is a demonstration of the capabilities of the Spring Boot framework. It is a simple web application that utilizes various features such as dependency injection, data access, and web development. The project also includes examples of integrating with a database and implementing security. It serves as a great starting point for learning the basics of Spring Boot and developing web applications with the framework.
## Project entities

**Etudiant**
* idEtudiant (type: Long)
* nomEtudiant (type: String)
* prenomEtudiant (type: String)
* option (type: Enumeration)

**Contrat**
* idContrat (type: Integer)
* dateDebtutContrat (type: Date)
* dateFinContrat (type: Date)
* specialite (type: Enumeration)
* archive (type: Boolean)
* montantContrat (type: Integer)

**Department**
* idDepartment (type: Integer)
* nomDepartment (type: String)

**Equipe**
* idEquipe (type: Integer)
* nomEquipe (type: String)
* niveau (type: Enumeration)

**DetailEquipe**
* idDetailEquipe (type: Integer)
* salle (type: Integer)
* thematique (type: String)

**Universite**
* idUniversite (type: Integer)
* nomUniversite (type: String)
