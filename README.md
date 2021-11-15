1. **App description**

This is an employee data management application, according to the requirements and functionality requested, this system has two roles, the first is the user and the second is the admin, the user can only view data and edit the number section, the admin has all access as follows: view data, add data, delete data, and change data, all logged in users can enter the employee data page according to the authentication mentioned above.

This application is made using the java programming language using the spring framework, as for the reason I use spring is, spring has an MVC architecture so that it is easier to write code, has object relational mapping so there is no need to write SQL syntax and replaced by creating a model that defines entities, tables, and their fields, creating a route in spring is easier.

2. **User Database Design**

![user erd](https://user-images.githubusercontent.com/60879876/141705307-6995a95b-dc32-4fa6-a8ea-3ad3ae924123.PNG)


3. **Tools**

    a. Visual Studio Code
    b. h2 Console
  
4. **Build and Deployment**

    a. Activate h2 console
    
    b. Add datasource url to connect database
    
    c. Run java main class
    
    d. Test API with Postman on localhost://8080
    

After testing the API in postman and all the functions are working fine, I created a simple view for the API implementation

**Login Page**

![login spring](https://user-images.githubusercontent.com/60879876/141715869-ef809263-e13f-4d5e-916e-5930ed4c05d5.PNG)

**Login as a User**

![login as a user](https://user-images.githubusercontent.com/60879876/141715915-4a397f9c-1ca6-4630-8270-d29b89c38d6d.PNG)

**Edit as a User**

![edit as a user](https://user-images.githubusercontent.com/60879876/141715976-cbf5b561-d580-4a38-983c-0f6573af9f52.PNG)

**Login as a Admin**

![login as a admin](https://user-images.githubusercontent.com/60879876/141715991-da5a4541-1046-4871-a442-4551aa725c18.PNG)

**Edit as a Admin**

![edit as admin](https://user-images.githubusercontent.com/60879876/141716228-7ed1329c-5f43-4f7e-a41d-2c7b0b02894d.PNG)


