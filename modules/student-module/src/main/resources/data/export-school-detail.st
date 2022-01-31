<?xml version="1.0" encoding="utf-8"?>
<school-detail>
<schoolName>$schoolName$</SchoolName>
$studentList: { sl |
	<student>
	<fullName>$sl.fullName$</fullName>
	<classNumber>$sl.classNumber$</classNumber>
	<parentName>$sl.parentName$</parentName>
	<rollNumber>$sl.rollNumber$</rollNumber>
	<dateOfBirth>$sl.dateOfBirth$</dateOfBirth>
		<address>
		<street>$sl.address.street$</street>
		<area>$sl.address.area$</area>
		<city>$sl.address.city$</city>
		<zip>$sl.address.zip$</zip>
		<state>$sl.address.state$</state>
		<country>$sl.address.country$</country>
		
	    </address>
	</student>
}$	
</school-detail>