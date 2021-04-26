# Spring Boot, MongoDB and Kafka Basic Setup

## Dependencies
- Mongodb
- Kakfa


## Configurations (application.properties)
spring.data.mongodb.uri=mongodb://localhost:27017/clients

## Setup:
- Run monogdb and update the connection string under application.properties
- Setup and have kafka running at: localhost:9092 and create a topic 'clients'
- Import project into a suitable ide and run as "Java Application"
- API will run on http://localhost:8080

TODO:
- Fix validation of data on creating a client using POST API call
- Make KAFKA connection and topic configurable.
- Break down the address field into sub fields e.g. AddressLine1, City, Province, Postal Code, Country etc.




