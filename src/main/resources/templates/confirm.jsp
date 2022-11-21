<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
	background-image: url('airline.jpg');
	background-size: cover;
	color:floralwhite;
  font-family: Arial;
  font-size: 17px;
  padding: 8px;
}

* {
  box-sizing: border-box;
}

.row {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  margin: 0 -16px;
}

.col-25 {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
}

.col-50 {
  -ms-flex: 50%; /* IE10 */
  flex: 50%;
}

.col-75 {
  -ms-flex: 75%; /* IE10 */
  flex: 75%;
}

.col-25,
.col-50,
.col-75 {
  padding: 0 16px;
}

.container {
 
  padding: 5px 20px 15px 20px;
 
  border-radius: 3px;
}

input[type=text] {
  width: 100%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}

label {
  margin-bottom: 10px;
  display: block;
}

.icon-container {
  margin-bottom: 20px;
  padding: 7px 0;
  font-size: 24px;
}

.btn {
  background-color: #03a9f4;
  color: white;
  padding: 12px;
  margin: 10px 0;
  border: none;
  width: 100%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 17px;
}

.btn:hover {
  background-color: #004eff;
}

a {
  color: #2196F3;
}

hr {
  border: 1px solid lightgrey;
}

span.price {
  float: right;
  color: grey;
}

/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
@media (max-width: 800px) {
  .row {
    flex-direction: column-reverse;
  }
  .col-25 {
    margin-bottom: 20px;
  }
}
</style>
</head>
<body>

<h2>Booking Confirmation</h2>
<p></p>
<div class="row">
  <div class="col-25">
    
  </div>
  <div class="col-50">
    <div class="container">
      <form action="index.jsp">
      
        <div class="row">
          <div class="col-50">
            <h3>Flight Details</h3>
            <h4>Departing Flight</h4>
            
            <div class="row">
            <div class="col-25">
            <label for="airline"><i class="fa fa-plane" style="font-size:24px;color:red"></i> Flight Name</label>
            <h4>Jet Airways</h4>
            </div>
            
            <div class="col-25">
            <label for="fname"></i> Passenger First Name</label>
           <h4>Bruce</h4>
           </div>
           
           <div class="col-50">
           <label for="lname"></i> Passenger Last Name</label>
           <h4>Wayne</h4>
            </div>
            </div>
           <br><br>
           <div class="row">
          <div class="col-25">
            <label for="mnum"></i> Mobile Number</label>
           <h4>9841314435</h4>
            </div>
            
            <div class="col-25">
           <label for="source"></i> Source</label>
           <h4>London</h4>
           </div>
           
           <div class="col-50">
           <label for="Dest"></i> Destination</label>
           <h4>Wellington</h4>
           </div>
           </div>
           
           <br><br>
           <label for="date"></i> Date</label>
           <h4>2022-11-16</h4>

            <div class="row">

            </div>
          </div>

          
          
        </div>
        
        <div class="col-50">

          </div>
        

        <input type="submit" value="Got to Homepage" class="btn">
      </form>
    </div>
  </div>
  <div class="col-25">
    
</div>

</body>
</html>
