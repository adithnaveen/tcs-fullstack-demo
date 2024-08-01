# tcs-fullstack-demo


# Problem Statement – Food Delivery

In India, metro cities in particular, it is known that people like eating at restaurants and ordering food that can be delivered at the comfort of their home or work place. Many times people end up ordering food from restaurants that have delivery services. The drive of this problem statement  here is to come up with the solution for people to  order food online and get delivery services.

You need to explore the  feasibility of solving the given problem through the implementation of building the endpoints for the application which is planned to build that will allow for users to view food online from using the web-app. 




## Technology List 

| Type | 	Name | 
|------|----------|
| Backend  | SpringBoot/.Net Core/Python | 
| Frontend | Angular/reactjs/vue |
| Cloud | AWS/Azure/GCP/etcd |
| Architecture | Microservices | 





## Port Numbers

| Service Name         | Port Number    |
|----------------------|----------------|
| MS1                  | 8100-8105      |
| MS2                  | 8200-8205      |
| Eureka               | 8761           |
| API Gateway          | 8765           |
| MySQL                | 3306           |
| MongoDB              | 27017          |
| Angular Application  | 4200           |



## Scope of work – Backend
The application shall Registration, Login, and showing Food items when user logs in to the system, the user should have a proper authentication and authorization system. 

Given backend & the end points to be built:




| Method | End Point            | Description + Payload |
|--------|----------------------|-----------------------|
| POST   | /api/register        | **To register the user with basic details:**<br>**Input:**<br>{<br>email: String,<br>name: String<br>password: String<br>address: {<br>houseno: Number,<br>street: String,<br>city: String,<br>state: String,<br>zip: Number<br>}<br>}<br>**Return code:** 201<br>**Return:**<br> {<br>id: Number,<br>name: String,<br>email: String,<br>password: String<br>address: {<br>houseno: Number,<br>street: String,<br>city: String,<br>state: String,<br>zip: Number<br>}<br>} <br>**Description:** The endpoint shall save the user record to the DBMS (MySQL), and as an acknowledgment, the actual object is returned (JSON).<br>**DBMS:** MySQL |
| POST   | /api/authenticate    | **To validate the user is registered in the system:**<br>**Input:**<br> {<br>email: String,<br>password: String<br>} <br>**Return:** "JWT Token"<br>**Return Code:** 200<br>**When user details are wrong Return Code:** 403 (Forbidden) |