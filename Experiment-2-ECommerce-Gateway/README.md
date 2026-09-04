# SOA Experiment 2 - E-Commerce API Gateway and Load Balancing

## Objective

To implement an E-Commerce system using Service-Oriented Architecture (SOA) with an API Gateway for routing and load balancing.

## Services

### Product Service

- Instance 1: Port 8081
- Instance 2: Port 8083
- Endpoint: GET /products
- Manages product information.
- Multiple instances are used to demonstrate load balancing.

### Cart Service

- Port: 8082
- Endpoint: GET /cart
- Manages shopping cart information.

### API Gateway

- Port: 8080
- Acts as a single entry point for client requests.
- Routes requests to Product Service and Cart Service.
- Uses Spring Cloud LoadBalancer for Product Service.

## Architecture

```text
                         Client
                           |
                           ↓
                  API Gateway :8080
                    /           \
                   ↓             ↓
          Product Service      Cart Service
             :8081/:8083          :8082
                  ↑
                  |
            Load Balancing
            Technologies
Java
Spring Boot
Spring Cloud Gateway
Spring Cloud LoadBalancer
REST API
Maven
JSON
GitHub
API Gateway Routing
Product Service

Gateway URL:

http://localhost:8080/products

The Gateway routes the request to:

Product Service Instance 1 → 8081
Product Service Instance 2 → 8083

Load-balanced URI:

lb://product-service
Cart Service

Gateway URL:

http://localhost:8080/cart

Routes to:

http://localhost:8082
Product Service Output
[
  {
    "id": 1,
    "name": "Laptop",
    "price": 55000
  },
  {
    "id": 2,
    "name": "Mobile Phone",
    "price": 25000
  },
  {
    "id": 3,
    "name": "Headphones",
    "price": 2000
  }
]
Cart Service Output
[
  {
    "id": 1,
    "productId": 101,
    "quantity": 2
  },
  {
    "id": 2,
    "productId": 102,
    "quantity": 1
  },
  {
    "id": 3,
    "productId": 103,
    "quantity": 3
  }
]
Testing
Product Service Direct Access
http://localhost:8081/products
http://localhost:8083/products
Cart Service Direct Access
http://localhost:8082/cart
API Gateway Access
http://localhost:8080/products
http://localhost:8080/cart
Load Balancing

Two Product Service instances are running:

Product Service Instance 1 → Port 8081
Product Service Instance 2 → Port 8083

The API Gateway uses Spring Cloud LoadBalancer to distribute requests between the available Product Service instances.

Conclusion

The E-Commerce SOA system was successfully implemented using Product Service, Cart Service, and API Gateway. The API Gateway provides a single entry point, performs service routing, and supports load balancing between multiple Product Service instances 