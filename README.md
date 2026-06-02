# AP Computer Science A Final Project 

## Project Title - School Event Manager

### Overview

You will build a Java console application that helps manage a fictional school event. The program should allow users to:
- Create and store participants
- Register students for activities
- Search and sort data
- Generate simple reports
- Use object-oriented programming principles throughout

---
## Scenario
Your school is hosting a multi-activity event day. Students can sign up for activities like:
- Robotics
- Basketball
- Art Workshop
- Coding Competition
- Debate
The program should help organizers keep track of participants and activity registrations.

## Required Features

### 1. Create a Participant Class
Required fields:
- name
- grade
- studentID
- activities
- score (for competition results)
Required methods:
- Constructor
- Getters/setters
- toString()
Example:
Participant p = new Participant("Ava", 11, 2045, {“Robotics”, “Basketball”, “Debate”}, 95);

---
### 2. Store Participants in an ArrayList
Use:
ArrayList<Participant>

Program should allow:
- Adding participants
- Removing participants
- Viewing all participants

---
### 3. Menu System
Create a looping menu using conditionals and loops.
Example:
1. Add Participant
2. Remove Participant
3. Save/load participant data from a file
4. Search Participant
5. Display All Participants
6. Display schedule for participant
7. Set activity schedule for school
8. Change activity schedule for school
9. Sort by Score
10. Activity Report
11. Quit

---
### 4. Search Feature
Allow the user to search by:
- Name
OR
- Student ID
Students must use iteration and conditionals.

---
### 5. Sorting Feature
Sort participants by:
- Score
OR
- Name

---
### 6. Report Feature
Generate at least one report such as:
- Average score
- Highest score
- Number of students per activity
- Count of each grade level

---
## Suggested Timeline
### Day 1
#### Part 1
- Create Participant class
- Build constructor/getters/setters
- Create menu structure
#### Part 2
- Add/remove/display participants
- Begin search functionality

---
### Day 2/3
#### Part 1
- Complete searching and sorting
- Add report features
#### Part 2
- Debug and test
- Add optional features
- Final demonstration

---
## Deliverables
Students submit every class:
- .java files
- Full screenshots of code & program running
- Submit the above in a zipped folder with the date.

## Rubric (100 Points)*


| Category                                                                                                                                                                                                                    | Points |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------ |
| Correct use of objects/classes<br><br>- Use of constructors to setup/instantiate objects<br>    <br>- Use of Getter/Setter methods for private variables<br>    <br>- Using objects appropriately when generating a report. | 20     |
| ArrayList usage<br><br>- Correct use of ArrayList when storing & interacting with participants.                                                                                                                             | 10     |
| 2D Array usage<br><br>- Correct use of 2D Array when setting and displaying activity schedule for participant(s).                                                                                                           | 10     |
| Menu & user interaction<br><br>- Menu is clearly displayed when program starts. <br>    <br>- User can interact with any part of the menu without errors.                                                                   | 15     |
| Searching & Sorting<br><br>- Searching by Name or ID correctly works without errors<br>    <br>- Sorting by score or name works without errors.                                                                             | 20     |
| Methods & organization<br><br>- Correct use of methods to break down complex tasks.                                                                                                                                         | 15     |
| Code readability & comments<br><br>- Code should be understandable to the teacher and comments properly explain methods and any complex code.                                                                               | 10     |
| Total                                                                                                                                                                                                                       | /100   |

* Note: The basic structure of this rubric will stay the same, but some details might be added later. 

## Example Output

```
==== SCHOOL EVENT MANAGER ====
1. Add Participant
2. Remove Participant
3. Search Participant
4. Display All
5. Sort by Score
6. Activity Report
7. Quit

Activity Schedule: 
9:00 - Robotics
10:00 - Basketball
11:00 - Art Workshop
12:00 - Coding Competition
13:00 - Debate

Choose an option: 1

Enter name: Ava
Enter grade: 11
Enter ID: 2045
Enter activity: Robotics
Enter score: 95

Enter activities that Ava would like to participate in: Robotics, Basketball, Coding Competition

Participant added successfully.
```

---