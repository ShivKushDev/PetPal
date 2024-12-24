
# PetPal

A fun and interactive Virtual Pet application built with **Java** and **JavaFX**. Take care of your pet by feeding, playing, and nurturing it while watching it grow over time!

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [How to Use](#how-to-use)
- [Screenshots](#screenshots)
- [Future Improvements](#future-improvements)

---

## Features
- Create your own virtual pet with **different sprites**.
- Track the pet's health, happiness, hunger, and sleep levels.
- Feed your pet, play games, or let it rest.
- **Parental Controls**: Limit gameplay to a set number of seconds. Parental controls also include a revive option to bring your pet back to life. (Note: Reviving requires restarting the game to take effect.)
- **Save and Load Progress**: Save your pet's progress at any time. When you're ready to continue, restart the game to load your saved session seamlessly.
- **Points Reward System**: Earn points for each activity you perform, such as feeding, or playing. Compete in the coin-collecting minigame, where you gather coins as your pet to boost your score!

---

## Technologies Used
- **Java**: Core language for application logic.
- **JavaFX**: For GUI design and interaction.

---

## Setup and Installation

### Prerequisites
Ensure you have the following installed:
- Java Development Kit (JDK) 11 or higher
- An IDE like IntelliJ IDEA, or Eclipse.
- Latest version of javafx sdk installed for windows. ( https://gluonhq.com/products/javafx/ ) or ( https://openjfx.io/ ) 

### Steps to Run Jar file
1. Navigate to the project directory:
    ```bash
    cd Executable Jar
2. Run the bash code alongside the Jar
    ```bash
    Java --module-path "(path to javafx sdk library installed)" --add-modules javafx.controls,javafx.graphics,javafx.fxml,javafx.media -jar Petpal.jar
3. Now you can run the game from inside the Project
4. After exiting the game. Use ctrl + C in the cmd to stop the process.

### Steps to Run Locally
1. Clone this repository:
   ```bash
   git clone https://gitlab.sci.uwo.ca/courses/2024/09/COMPSCI2212/group37.git

2. Navigate to the project directory:
    ```bash
    cd ProjectFX2/src
3. Open the Project in your IDE.
4. Create a new run configuration with the following details:<br>
**Main Class**: application.Main <br>
**Project**: ProjectFX2<br>
**VM Options**: --module-path "(path to javafx sdk library installed)" --add-modules javafx.controls,javafx.graphics,javafx.fxml,javafx.media<br><br>
_**NOTE**: Path should be replaced with the actual path to your javaFX library_.

5. Save the configuration.

## How To Use
1. Run the application and create your virtual pet by selecting a sprite.
2. Use the interactive buttons to: <br>
- **Use Items:** Keep your pet's hunger level in check using Food Items as well as happiness using Toy Items.<br>
- **Play:** Ensure your pet stays happy.<br>
- **Sleep:** Allow your pet to recharge its energy.
- **Visit Vet:** Use in-game feature to Visit the Vet whenever the pet is low on health.
3. Save your progress when exiting the game.

## Screenshots
_Main Menu_ <br>
<img src="https://i.imgur.com/Ldg2jly.png" alt="Main Menu" width="300">

_New Game_ <br>
<img src="https://i.imgur.com/NbNZWFH.png" alt="New Game" width="300">

_Game World_ <br>
<img src="https://i.imgur.com/vjeFsPq.png" alt="Game World" width="300">


## Future Improvements
- Add more pet types and animations.
- Implement a pet aging system with unique stages of growth.
- Introduce new activities like teaching tricks or dressing up the pet.
- Multiplayer feature to let users interact with each other's pets.
- Smoother animations for pet movement.

---

_**PetPal created by:** Keito Hyde, Mahip Varlani, Shivansh Kushwaha, Grant Von Hagen, Maya Al Hourani_

