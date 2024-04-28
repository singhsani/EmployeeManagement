<!DOCTYPE html>
<html>

   <head>

      <meta charset="UTF-8">
      <title>Employee Detail</title>

      <link rel="icon" type="image/x-icon" href="images/favicon.ico">
      <link rel="stylesheet" href="CSS/css/examTimetable.css">
      <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
      <script src="CSS/js/jquery-1.10.2.js"></script>

   </head>

   <script type="text/javascript">

     function saveEmployeeData(){

	let firstName = document.getElementById("firstName").value;
    let lastName = document.getElementById("lastName").value;
    let joiningdate = document.getElementById("joiningdate").value;
    let birthDate = document.getElementById("birthDate").value;
    let qualification = document.getElementById("qualification").value;
    let salary = document.getElementById("salary").value;

    console.log("firstName::"+firstName+"lastName::"+lastName+"joiningdate::"+joiningdate+"birthDate::"+birthDate);

	$.ajax({
		type : 'post',
		url : 'centerMaster',
		data: {
			firstName: firstName,
			lastName: lastName,
			joiningdate: joiningdate,
			birthDate: birthDate,
			qualification: qualification,
			salary: salary,
        },
        success : function(response) {
        	alert(response);
		},
        error: function (response) {
        	console.log("error=====>"+response);
            alert('error in update data');
        }
	});
}

</script

   <body>

      <h2>Employee Detail</h2>
      <br>

      <!-- Form structure -->
      <div class="container">


         <form action="examTimeTable" method="post">
            <input type="hidden" name="action" value="insert">


      <div class="form-row">
      <div class="form-group col-md-6">
      <label  for="session">First Name :</label>
       <input type="text" name="firstName" id="firstName" class="form-control" placeholder="Enter First Name" >
      </div>


      <div class="form-row">
      <div class="form-group col-md-6">
      <label>Last Name :</label>
       <input type="text" id="lastName" class="form-control" placeholder="Enter Last Name">
      </div>

       <div class="form-row">
      <div class="form-group col-md-6">
      <label>Joining Date :</label>
        <input type="date" id="joiningdate" class="form-control" placeholder="Enter Joining Date">
      </div>


      <div class="form-row">
      <div class="form-group col-md-6">
      <label >Birth Date :</label>
        <input type="date" id ="birthDate" class="form-control" placeholder="Enter Birth Date">
      </div>


      <div class="form-row">
      <div class="form-group col-md-6">
      <label  for="qualification">Qualification</label>
      <select id="qualification" name="qualification" class="form-control" placeholder="Enter Qualification">
        <option>BSC</option>
        <option>BE</option>
        <option>BCA</option>
        <option>MCA</option>
      </select>
      </div>

      <div class="form-row">
      <div class="form-group col-md-6">
      <label >Salary :</label>
        <input type="text" id="salary" class="form-control" placeholder="Enter Salary">
      </div>
      </div>


       <div class="form-group save_btn col-md-6">
         <div class="save-btn">
       <button class="save" type="submit" onclick= "saveEmployeeData()">Submit</button>
         </div>
       </div>

       <div class="form-group col-md-6">
         <div class="list-btn">
       <button class="list" type="button" onclick="resetFields()">Reset</button>
         </div>
       </div>


      </form>
      </div>


      <table border="1">
<thead>
    <tr>
        <th>Sr. No</th>
        <th>Name</th>
        <th>Birth Date</th>
        <th>Joining Date</th>
        <th>Salary</th>
        <th>Is Freshner Employee</th>
        <th>Edit</th>
    </tr>
</thead>
<tbody>

    <tr>
        <td>PAVAN</td>
        <td>AGVFV</td>
        <td>BCYDG</td>
        <td>PAVAN</td>
        <td>AGVFV</td>
        <td>BCYDG</td>
        <td><input type="button" name="edit" value="Edit" style="background-color:#0000FF;font-weight:bold;color:#ffffff;" onclick="editRecord();" ></td></td>
    </tr>

</tbody>
</table >

   </body>
</html>
