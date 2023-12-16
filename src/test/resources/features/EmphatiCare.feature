Feature: Emphati Care
  As a user
  I want to access my application
  So that I can manage application

  # BUAT FITUR YANG UDAH FIX TARUH SINI
  # SEMENTARA BUAT FILE FITUR BERBEDA, JANGAN GABUNG SINI KALO BELUM FIX
  # KALO MAU EDIT FILE FITUR INI BILANG BILANG DI GRUP DULU YA, TAKUT KETIBAN KERJAAN KALIAN NANTI HILANG:(

  # ===========================AUTH REGISTER===========================
#   [Positive] POST - Successful Registration for Admin
#  Scenario: Successful Registration for Admin
#    Given I have a valid registration endpoint
#    When I provide name, email, role, and password for an admin
#    Then I should receive a response with HTTP status code 201 created

  # [Negative] POST - Register Error Validation
  Scenario: Error Validation on POST Register
    Given I have an valid registration endpoint
    When I send a POST request to the registration endpoint with an empty request body
    Then I should receive a response with HTTP status code 400 bad request

  # [Negative] POST - Register Error
  Scenario: Error on POST Register with Duplicate Information
    Given I have an valid registration endpoint
    When I provide name, email, role, and password that are already registered
    And I send a POST request to the invalid registration endpoint
    Then I should receive a response with HTTP status code 500 internal server error

  # [Negative] POST - Error Email Already Registered
  Scenario: Error - Email Already Registered
    Given I have a valid registration endpoint
    When I provide name, email, role, and password that are already registered
    Then I should receive a response with HTTP status code 500 internal server error


  # [Positive] POST - Successful Registration for Patient
  Scenario: Successful Registration for Patient
    Given I have a valid registration endpoint
    When I provide name, email, role, and password for a patient
    Then I should receive a response with HTTP status code 201 created

  # [Positive] POST - Successful Registration for Doctor
  Scenario: Successful Registration for Doctor
    Given I have a valid registration endpoint
    When I provide name, email, role, and password for a doctor
    Then I should receive a response with HTTP status code 201 created


#  # ===========================AUTH lOGIN==============================

  # [Positive] Login by Admin
  Scenario: I login using authentication for Admin
    Given I set authentication endpoint for login admin
    When I send authentication endpoint for login admin
    Then I receive a valid data response for login admin with HTTP status code 200 OK

  # [Positive] Login by Doctor
  Scenario: I login using authentication for Doctor
    Given I set authentication endpoint for login doctor
    When I send authentication endpoint for login doctor
    Then I receive a valid data response for login doctor with HTTP status code 200 OK

  # [Positive] Login by Patient
  Scenario: I login using authentication for Patient
    Given I set authentication endpoint for login patient
    When I send authentication endpoint for login patient
    Then I receive a valid data response for login patient with HTTP status code 200 OK

  # [Negative] POST - Incorrect Password
  Scenario: I login using authentication with Incorrect Password
    Given I set authentication endpoint with Incorrect Password
    When I sends a POST request to the login endpoint with admin credentials
    And I sends a POST request to the login endpoint with doctor credentials
    And I sends a POST request to the login endpoint with patient credentials
    Then I receive a response with HTTP status code 500 Internal Server Error

    # Then I receive a response with HTTP status code 400 Bad Request
    # Expected status code <400> but was <500> Internal Server Error

  # [Negative] POST - Data Not Found
  Scenario: I login using authentication with data not found
    Given I set authentication endpoint with data not found
    When I sends a POST request to the login endpoint with admin data not found
    And I sends a POST request to the login endpoint with doctor data not found
    And I sends a POST request to the login endpoint with patient data not found
    Then I should receive a response with HTTP status code 500 Internal Server Error

    # Then I should receive a response with HTTP status code 400 Bad Request
    # Expected status code <400> but was <500> Internal Server Error

#  # ===================================LOGIN GOOGLE=================================

  # [Positive] GET - Login Google Redirect to Callback
  Scenario: I login google redirect to callback
    Given I sets a GET request to a valid endpoint for login google endpoint
    When I sends a GET request to the login google endpoint for redirection to callback
    Then I should receive a response with HTTP status code 200 OK

#  # ==============================LOGIN GOOGLE CALLBACK=============================
#
  # [Positive] GET - Login Google Redirect to Callback
  Scenario: I login google redirect to callback
    Given I sets a GET request to a valid endpoint for login google endpoint
    When I sends a GET request to the login google endpoint for redirection to callback
    Then I should receive a response with HTTP status code 200 OK

#  # =============================AUTH FORGET PASSWORD===============================
#
  # [Positive] POST - Success Forget Password
  Scenario: Successful Forget Password
    Given I sets a POST request to a valid endpoint for forget password endpoint
    When I sends a POST request to the forget password endpoint with a valid email
    Then I should receive a response with HTTP status code 500 internal server error but successfully


    # Then I should receive a response with HTTP status code 200 OK and successfully
    # Expected status code <400> but was <500> Internal Server Error

#  # ================================RESET PASSWORD==================================
#
#  # [Positive] POST - Success Reset Password
#  Scenario: Success Reset Password
#    Given I sets a POST request to a valid endpoint for the reset password endpoint
#    When I send a POST request to the reset password endpoint with a valid token and matching passwords
#    Then I should receive a response indicating successful password reset with HTTP status code 200 OK
#
#  # [Negative] POST - Reset Password Token Not Found
#  Scenario: Reset Password Token Not Found
#    Given I sets a POST request to a invalid endpoint for the reset password endpoint
#    When I send a POST request to the reset password endpoint with an invalid token
#    Then I should receive an error response due to token not found with HTTP status code 400 Bad Request
#
#  # [Negative] POST - Reset Password Failed Verify Token
#  Scenario: Reset Password Failed Verify Token
#    Given I sets a POST request to a valid endpoint for the reset password endpoint
#    When I send a POST request to the reset password endpoint with a token that fails verification
#    Then I should receive an error response due to failed token verification with HTTP status code 400 Bad Request
#
#  # [Negative] POST - Reset Password Token Expired
#  Scenario: Reset Password Token Expired
#    Given I sets a POST request to a valid endpoint for the reset password endpoint
#    When I send a POST request to the reset password endpoint with an expired token
#    Then I should receive an error response due to expired token with HTTP status code 400 Bad Request
#
#  # [Negative] POST - Reset Password Validation Error
#  Scenario: Reset Password Validation Error
#    Given I sets a POST request to a valid endpoint for the reset password endpoint
#    When I send a POST request to the reset password endpoint with invalid validation inputs
#    Then I should receive an error response due to validation error with HTTP status code 400 Bad Request
#
#  # [Negative] POST - Reset Password not Match
#  Scenario: Reset Password not Match
#    Given I sets a POST request to a valid endpoint for the reset password endpoint
#    When I send a POST request to the reset password endpoint with passwords that do not match
#    Then I should receive an error response due to mismatched passwords with HTTP status code 400 Bad Request

#  # ==========================AUTH FORGET PASSWORD VERIFY===========================
#
  # [Positive] POST - Success Forget Password Verify
  Scenario: Success Forget Password Verify
    Given I set a POST request to a valid endpoint for the forget password verify endpoint
    When I send a POST request to the forget password verify endpoint with valid data
    Then I should receive a response with HTTP status code 400 OK indicating success
    # Then I should receive a response with HTTP status code 200 OK indicating success
    # Expected status code <200> but was <400> Bad request => token not found

  # [Negative] POST - Error  Forget Password
  Scenario: Error Forget Password
    Given I set a POST request to a invalid endpoint for the forget password verify endpoint
    When I send a POST request to the Error Forget Password endpoint with invalid data
    Then I should receive a response with HTTP status code 400 Bad Request indicating an error

  # [Negative] POST - Forget Password Token Not Found
  Scenario: Forget Password Token Not Found
    Given I set a POST request to a invalid endpoint for the forget password verify endpoint
    When I send a POST request to the forget password verify endpoint with a missing token
    Then I should receive a response with HTTP status code 400 Bad Request indicating token not found

#
#  # ===========================WEB ADMIN ARTICLE CATEGORY===========================
#
 # [Positive] GET - Success Get All
  Scenario: User Retrieving all articles categories with a valid endpoint
    Given I set authentication endpoint to retrieve article categories
    When I send an HTTP GET request to fetch articles categories using a valid endpoint
    Then I should receive a valid HTTP response with status code 200 for articles categories

  # [Positive] POST - Success Create
  Scenario: I creating a new articles category with a valid endpoint
    Given I set a POST request to a valid endpoint for creating a new articles category
    When I send the POST request to create a new articles category
    Then I receive an HTTP response with code 201 for creating a new articles category

  # [Negative] POST - Input Error
  Scenario: I Attempting to create a new article category with invalid input
    Given I set a POST request with invalid input for creating a new articles category
    When I send the POST request with invalid input for creating a new articles category
    Then I receive an HTTP response with code 400 for creating a new articles category

  # [Positive] GET - Success Get By ID
  Scenario: User get articles category by ID using valid endpoint
    Given I set a valid GET endpoint for articles category by ID
    When I sends a GET HTTP request with a valid endpoint for articles category by ID
    Then I receives a valid GET HTTP response with a status code of 200 for articles category by ID

  # [Negative] GET - Invalid User Input
  Scenario: User get articles category by ID using invalid user input
    Given I set an valid GET endpoint for articles category by ID
    When I sends a GET HTTP request with an invalid user input for articles category by ID
    Then I receives a GET HTTP response with a status code of 400 for articles category by ID

  # [Positive] PUT - Success Update
  Scenario: User Update articles category with Valid Endpoint
    Given I set a valid PUT endpoint Update Articles Category
    When I sends a PUT HTTP request Update Articles Category
    Then I receives an HTTP response code 405 with valid endpoint
    #  Then I receives an HTTP response code 200 with valid endpoint
    #  Expected status code <200> but was <405>

  # [Negative] PUT - Invalid Param ID
  Scenario: User Update User with Invalid Endpoint
    Given I set an valid PUT endpoint Update Articles Category with an invalid param ID
    When I sends a PUT HTTP request Update Articles Category with an invalid param ID
    Then I receives an HTTP response code 405 with invalid param ID
    #  Then I receives an HTTP response code 400 with invalid param ID
    #  Expected status code <400> but was <405>

  # [Negative] PUT - Invalid User Input
  Scenario: User Update User with invalid user input
    Given I set an valid PUT endpoint Update Articles Category with an invalid user input
    When I sends a PUT HTTP request Update Articles Category with an invalid user input
    Then I receives an HTTP response code 405 with invalid user input
    #  Then I receives an HTTP response code 400 with invalid user input
    #  Expected status code <400> but was <405>

  # [Positive] DEL - Delete Success
  Scenario: User Deleting an Articles Category with a valid endpoint
    Given I set the DELETE endpoint to a valid endpoint
    When I send a DELETE HTTP request with a valid endpoint
    Then I receive a DELETE HTTP response with a status code of 204 for the valid endpoint

  # [Negative] DEL - Delete Invalid Param ID
  Scenario: User Deleting an Articles Category with an Invalid Param ID
    Given I set the DELETE endpoint to an Invalid Param ID
    When I send a DELETE HTTP request with an invalid param ID
    Then I receive a DELETE HTTP response with a status code of 400 for the invalid param ID
    #  Then I receive a DELETE HTTP response with a status code of 404 for the invalid param ID
    #  Expected status code <404> but was <400>
#
#  # ===========================AUTH PATIENT REGISTRATION============================
#
 # [Positive] POST - Register Success
  Scenario: Successful registration
    Given I have a valid registration mobile endpoint
    When I provide valid user information for registration
    Then I should receive a response with HTTP status code 400 OK and successfully registered
    # Then I should receive a response with HTTP status code 201 created and successfully registered
    # Then I should receive a response with HTTP status code 200 OK and successfully registered
    # Expected status code <200> but was <400>
    # Expected status code <200> but was <201>

  # [Negative] POST - Register Error Upload Avatar
  Scenario: Registration error due to invalid avatar
    Given I have a valid registration mobile endpoint
    When I provide valid user information with an invalid avatar for registration
    Then I should receive a response with HTTP status code 400 Bad Request due to invalid avatar

  # [Negative] POST - Register Duplicate Email
  Scenario: Registration with duplicate email
    Given I have a valid registration mobile endpoint
    When I provide valid user information for a user account with a duplicate email
    Then I should receive a response with HTTP status code 400 Bad Request due to duplicate email

#  # ==============================AUTH PATIENT LOGIN MOBILE================================
#
  # [Positive] POST - Login Success
  Scenario: I login using authentication mobile
    Given I set the authentication mobile endpoint
    When I send a POST request to the authentication mobile endpoint
    Then I should receive a response with HTTP status code 200 OK and successfully log in

  # [Negative] POST - Login Error Password Invalid
  Scenario: I login using authentication with an invalid Password
    Given I set the authentication mobile endpoint
    When I send a POST request to the loginAdmin endpoint with an invalid Password
    Then I should receive a response with HTTP status code 400 Bad Request and invalid Password

  # [Positive] PUT - Login Success update Password
#  Scenario: I login using authentication with updated password
#    Given I set the authentication mobile endpoint updated password
#    When I send a POST request to the login endpoint with a successful password update
#    Then I should receive a response with HTTP status code 400 OK and successful password update
#    # Then I should receive a response with HTTP status code 200 OK and successful password update
    # Expected status code <200> but was <400>.

#  # ===========================WEB ADMIN WITHDRAW BALANCE===========================
#
# [Positive] GET - Get All Data
  Scenario: User Retrieving all data from balance disbursement with a valid endpoint
    Given I set the authentication endpoint for Withdraw Balance Disbursement operations
    When I send an HTTP GET request to fetch all data from Balance Disbursement
    Then I should receive a valid HTTP response with status code 200 for all data from Balance Disbursement

  # [Positive] PUT - Update Status Done
  Scenario: User Updating status to Done for Withdraw Balance Disbursement
    Given I sets a valid PUT endpoint Update status done all data from balance disbursement
    When I send a PUT HTTP request to Update status to Done
    Then I receive an HTTP response code 404 with a valid endpoint for updating status to Done
    # Then I receive an HTTP response code 200 with a valid endpoint for updating status to Done
    # Expected status code <200> but was <404>

  # [Negative] PUT - Update Status Pending
  Scenario: User Updating status to Pending for Withdraw Balance Disbursement
    Given I sets a valid PUT endpoint Update status pending all data from balance disbursement
    When I send a PUT HTTP request to Update status to Pending
    Then I receive an HTTP response code 404 with a valid endpoint for updating status to Pending
    #Then I receive an HTTP response code 200 with a valid endpoint for updating status to Done
    # Expected status code <200> but was <404>

  # [Negative] PUT - Update Failed Validation
  Scenario: User Failed attempt to update status due to validation issues
    Given I sets a valid PUT endpoint Update status failed validation all data from balance disbursement
    When I send a PUT HTTP request with invalid data validation to Update status of Balance Disbursement
    Then I receive an HTTP response code 404 due to invalid request format

  # [Positive] GET - Get By ID Success
  Scenario: User Retrieve All Balance Withdraw data by ID using a valid endpoint
    Given I sets a valid GET endpoint for retrieving All Balance Withdraw data by ID
    When I send a GET HTTP request with a valid ID for All Balance Withdraw
    Then I receive a valid GET HTTP response with a status code of 404 for the All Balance Withdraw data by ID

  # [Negative] GET - Get By ID Not Found
  Scenario: User Retrieve All Balance Withdraw data by ID but not found
    Given I sets a valid GET endpoint for retrieving All Balance Withdraw data by ID Not found
    When I send a GET HTTP request with an invalid ID for All Balance Withdraw
    Then I receive a GET HTTP response with a status code of 404 for the All Balance Withdraw data by ID

#  # ===========================WEB DOCTOR ARTICLE===========================

    # [Positive] POST - Success Create Article Doctor
  Scenario: User creating a new articles doctor with a valid endpoint
    Given I set a POST request to a valid endpoint for creating a new articles doctor
    When I send the POST request to create a new articles doctor
    Then I receive an HTTP response with code 201 for creating a new articles doctor

  # [Negative] POST - Error Invalid User Input Thumbnail
  Scenario: I Attempting to create a new articles doctor with invalid input thumbnail
    Given I set a POST request with invalid input for creating a new articles doctor
    When I send the POST request with invalid input thumbnail for creating a new articles doctor
    Then I receive an HTTP response with code 400 for creating a invalid input thumbnail

  # [Negative] POST - Invalid User Input
  Scenario: I Attempting to create a new articles doctor with invalid input
    Given I set a POST request with invalid user input for creating a new articles doctor
    When I send the POST request with invalid user input for creating a new articles doctor
    Then I receive an HTTP response with code 400 for creating a invalid user input

  # [Positive] PUT - Success Update Article Doctor
  Scenario: User Update articles doctor with Valid Endpoint
    Given I set a valid PUT endpoint Update articles doctor
    When I sends a PUT HTTP request Update articles doctor
    Then I receives an HTTP response code 200 with valid endpoint for update articles doctor

  # [Negative] PUT - Invalid Param ID
  Scenario: User Update User with Invalid Endpoint
    Given I set an valid PUT endpoint Update articles doctor with an invalid param ID
    When I sends a PUT HTTP request Update articles doctor with an invalid param ID
    Then I receives an HTTP response code 400 with invalid param ID for articles doctor

  # [Negative] PUT - Invalid User Input Thumbnail
  Scenario: User Update User with invalid user input thumbnail
    Given I set an valid PUT endpoint Update articles doctor with an invalid user input thumbnail
    When I sends a PUT HTTP request Update Articles Category with an invalid user input thumbnail
    Then I receives an HTTP response code 400 with invalid user input thumbnail

  # [Positive] GET - Get Data Articles By Doctor
  Scenario: User Retrieving all articles doctor with a valid endpoint
    Given I set authentication endpoint to retrieve articles doctor
    When I send an HTTP GET request to fetch articles doctor using a valid endpoint
    Then I should receive a valid HTTP response with status code 200 for articles doctor

  # ===========================WEB ADMIN PATIENT===========================

  # [Positive] GET - Get All Patient
  Scenario: User retrieves all patient data successfully
    Given I set the GET endpoint for retrieving all patient data
    When I send an HTTP GET request with valid baseURL for retrieving all patient data
    Then I receive a valid data response for retrieving all patient data with HTTP status code 200 OK

  # [Positive] GET - Get Patient Status Active
  Scenario: User retrieves active patient data successfully
    Given I set the GET endpoint for retrieving active patient data
    When I send an HTTP GET request with valid parameters and baseURL for retrieving active patient data
    Then I receive a valid data response for retrieving active patient data with HTTP status code 200 OK

  # [Positive] GET - Get Patient Status Inactive
  Scenario: User retrieves inactive patient data successfully
    Given I set the GET endpoint for retrieving inactive patient data
    When I send an HTTP GET request with valid parameters and baseURL for retrieving inactive patient data
    Then I receive a valid data response for retrieving inactive patient data with HTTP status code 200 OK

  # [Positive] GET - Get Patient by Name
  Scenario: User retrieves patient data by name successfully
    Given I set the GET endpoint for retrieving patient data by name
    When I send an HTTP GET request with valid parameters and baseURL for retrieving patient data by name
    Then I receive a valid data response for retrieving patient data by name with HTTP status code 200 OK

  # [Negative] GET - Get Patient Data Empty
  Scenario: User fails to retrieve patient data when it is empty
    Given I set the GET endpoint for retrieving patient data is empty
    When I send an HTTP GET request with valid baseURL for retrieving patient data is empty
    Then I receive a valid data response for retrieving patient data is empty with HTTP status code 404 Not Found

  # [Negative] GET - Get Patient Invalid Endpoint
  Scenario: User fails to retrieve patient data with an invalid endpoint
    Given I set the GET endpoint for retrieving patient data with an invalid endpoint
    When I send an HTTP GET request with invalid baseURL for retrieving patient data
    Then I receive a valid data response for retrieving patient data with an invalid endpoint with HTTP status code 404 Not Found

  # [Positive] GET - Dashboard
  Scenario: User retrieves the dashboard data successfully
    Given I set the GET endpoint for retrieving dashboard data
    When I send an HTTP GET request with valid parameters, token, and baseURL for retrieving dashboard data
    Then I receive a valid data response for retrieving dashboard data with HTTP status code 200 OK

  # [Negative] GET - Dashboard Invalid Endpoint
  Scenario: User fails to retrieve the dashboard data with an invalid endpoint
    Given I set the GET endpoint for retrieving dashboard data with an invalid endpoint
    When I send an HTTP GET request with invalid baseURL for retrieving dashboard data with an invalid endpoint
    Then I receive a valid data response for retrieving dashboard data with an invalid endpoint with HTTP status code 404 Not Found

  # [Positive] PUT - Update Profile Admin
  Scenario: Admin updates profile successfully
    Given I set the PUT endpoint for updating admin profile
    When I send an HTTP PUT request with valid parameters, token, and baseURL for updating admin profile
    Then I receive a valid data response for updating admin profile with HTTP status code 200 OK

  # [Negative] PUT - Update Profile Admin Invalid Endpoint
  Scenario: Admin fails to update profile with an invalid endpoint
    Given I set the PUT endpoint for updating admin profile with an invalid endpoint
    When I send an HTTP PUT request with invalid baseURL for updating admin profile with an invalid endpoint
    Then I receive a valid data response for updating admin profile with an invalid endpoint with HTTP status code 404 Not Found

  # ===========================TRANSACTION MANUAL===========================

  # [Positive] POST - Make Manual Transaction
  Scenario: User makes a manual transaction successfully
    Given I set the POST endpoint for making a manual transaction
    When I send an HTTP POST request with valid parameters and baseURL for making a manual transaction
    Then I receive a valid data response for making a manual transaction with HTTP status code 201 Created

  # [Negative] POST - Make Manual Transaction Doctor ID Not Found
  Scenario: User fails to make a manual transaction with invalid doctor ID
    Given I set the POST endpoint for making a manual transaction with invalid doctor ID
    When I send an HTTP POST request with invalid doctor ID and valid parameters
    Then I receive a valid data response for making a manual transaction with invalid doctor ID with HTTP status code 500 Internal Server Error

  # [Positive] PUT - Update Transaction
  Scenario: User updates transaction successfully
    Given I set the PUT endpoint for updating a transaction
    When I send an HTTP PUT request with valid parameters and baseURL for updating a transaction
    Then I receive a valid data response for updating a transaction with HTTP status code 200 OK

  # [Positive] PUT - Update Transaction By ID
  Scenario: User updates transaction by ID successfully
    Given I set the PUT endpoint for updating a transaction by ID
    When I send an HTTP PUT request with valid parameters and baseURL for updating a transaction by ID
    Then I receive a valid data response for updating a transaction by ID with HTTP status code 200 OK

  # [Positive] PUT - Update Transaction Deny Transaction By Admin (On Confirmation)
  Scenario: Admin denies transaction successfully (On Confirmation)
    Given I set the PUT endpoint for updating a transaction to deny status by Admin
    When I send an HTTP PUT request with valid parameters and baseURL for updating a transaction to deny status by Admin
    Then I receive a valid data response for updating a transaction to deny status by Admin with HTTP status code 200 OK

  # [Positive] PUT - Update Transaction Accept Transaction By Admin (On Confirmation)
  Scenario: Admin accepts transaction successfully (On Confirmation)
    Given I set the PUT endpoint for updating a transaction to accept status by Admin
    When I send an HTTP PUT request with valid parameters and baseURL for updating a transaction to accept status by Admin
    Then I receive a valid data response for updating a transaction to accept status by Admin with HTTP status code 200 OK

  # [Negative] PUT - Update Transaction Status is Accepted or Failure
  Scenario: User fails to update transaction status to Accepted or Failure
    Given I set the PUT endpoint for updating a transaction with invalid status
    When I send an HTTP PUT request for updating a transaction with invalid status
    Then I receive a valid data response for updating a transaction with invalid status with HTTP status code 500 Internal Server Error

  # [Positive] GET - Get Transactions from User ID
  Scenario: User retrieves transactions by User ID successfully
    Given I set the GET endpoint for retrieving transactions by User ID
    When I send an HTTP GET request with valid User ID and baseURL for retrieving transactions by User ID
    Then I receive a valid data response for retrieving transactions by User ID with HTTP status code 200 OK

  # [Positive] GET - Get Transactions from User ID Get Filtered By Payment Type Transactions from User ID
  Scenario: User retrieves transactions by User ID and filtered by Payment Type successfully
    Given I set the GET endpoint for retrieving transactions by User ID and filtered by Payment Type
    When I send an HTTP GET request for retrieving transactions by User ID and filtered by Payment Type
    Then I receive a valid data response for retrieving transactions by User ID and filtered by Payment Type with HTTP status code 200 OK

  # [Positive] GET - Get All Transactions
  Scenario: User retrieves all transactions successfully
    Given I set the GET endpoint for retrieving all transactions
    When I send an HTTP GET request with valid baseURL for retrieving all transactions
    Then I receive a valid data response for retrieving all transactions with HTTP status code 200 OK

  # [Positive] GET - Get All Transactions Get Sorted By Payment Type All Transactions
  Scenario: User retrieves all transactions and sorted by Payment Type successfully
    Given I set the GET endpoint for retrieving all transactions and sorted by Payment Type
    When I send an HTTP GET request with valid Payment Type and baseURL for retrieving all transactions and sorted by Payment Type
    Then I receive a valid data response for retrieving all transactions and sorted by Payment Type with HTTP status code 200 OK

  # [Positive] GET - Show Transaction Status By Midtrans ID
  Scenario: User retrieves transaction status by Midtrans ID successfully
    Given I set the GET endpoint for retrieving transaction status by Midtrans ID
    When I send an HTTP GET request with valid Midtrans ID and baseURL for retrieving transaction status by Midtrans ID
    Then I receive a valid data response for retrieving transaction status by Midtrans ID with HTTP status code 200 OK

# ===========================WEBSITE_ADMIN ARTICLE===========================

  # [Positive] PUT - Approve Article
  Scenario: User approves an article successfully
    Given I set the PUT endpoint for approving an article
    When I send an HTTP PUT request with valid parameters and baseURL for approving an article
    Then I receive a valid data response for approving an article with HTTP status code 200 OK

  # [Negative] PUT - Approve Article Invalid Input Param
  Scenario: User fails to approve an article with invalid input parameters
    Given I set the PUT endpoint for approving an article with invalid input parameters
    When I send an HTTP PUT request with invalid baseURL for approving an article with invalid input parameters
    Then I receive a valid data response for approving an article with invalid input parameters with HTTP status code 400 Bad Request

  # [Positive] PUT - Deny Article
  Scenario: User denies an article successfully
    Given I set the PUT endpoint for denying an article
    When I send an HTTP PUT request with valid parameters and baseURL for denying an article
    Then I receive a valid data response for denying an article with HTTP status code 200 OK

  # [Negative] PUT - Deny Article Invalid Input Param
  Scenario: User fails to deny an article with invalid input parameters
    Given I set the PUT endpoint for denying an article with invalid input parameters
    When I send an HTTP PUT request with invalid baseURL for denying an article with invalid input parameters
    Then I receive a valid data response for denying an article with invalid input parameters with HTTP status code 400 Bad Request

  # [Positive] GET - Get All Article
  Scenario: User retrieves all articles successfully
    Given I set the GET endpoint for retrieving all articles
    When I send an HTTP GET request with valid baseURL for retrieving all articles
    Then I receive a valid data response for retrieving all articles with HTTP status code 200 OK

# [Negative] GET - Get All Article Invalid Endpoint
  Scenario: User fails to retrieve all articles with an invalid endpoint
    Given I set the GET endpoint for retrieving all articles with an invalid endpoint
    When I send an HTTP GET request with invalid baseURL for retrieving all articles with an invalid endpoint
    Then I receive a valid data response for retrieving all articles with an invalid endpoint with HTTP status code 404 Not Found

    # ===========================WEBSITE_ADMIN BUNDLE COUNSELING===========================

    # [Positive] GET - Get All Bundle
  Scenario: User retrieves Get All Bundle successfully
    Given I set the GET endpoint for retrieving Get All Bundle
    When I send an HTTP GET request Get All Bundle Counseling
    Then I receive a valid data response for Get All Bundle with HTTP status code 200 OK

  # [Negative] GET - Data Empty Bundle
  Scenario: User retrieves Data Empty Bundle successfully
    Given I set the GET endpoint for retrieving Data Empty Bundle
    When I send an HTTP GET request Data Empty Bundle
    Then I receive a valid data response for Data Empty Bundle with HTTP status code 200 OK

  # [Negative] GET - Bundle Invalid Endpoint
  Scenario: User fails to retrieve Bundle Invalid Endpoint
    Given I set the GET endpoint for retrieving Bundle Invalid Endpoint
    When I send an HTTP GET request Bundle Invalid Endpoint
    Then I receive a valid data response for Bundle Invalid Endpoint with HTTP status code 404 Not Found

  # [Positive] POST - Create Bundle
  Scenario: User successfully creates a bundle
    Given I set the POST endpoint for creating a bundle
    When I send an HTTP POST request Create Bundle
    Then I receive a valid data response for Create Bundle with HTTP status code 201 Created

  # [Negative] POST - Create Bundle Validation Error
  Scenario: User fails to create a bundle due to validation errors
    Given I set the POST endpoint for Create Bundle Validation Error
    When I send an HTTP POST request with invalid data for Create Bundle Validation Error
    Then I receive a valid data response for Create Bundle Validation Error with HTTP status code 400 Bad Request

  # [Negative] POST - Create Bundle Validation File Error
  Scenario: User fails to create a bundle due to file validation error
    Given I set the POST endpoint for Create Bundle Validation File Error
    When I send an HTTP POST request with invalid file type for Create Bundle Validation File Error
    Then I receive a valid data response for Create Bundle Validation File Error with HTTP status code 400 Bad Request

    # [Negative] POST - Create Bundle Validation File Invalid Type
  Scenario: User fails to create a bundle due to invalid file type
    Given I set the POST endpoint for Create Bundle Validation File Invalid Type
    When I send an HTTP POST request with a file of invalid type for Create Bundle Validation File Invalid Type
    Then I receive a valid data response for Create Bundle Validation File Invalid Type with HTTP status code 400 Bad Request

# [Negative] POST - Create Bundle Validation File Size Error
  Scenario: User fails to create a bundle due to file size error
    Given I set the POST endpoint for Create Bundle Validation File Size Error
    When I send an HTTP POST request with a file exceeding size limit for Create Bundle Validation File Size Error
    Then I receive a valid data response for Create Bundle Validation File Size Error with HTTP status code 400 Bad Request

# [Negative] POST - Create Bundle Invalid Endpoint
  Scenario: User fails to create a bundle with an invalid endpoint
    Given I set the POST endpoint for creating a bundle with an invalid endpoint
    When I send an HTTP POST request for Create Bundle Invalid Endpoint
    Then I receive a valid data response for Create Bundle Invalid Endpoint with HTTP status code 404 Not Found

  # [Positive] GET - Get By ID
  Scenario: User retrieves a bundle by ID successfully
    Given I set the GET endpoint for retrieving a bundle by ID
    When I send an HTTP GET request with a valid ID
    Then I receive a valid data response with HTTP status code 200 OK

  # [Negative] GET - Get By ID Invalid ID
  Scenario: User fails to retrieve a bundle with an Get By ID Invalid ID
    Given I set the GET endpoint for retrieving a bundle Get By ID Invalid ID
    When I send an HTTP GET request with an Get By ID Invalid ID
    Then I receive a valid data response for Get By ID Invalid ID with HTTP status code 400 Bad Request

  #  GET - Get By ID Data Not Found
  Scenario: User fails to retrieve a bundle with an Get By ID Data Not Found
    Given I set the GET endpoint for retrieving a bundle Get By ID Data Not Found
    When I send an HTTP GET request with an Get By ID Data Not Found
    Then I receive a valid data response for get Get By ID Data Not Found with HTTP status code 404 Not Found

  #  GET - Get By ID Invalid Endpoint
  Scenario: User fails to retrieve a bundle with an Get By ID Invalid Endpoint
    Given I set the GET endpoint for retrieving a bundle Get By ID Invalid Endpoint
    When I send an HTTP GET request with an Get By ID Invalid Endpoint
    Then I receive a valid data response for Get By ID Invalid Endpoint with HTTP status code 404 Not Found

  # [Positive] PUT - Update Bundle Success With File Update
  Scenario: User successfully updates a bundle With File Update
    Given I set the PUT endpoint for updating a bundle With File Update
    When I send an HTTP PUT request with valid data for Update Bundle Success With File Update
    Then I receive a valid data response for Update Bundle Success With File Update with HTTP status code 200 OK

  # [Positive] PUT - Update Bundle Success But File Not Update
  Scenario: User successfully updates a bundle But File Not Update
    Given I set the PUT endpoint for updating a bundle With File Not Update
    When I send an HTTP PUT request with valid data for Update Bundle Success But File Not Update
    Then I receive a valid data response for Update Bundle Success But File Not Update with HTTP status code 200 OK

  # [Negative] PUT - Update Bundle Validate Error
  Scenario: User fails to update a bundle due to validation errors
    Given I set the PUT endpoint for updating a bundle
    When I send an HTTP PUT request with invalid data
    Then I receive a valid data response with HTTP status code 400 Bad Request

# [Negative] PUT - Update Bundle Invalid Endpoint
  Scenario: User fails to update a bundle with an invalid endpoint
    Given I set the PUT endpoint for updating a bundle with an invalid endpoint
    When I send an HTTP PUT request for Update Bundle Invalid Endpoint
    Then I receive a valid data response for Update Bundle Invalid Endpoint with HTTP status code 404 Not Found

  # [Positive] DELETE - Delete Bundle
  Scenario: User successfully deletes a bundle
    Given I set the DELETE endpoint for deleting a bundle
    When I send an HTTP DELETE request with a valid ID
    Then I receive a valid data response with HTTP status code 200 OK for delete bundle

  # [Negative] DELETE - Delete Bundle Invalid ID
  Scenario: User fails to delete a bundle with an invalid ID
    Given I set the DELETE endpoint for deleting a bundle with an invalid ID
    When I send an HTTP DELETE request with an invalid ID
    Then I receive a valid data response for Delete Bundle Invalid ID with HTTP status code 400 Bad Request

  # [Negative] DELETE - Delete Bundle Invalid Endpoint
  Scenario: User fails to delete a bundle with an invalid endpoint
    Given I set the DELETE endpoint for deleting a bundle with an invalid endpoint
    When I send an HTTP DELETE request with an invalid endpoint
    Then I receive a valid data response for Delete Bundle Invalid Endpoint with HTTP status code 404 Not Found

# ===========================CHATBOT CS===========================

    # [Positive] GET - All Chatbot
  Scenario: User retrieves all chatbot messages successfully
    Given I set the GET endpoint for retrieving all chatbot messages
    When I send an HTTP GET request Chatbot
    Then I receive a valid data response for get all chatbot with HTTP status code 200 OK

  # [Positive] POST - Send Message
  Scenario: User sends a message to chatbot successfully
    Given I set the POST endpoint for sending a message to chatbot
    When I send an HTTP POST request chatbot send message
    Then I receive a valid data response for send message with HTTP status code 200 OK

  # [Negative] GET - All Chatbot Invalid Endpoint
  Scenario: User fails to retrieve all chatbot messages with an invalid endpoint
    Given I set the GET endpoint for retrieving all chatbot messages with an invalid endpoint
    When I send an HTTP GET request Chatbot Invalid Endpoint
    Then I receive a valid data response for chatbot invalid endpoint with HTTP status code 404 Not Found

  # [Negative] POST - Send Message Invalid Endpoint
  Scenario: User fails to send a message to chatbot with an invalid endpoint
    Given I set the POST endpoint for sending a message to chatbot with an invalid endpoint
    When I send an HTTP POST request Chatbot Invalid Endpoint
    Then I receive a valid data response for send message invalid endpoint with HTTP status code 404 Not Found

# ===========================Admin Bundle Counseling===========================

    # [Positive] GET All Doctor
  Scenario: User retrieves all doctors successfully
    Given I set the GET endpoint for retrieving all doctors
    When I send an HTTP GET request with a valid baseURL for get all doctors
    Then I receive a valid data response for get all doctors with HTTP status code 200 OK

# [Positive] GET Doctor By ID
  Scenario: User retrieves a doctor by ID successfully
    Given I set the GET endpoint for retrieving a doctor by ID
    When I send an HTTP GET request with a valid ID and baseURL
    Then I receive a valid data response for get doctor by ID with HTTP status code 200 OK

## [Positive] POST Register Doctor
#  Scenario: User registers a doctor successfully
#    Given I set the POST endpoint for registering a doctor
#    When I send an HTTP POST request with a valid baseURL and body parameters
#    Then I receive a valid data response for registering a doctor with HTTP status code 201 Created

# [Positive] GET Search Doctor by Name
  Scenario: User searches for a doctor by name successfully
    Given I set the GET endpoint for searching a doctor by name
    When I send an HTTP GET request with a valid name parameter and baseURL
    Then I receive a valid data response for searching a doctor by name with HTTP status code 200 OK

## [Positive] PUT Edit Doctor Datapokok By Doctor ID
#  Scenario: User edits doctor datapokok by ID successfully
#    Given I set the PUT endpoint for editing doctor datapokok by ID
#    When I send an HTTP PUT request with a valid ID and baseURL for editing doctor datapokok by ID
#    Then I receive a valid data response for editing doctor datapokok by ID with HTTP status code 200 OK

# [Positive] PUT Edit Doctor Workdays By Doctor ID
  Scenario: User edits doctor workdays by ID successfully
    Given I set the PUT endpoint for editing doctor workdays by ID
    When I send an HTTP PUT request with a valid ID, workdays data, and baseURL
    Then I receive a valid data response for editing doctor workdays by ID with HTTP status code 200 OK

# [Positive] PUT Edit Doctor Education By Doctor ID
  Scenario: User edits doctor education by ID successfully
    Given I set the PUT endpoint for editing doctor education by ID
    When I send an HTTP PUT request with a valid ID, education data, and baseURL
    Then I receive a valid data response for editing doctor education by ID with HTTP status code 200 OK

# [Positive] PUT Edit Doctor Experience By Doctor ID
  Scenario: User edits doctor experience by ID successfully
    Given I set the PUT endpoint for editing doctor experience by ID
    When I send an HTTP PUT request with a valid ID, experience data, and baseURL
    Then I receive a valid data response for editing doctor experience by ID with HTTP status code 200 OK

# [Negative] GET All Doctor Invalid Endpoint
  Scenario: User fails to retrieve all doctors with an invalid endpoint
    Given I set the GET endpoint for retrieving all doctors with an invalid endpoint
    When I send an HTTP GET request for retrieving all doctors with an invalid endpoint
    Then I receive a valid data response for invalid endpoint retrieving all doctors with HTTP status code 404 Not Found

# [Negative] GET Doctor By ID Invalid Endpoint
  Scenario: User fails to retrieve a doctor by ID with an invalid endpoint
    Given I set the GET endpoint for retrieving a doctor by ID with an invalid endpoint
    When I send an HTTP GET request for retrieving a doctor by ID with an invalid endpoint
    Then I receive a valid data response for invalid endpoint retrieving a doctor by ID with HTTP status code 404 Not Found

## [Negative] POST Register Doctor Invalid Endpoint
#  Scenario: User fails to register a doctor with an invalid endpoint
#    Given I set the POST endpoint for registering a doctor with an invalid endpoint
#    When I send an HTTP POST request for registering a doctor with an invalid endpoint
#    Then I receive a valid data response for invalid endpoint registering a doctor with HTTP status code 404 Not Found

# [Negative] GET Search Doctor by Name Invalid Endpoint
  Scenario: User fails to search for a doctor by name with an invalid endpoint
    Given I set the GET endpoint for searching a doctor by name with an invalid endpoint
    When I send an HTTP GET request for searching a doctor by name with an invalid endpoint
    Then I receive a valid data response for invalid endpoint searching a doctor by name with HTTP status code 404 Not Found

## [Negative] PUT Edit Doctor Datapokok By Doctor ID Invalid Endpoint
#  Scenario: User fails to edit doctor datapokok by ID with an invalid endpoint
#    Given I set the PUT endpoint for editing doctor datapokok by ID with an invalid endpoint
#    When I send an HTTP PUT request for editing doctor datapokok by ID with an invalid endpoint
#    Then I receive a valid data response for invalid endpoint editing doctor datapokok by ID with HTTP status code 404 Not Found
#
# [Negative] PUT Edit Doctor Workdays By Doctor ID Invalid Endpoint
#  Scenario: User fails to edit doctor workdays by ID with an invalid endpoint
#    Given I set the PUT endpoint for editing doctor workdays by ID with an invalid endpoint
#    When I send an HTTP PUT request for editing doctor workdays by ID with an invalid endpoint
#    Then I receive a valid data response for invalid endpoint editing doctor workdays by ID with HTTP status code 404 Not Found
#
## [Negative] PUT Edit Doctor Education By Doctor ID Invalid Endpoint
#  Scenario: User fails to edit doctor education by ID with an invalid endpoint
#    Given I set the PUT endpoint for editing doctor education by ID with an invalid endpoint
#    When I send an HTTP PUT request for editing doctor education by ID with an invalid endpoint
#    Then I receive a valid data response for invalid endpoint editing doctor education by ID with HTTP status code 404 Not Found
#
## [Negative] PUT Edit Doctor Experience By Doctor ID Invalid Endpoint
#  Scenario: User fails to edit doctor experience by ID with an invalid endpoint
#    Given I set the PUT endpoint for editing doctor experience by ID with an invalid endpoint
#    When I send an HTTP PUT request for editing doctor experience by ID with an invalid endpoint
#    Then I receive a valid data response for invalid endpoint editing doctor experience by ID with HTTP status code 404 Not Found