# 🚗  Car Booking System

## 📘 Project Overview
This is a **Java-based car booking system** that demonstrates Object-Oriented Programming (OOP) principles such as **abstraction**, **inheritance**, **encapsulation**, and **polymorphism**.  
The system allows passengers (subscribed or non-subscribed) to reserve a car, check seat availability, and calculate trip costs with or without discounts.

---

## 🧩 Features
- **Passenger Types**
  - **Subscribed Passengers** receive a 50% discount on the trip cost.
  - **Non-Subscribed Passengers** pay the full trip price.
- **Car Seat Availability**
  - Each car has a `maxCapacity`, which decreases automatically when a seat is booked.
- **Dynamic Route Information**
  - Each car is associated with a route containing start and end destinations and a trip price.
- **User Interaction**
  - The system collects user input (name, ID, subscription status) and provides personalized output.

---

## 🏗️ Object-Oriented Design
The system consists of the following main classes:

| Class | Description |
|--------|--------------|
| **Passenger (Abstract)** | Base class that defines shared passenger attributes and abstract methods. |
| **Subscribes** | Subclass representing subscribed passengers (50% discount). |
| **NonSubscribers** | Subclass representing non-subscribed passengers (full price). |
| **Car** | Represents a car with a route, code, and seat capacity. Includes seat availability check. |
| **Route** | Defines trip details such as start and end addresses and trip cost. |
| **Main** | Contains the main method that runs the booking system and interacts with the user. |



