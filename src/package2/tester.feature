Feature: Life of IT tester

In order to get good salary
As a IT guy 
I want to keep my boss happy

Scenario Outline: I am a tester
Given I am a "<TesterType>" tester
When I go to work 
Then I "<Work_Output>" it 
And My boss "<Boss_Action>" me
But The developer "<Developer_Action>" me

 Examples: 
 |  TesterType  |  Work_Output  |  Boss_Action  |  Developer_Action  |
 |   Bad        |  Messes       |  Hates        |   Likes            |
 |   Good       |  Completes    |  Salutes      |   Hates            |
 |   Average    |  Sufficient   |  Congrates    |   Respects         |
 



 


