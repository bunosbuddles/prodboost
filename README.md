Original App Design Project - README Template
===

# Productivity Booster

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
This app is an android application that intends to keep users productive by allowing different users to communicate and remind each other of their daily goals, holding each other accountable and making sure that everyone's days are productive.

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:**
Productivity
- **Mobile:**
This app would target mobile devices for compatibility, but web versions may be used as well. There will be more features available on the movile version than the web versions however.
- **Story:**
Allows users to create todo lists and publish them for other users to view, and makes it possible to remind others of their todo lists through notifications. 
- **Market:**
Open to pretty much anyone who likes to plan their days out and follow through.
- **Habit:**
This app will be used mostly at the start of the users' days, but also a little throughout the day as they remind each other or get reminded by each other of their todo lists. 
- **Scope:**
This app will be used mainly amongst friends, as it would be weird for the users to see the todo lists of random people around the world and remind them. This will mostly be used between friend groups, families, or even coworkers to make sure that the users are held accountale for their daily plans.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

- [X] User can register a new account
- [X] User can enter in data that will be linked to their account
- [X] User can login
- [X] User can publish their own todo list onto a feed
- [X] User can view a feed of others' todo list

**Optional Nice-to-have Stories**

- [ ] Users who have completed all of their tasks in consecutive days will have streaks marked for their profile
- [ ] User can comment on other's todo lists
- [ ] User can edit their todo list
- [ ] User can notify others for their todo list
- [ ] User can view their profiles and a log of all of their completed/incompleted tasks from the past

### 2. Screen Archetypes

* Login
   * User can login
* Register
   * User can register a new account
   * User can enter in data that will be linked to their account
* Stream
   * User can edit their todo list
   * User can view a feed of others' todo list
   * User can notify others for their todo list
   * Users who have completed all of their tasks in consecutive days will have streaks marked for their profile
   * User can comment on other's todo lists
* Creation
   * User can publish their own todo list onto a feed
* Profile
   * User can view their profiles and a log of all of their completed/incompleted tasks from the past
   * Users who have completed all of their tasks in consecutive days will have streaks marked for their profile

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Stream
* Profile
* Creation

**Flow Navigation** (Screen to Screen)

* Login
  * Stream
* Register
  * Stream
* Stream
  * Detail
* Creation
  * Stream
* Profile


## Wireframes
[Add picture of your hand sketched wireframes in this section]
<img src=Wireframe.gif width='' />


## Schema 

### Models
#### Post

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user post (default field) |
   | author        | Pointer to User| image author |
   | todoList      | String   | the todo list that the author created |
   | createdAt     | DateTime | date when post is created (default field) |
   | updatedAt     | DateTime | date when post is last updated (default field) |
   
#### User

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user  (default field) |
   | username      | String   | the username for the account |
   | password      | String   | the password for the account |
   | email         | String   | the email for the account |
   | createdAt     | DateTime | date when user is created (default field) |
   | updatedAt     | DateTime | date when user is last updated (default field) |


### Networking
#### List of network requests by screen
- Home Feed Screen
  - (Read/GET) Query all posts
  - (Create/POST) Create a new notification on the todo list of one of your friends
  - (Delete) Delete existing post
- Create Post Screen
  - (Create/POST) Create a new post object
- Profile Screen
  - (Read/GET) Query logged in user object

### Sprint 1

<img src=Walkthrough1.gif width='' />

### Sprint 3

<img src=Walkthrough3.gif width='' />

### Sprint 4

<img src=Walkthrough4.gif width='' />

