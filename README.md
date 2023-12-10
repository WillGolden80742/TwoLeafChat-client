
# Java Chat Client

This is a Java swing based chat client application connected to a MySQL database. 

## Overview

The chat client allows users to:

- Register a new account 
- Login 
- View a list of online contacts
- Start a chat conversation with any online contact
- Send text messages
- Send file attachments like images, audio etc.
- Receive messages and files 
- Delete sent messages
- Change name and profile picture

The application connects to a MySQL database that stores user accounts, contacts, chat messages, attachments etc.

## Key Features

- Secure login using hashed passwords
- Real time messaging with contacts 
- Send multimedia files as attachments
- Message history loaded from database
- Message notification system
- Profile picture support
- Light and dark theme
- Desktop notifications 

## Technologies Used

**Client**

- Java 8
- Java Swing for UI
- Socket programming for network communication

**Server**

- MySQL
- Stored procedures for db operations

## Getting Started 

### Prerequisites

- JDK 8+ 
- MySQL

### Installation

1. Import the SQL dump to create the database schema
2. Configure the db connection settings
3. Compile and run the Java client 

The chat server process also needs to be running.

## Usage 

- Create a user account  
- Login using registered credentials
- Search and add contacts
- Select any online contact to start chat

## Future Work

Some ideas to extend the project:

- Group conversations
- Audio/Video calling 
- Mobile client 
- Message encryption
