# Hotel Service 🏨

Welcome to the Hotel Service! This microservice manages hotel-related operations, allowing you to create, retrieve, update, and delete hotel information.

## Quick Start 🚀

1. **Clone Repository:**
   ```bash
   git clone https://github.com/yourusername/hotelservice.git

2. **Database Configuration:**
  - Update the `application.properties` file with your database credentials.
  - Specify the database URL, username, and password.
    ```bash
    # Database Configuration
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
    spring.datasource.username=your_database_username
    spring.datasource.password=your_database_password

3. **Run Hotel Service:**
   ```bash
   cd hotelservice
   ./mvnw clean package
    java -jar target/hotelservice-1.0.0.jar

4. **Access Hotel Service:**
   - Visit http://localhost:8082/hotels to interact with the Hotel Service.

## API Endpoints 🛣️

### Create Hotel 🏨

  - **Endpoint:**
    ```bash
    POST http://localhost:8082/hotels

  - **Request Body:**
    ```bash
    {
      "name": "Hotel Name",
      "location": "Hotel Location",
      "about": "Hotel Description"
    }

### Get Hotel by ID 🔍

  - **Endpoint:**
    ```bash
    GET http://localhost:8082/hotels/{hotelId}

  - **Response:**
    ```bash
    {
      "hotelId": "uniqueHotelId",
      "name": "Hotel Name",
      "location": "Hotel Location",
      "about": "Hotel Description"
    }

### Get All Hotels 🏨

  - **Endpoint:**
    ```bash
    GET http://localhost:8082/hotels

  - **Response:**
    ```bash
    [
      {
        "hotelId": "uniqueHotelId1",
        "name": "Hotel Name 1",
        "location": "Hotel Location 1",
        "about": "Hotel Description 1"
      },
      // ... (other hotels)
    ]

### Delete Hotel 🗑️

  - **Endpoint:**
    ```bash
    DELETE http://localhost:8082/hotels/{hotelId}

  - **Response:**
    ```bash
    {
      "hotelId": "deletedHotelId",
      "name": "Deleted Hotel",
      "location": "Deleted Location",
      "about": "Hotel Description"
    }


### Update Hotel 🔄

  - **Endpoint:**
    ```bash
    PUT http://localhost:8082/hotels/{hotelId}

  - **Request Body:**
    ```bash
    {
      "hotelId": "uniqueHotelId",
      "name": "Updated Hotel Name",
      "location": "Updated Hotel Location",
      "about": "Updated Hotel Description"
    }

  - **Response:**
    ```bash
    {
      "hotelId": "uniqueHotelId",
      "name": "Updated Hotel Name",
      "location": "Updated Hotel Location",
      "about": "Updated Hotel Description"
    }
