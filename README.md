# WRM - Gestion des Files d'Attente

## Description

**WRM - Gestion des Files d'Attente** is a centralized system for managing waiting rooms in various organizations, such as medical practices, public services, or businesses. It handles visitor flow, organizes their reception according to different scheduling algorithms, and provides performance statistics like satisfaction rates and average wait times.

## Features

- **Dynamic Visitor Management**: Tracks the state of each visitor in the waiting room (e.g., WAITING, IN_PROGRESS, FINISHED, CANCELLED).
- **Scheduling Configuration**: Configures multiple scheduling algorithms:
    - FIFO (First In, First Out)
    - Priority-based (based on visitor type or urgency)
    - Shortest Job First (prioritizes shorter tasks)
- **Customizable Schedules & Capacity**: Configures maximum capacity per day of the week and sets service hours (e.g., continuous, morning, or afternoon).
- **Performance Statistics**: Generates performance metrics, such as satisfaction rates, average wait time, and visitor turnover.

## Technologies Used

- **Spring Boot** (Backend)
- **Spring Data JPA** (Database access)
- **MySQL** (Database)
- **Docker** (Containerization)
- **Docker Compose** (Multi-container orchestration)
- **Postman** (API testing)
- **ModelMapper/MapStruct** (DTO mapping)
- **JUnit & Integration Tests** (Testing)

