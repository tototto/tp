# Developer Guide

## Design
//todo overview

## Architechture
{Describe the design and implementation of the product. Use UML diagrams and short code snippets where applicable.}
![Image of UpdateSequenceDiagram](https://github.com/AY2021S1-TIC4001-3/tp/blob/master/docs/Images/architecture.png)

The Architecture Diagram given above explains the high-level design of the App. Given below is a quick overview of each component.

The rest of the App consists of four components.

UI: The UI of the App.
Main: The main logic handler of the App.
Commons: The control variable of the App.
Storage: Reads data from, and writes data to, the hard disk.
Finder: Searches and sort the data
IssueList: Define the structure of each issue to track.

Each of the six components,

## How the architecture components interact with each other

The Sequence Diagram below shows how the components interact with each other for the scenario where the user issues the command delete 1.

## UI component



//todo FINDER component


//todo STORAGE component


## IssueList component

The IssueList component is the container to save the data of defects during execution of program. It consist two classes, IssueList and Defects. Issuelist has a vector to store defects.  And the Defect class is the class of defects as what we defined. It contains the defect name, status, severity,date raised, deadline and owner.

The IssueList component:
* Able to interact with Storage component and load existing issues
* Able to add new defects and store it in the instance of IssueList class
* Able to delete existing defects that stored in the instance of IssueList class
* Able to get defects that stored in the instaance of IssueList class
* Able to get the whole IssueList itself 
* Able to set/get all details of any specified defect

![Image of IssueListComponentClassDiagram](https://github.com/AY2021S1-TIC4001-3/tp/blob/master/docs/Images/IssueListComponent.png)

## COMMONS component

The commons component are those classes used by multiple components are in the program,such as enum classes and the parser class.

The parser class is mainly in charge of parse user's input and convert them to a workable format to the program. The enum classes are used to strict the keywords. 

## Implementation
// take one user story as example to showcase how certain features are implemented. 


## Product scope
### Target user profile
* Is a developer, tester or member of the project team.
* prefer desktop apps over other types.
* can type fast.
* prefers typing to mouse interactions.
* is reasonably comfortable using CLI apps.


### Value proposition
manage defects faster than a typical mouse/GUI driven app. Allows the user to better manage the project issues.

## User Stories
 
|Priority| As a … | I want to … | So that I can… |
|--------|----------|---------------|------------------|
|* * * |new user|add issues into IT logger|track my issues|
|* * * |New user|view an issue that is based on the ticket number|see its progress.|
|* * * |New user|delete a defect|remove defects that are resolved or no longer required|
|* * * |New user|list all issues currently in the ITLogger|find all of the recorded issues currently in ITLogger.|
|* * |New user|I would like a given issue format|so that I can know a structured way of using the app|
|* |New user|I would like the issue I logged to be date stamped|so that I know when it was raised|
|* * * |User|be able to load defects from a text file or database|View and track all defects previously recorded in the system|
|* * * |User|Have a help guide|View the usage of the app|
|* * * |User|Update information of existing defects|Keep track of those defects that have changed|
|* * |user|Search defects based on my preference|Narrow down the search result based on what i want to look up|
|* * * |User|Automatically save my records when the defect list has been changed|progression will not be lost|
|* * |User|View my defect in a sorted order|More easily track my list of items|
|* * * |Forgetful user|Be notified of my task that are due|Not forget what i need to fix and close|
|* * * |User|Have a robust app|So that my data integrity is maintained (e.g. no deletion, cannot reopen after close)|


## Non-Functional Requirements

* Should work on any mainstream OS as long as it has Java 11 or above installed.
* Should be able to hold up to 1000 defects without a noticeable sluggishness in performance for typical usage.
* A user with above average typing speed for regular English text (i.e. not code, not system admin commands) should be able to accomplish most of the tasks faster using commands than using the mouse
* Should load from and save to from a text files


## Glossary

* *Mainstream OS:* Windows, Linux, Unix, OS-X.

## Instructions for manual testing

{Give instructions on how to do a manual product testing e.g., how to load sample data to be used for testing}

![Image of UpdateSequenceDiagram](https://github.com/AY2021S1-TIC4001-3/tp/blob/master/docs/Images/updateSequenceDiagram.png)

