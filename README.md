# 🎓 Student Course Management System

A Spring Boot application for managing **Students, Courses, and Enrollments** with basic **Spring Security** authentication.  
Future enhancements include **Role-Based Access Control (RBAC)** with **JWT authentication**.

---

## 🚀 Features
- Add and manage **Students**
- Add and manage **Courses**
- Enroll students into courses
- Track **enrollment date** and **status**
- Basic authentication with **Spring Security**
- PostgreSQL database integration

---

## 🛠️ Tech Stack
- **Backend**: Spring Boot (Java 17+)
- **Database**: PostgreSQL
- **Security**: Spring Security (JWT planned)
- **Build Tool**: Maven
- **IDE**: IntelliJ IDEA Community

---

## 📂 Project Structure
```

student-course-management/
┣ src/main/java/com/example/project
┃ ┣ controller/     # REST APIs
┃ ┣ dto/            # Data Transfer Objects
┃ ┣ entity/         # JPA Entities
┃ ┣ repository/     # Spring Data JPA Repositories
┃ ┣ service/        # Business Logic
┃ ┗ config/         # Security Config
┣ src/main/resources
┃ ┣ application.properties  # DB & App Config
┗ pom.xml           # Maven dependencies

````

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository
```bash
git clone https://github.com/<your-username>/student-course-management.git
cd student-course-management
````

### 2️⃣ Configure PostgreSQL

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/studentdb
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3️⃣ Build & Run the project

```bash
mvn spring-boot:run
```

Application runs on 👉 [http://localhost:8080](http://localhost:8080)

---

## 🔑 API Endpoints

### Students

* `POST /students` → Add a student
* `GET /students` → Get all students

### Courses

* `POST /courses` → Add a course
* `GET /courses` → Get all courses

### Enrollments

* `POST /enrollments` → Enroll a student
* `GET /enrollments` → Get all enrollments

---

## 🔮 Future Improvements

* [ ] Implement **JWT Authentication**
* [ ] Role-Based Access Control (**Admin / Student / Mentor**)
* [ ] Swagger API Documentation
* [ ] Dockerize Application
* [ ] CI/CD pipeline with GitHub Actions

---

## 🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss.

---

## 📜 License

This project is licensed under the MIT License.

```
