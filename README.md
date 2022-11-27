#### 1. Tech-Stack

###### Backend
###### Frontend
- ES6
- React 18.2
- npm 8.5.5
- HTML 5
- CSS

#### 2. Running the application

Navigate into /client and run `npm install` to install dependencies.<br> To run the client, execute `npm start` in /client.

#### 3. Using the application

When no message is set, the monitor's background will indicate an ok-status with a green background.
![statusok](https://i.imgur.com/SrFZtuj.png)

To set a message, an admin can make post request to /post/<message> with the current status message. Client-side this is also indicated with a red background.
http://localhost:8080/post/<message>
![statusnotok](https://i.imgur.com/CKWFpBu.png)

To reset the status message, an admin can make a post request to /reset
http://localhost:8080/reset

![statusok](https://i.imgur.com/stCAgAD.png)


