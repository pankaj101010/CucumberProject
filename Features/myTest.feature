Feature: Reset functionality on login page of Application 
Background: 
	Given looking for is this running in background or not 
@ignore 
Scenario Outline: Verification of reset button with numbers of credential 

	Given Open the Chrome and launch the application 
	
	When Enter the Username <username>and Password <password> 
	
	Then Reset the credential 
	
	Examples:  
		|username	 |password 		|
		|User1    	 |password1		|
		|User2   	 |password2		|
		|User3    	 |password3		|
		@Run 
		Scenario: Testing another functionality 
			Given i am a Automation tester 
			When i started my job in resonantia 
			Then i Learnt more skill set 
				| Skill | Duration |	
				|TestNg | 14Days   |
			Then i switch my job 