
## Api Specs

### Server http://furiouscyclists.in

#### Register User

url : /api/auth/register

requestData

```
{
  "userName":"vishnu667",
  "password":"password",
  "name":"Vishnu Prasad",
  "email":"vishnu667@gmail.com",
  "city":"Bangalore"
}
```

Response Data

```
{
  "status": "ok",
  "message": "Registration successful"
}
```

#### Login

url : /api/auth/login

requestData 

```
{
  "userName":"vishnu667",  // either the userName or the email
  "email":"vishnu667@gmail.com", //
  "password":"password"
  
}
```

Response

```
{
  "status": "ok",
  "message": "Login successful"
}
```


#### Logout

url : /api/auth/logout


#### Register Entry 

url /api/entry/register

requestData

```
{
"vehicleNumber": "examoplke",
"description": "examoplke",
"location": "examoplke",
"city": "examoplke"
}
```

#### Get Entries

Get Request url : /api/entry/get

Query Parameters

fromUser=userId
startDate=Sql Date Format
endDate=Sql Date Format
vehicle=VechicleNumber
city=City
