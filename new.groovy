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

def row = testRunner.testCase.testSteps["DataSource"].currentRow
def n = 3 
 
 def row = testRunner.testCase.testSteps["DataSource"].currentRow
def n = 3

def row = testRunner.testCase.testSteps["DataSource"].currentRow
def n = 3
 
if (row < n) {
 
	def randomId = (100..999).toList().get(new Random().nextInt(900))
	def firstName = generateRandomString()
	def middleName = generateRandomString()
	def lastName = generateRandomString()
	def dob = generateRandomDOB()
 
        // Return the current deviceId to data source "DeviceId" properties
    result["randomId"] = randomId
	result["firstName"] = firstName
	result["middleName"] = middleName
	result["lastName"] = lastName
	result["dob"] = dob
    
   2


    result["randomId"] = randomId
	result["firstName"] = firstName
	result["middleName"] = middleName
	result["lastName"] = lastName
	result["dob"] = dob

    3
    result["randomId"] = randomId
	result["firstName"] = firstName
	result["middleName"] = middleName
	result["lastName"] = lastName
	result["dob"] = dob
    

}


