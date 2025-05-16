/*
// A sample groovy data source script.
// This groovy data source script generates property values by executing a groovy script.
// To get the output value, use the built-in result map object.

def groovyUtils = new com.eviware.soapui.support.GroovyUtils(context)
def projectPath = groovyUtils.projectPath
def directoryName = projectPath + "/testData"
def row = testRunner.testCase.testSteps["DataSource"].currentRow
def allFiles = []
new File( directoryName ).eachFile() { file ->
	if( file.name =~ /.txt/ ) {
		allFiles.add( file.name )	}
}
if ( (row + 1) <= allFiles.size ) {
	// output to the test step property called inputData
	result["inputData"] = new File( directoryName + "/" + allFiles[row] ).text
}
*/



import java.time.LocalDate

import java.time.format.DateTimeFormatter

import java.util.Random


// Function to generate a random 5-character string

def generateRandomString(int length = 5) {
    def chars = ('A'..'Z') + ('a'..'z') // Uppercase and lowercase letters

    def random = new Random()
    (1..length).collect { chars[random.nextInt(chars.size())] }.join()
}



// Function to generate a random date of birth (DOB) as a string

def generateRandomDOB() {
    def random = new Random()
    // Generate a random year between 1950 and 2005

    int year = 1950 + random.nextInt(56)
    // Generate a random month (1-12)
    int month = 1 + random.nextInt(12)
    // Generate a random day based on the month and year

    int day = 1 + random.nextInt(LocalDate.of(year, month, 1).lengthOfMonth())
    // Format the date as yyyy-MM-dd

    LocalDate.of(year, month, day).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
}

def randomId = (100..999).toList().get(new Random().nextInt(900))
def firstName = generateRandomString()
def middleName = generateRandomString()
def lastName = generateRandomString()
def dob = generateRandomDOB()


