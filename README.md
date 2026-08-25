# SOA Experiment 1 - Food Delivery System

## Objective

To implement a Food Delivery system using Service-Oriented Architecture (SOA).

## Services

### Restaurant Service
- Port: 8081
- Endpoint: GET /restaurants
- Manages restaurant information.

### Order Service
- Port: 8082
- Endpoint: POST /orders
- Handles customer orders.

## Technologies

- Java
- Spring Boot
- REST API
- Maven
- JSON
- GitHub

## Restaurant Service Output

```json
[
  {
    "id": 1,
    "name": "Paradise Restaurant",
    "location": "Vijayawada"
  },
  {
    "id": 2,
    "name": "Bawarchi Restaurant",
    "location": "Hyderabad"
  },
  {
    "id": 3,
    "name": "Mehfil Restaurant",
    "location": "Guntur"
  }
]

Order Service

Request:

{
  "userId": 101,
  "restaurantId": 1,
  "items": [
    "Biryani",
    "Chicken 65"
  ]
}

Response:

Order placed successfully for User ID: 101, Restaurant ID: 1, Items: [Biryani, Chicken 65]
Conclusion

The Food Delivery SOA system was successfully implemented using independent Restaurant and Order services.

