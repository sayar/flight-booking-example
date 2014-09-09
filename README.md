# Flight booking system

This case study concerns a simplified flight booking system for a travel
agency. A travel agency has asked you to design a flight booking system.
The interviews with domain experts resulted in the following
information.

1. Airline companies offer various flights.

2. A flight is open to booking and closed again by order of the company.

3. A customer can book one or more flights and for different passengers.

4. A booking concerns a single flight and a single passenger.

5. A booking can be cancelled or confirmed.

6. A flight has a departure airport and an arrival airport.

7. A flight has a departure day and time, and an arrival day and time.

8. A flight may involve stopovers in airports.

9. A stopover has an arrival time and a departure time.

10. Each airport serves one or more cities.

Construct a UML class diagram for this model.

* * *

The code presented here corresponds to the UML diagram discussed in class. The
project is split into two modules (or packages): one handles flight information
and the other handles booking information. 

The code also contains independent unit tests for each package, integration
tests for the combined system, and system tests for testing the complete
product.
