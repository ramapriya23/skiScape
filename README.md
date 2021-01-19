# SkiScape
SkiScape is an application that calculates ski sizes based on user height, age and he type of ski. SkiScape also suggests products from website based on the ski size calculated.

## Objectives : 
- A Client and Server Interaction
- Make Calculations based on user input on the backend
- Render results on the frontEnd
- Focus on providing a satisfying user experience

## Tech Stack Used :
- Angular 9
- Springboot with Java 13

## Using the System :
- run `mvn install` from project directory to install dependencies
- run `mvn spring-boot:run`  to run the backend 
- The API can be tested from browser or POSTMAN
- The frontend is built by runing the below command in the `\angularclient` directory\
`npm install`
- To render the front end execute \
`npm start`

## Goals Achieved :
- Built frontend and Backend
- Api accessible from `localhost:8080/api/skiLength` which accepts JSON format as below :\

  `{
"height": 100, 
"age": 7, 
"type": "FRISTIL"
}
`
- The rest API is however facing problems when being connected from frontend
- Tried to tune the frontend as much as possbile in the given time frame
- The suggested products are from a 3rd party website just used to give a rough idea of how it would seem if the page had its own products. 
- Added few backend end Unit tests
