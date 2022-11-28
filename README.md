#### 1. Used tech stack

###### 1.1 Backend
- Java 17
- Spring Boot 2.7.5
###### 1.2 Frontend
- ES6
- React 18.2
- npm 8.5.5
- HTML 5
- CSS

#### 2. Running the application

###### 2.1 Backend
<br>Open the java project that is located in the directory /server. After maven downloads the necessary dependencies the maven SLM-options are available and can be used. To run the server execute the maven option "install" and then run the application.
<br>Default port: 8080

###### 2.2 Frontend
Navigate into /client and run `npm install` to install dependencies. To run the client, run `npm run dev`.
<br>Default port: 5173

#### 3. Using the application

When no message is set, the monitor's background will indicate an ok-status with a green background.
<img src="https://i.imgur.com/nu1MesM.png" alt="statusok" width="600"/>

To set a message, an admin can make a post request to /post/<message> with the current status message. Client-side this is indicated with a red background.
http://localhost:8080/post/<message>
  
<img src="https://i.imgur.com/CKWFpBu.png" alt="statusnotok" width="600"/>

To reset the status message, an admin can make a post request to /reset
http://localhost:8080/reset

<img src="https://i.imgur.com/stCAgAD.png" alt="statusok" width="600"/>


