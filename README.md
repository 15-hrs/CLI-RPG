# ⚠️This project is still Under Development⚠️



# Forgotten Dungeon RPG

A Java command-line RPG set in the **Forgotten Dungeon**. Create your character, choose a race, class, and skill, then explore dungeon floors with random encounters.

## Requirements

* Java Development Kit (JDK)
* `javac` and `java` available in your PATH
* A terminal opened in the project folder where `main.java` is located

## Build and Run

Compile all Java source files using UTF-8 encoding:

```powershell
javac -encoding UTF-8 *.java
```

Then start the game:

```powershell
java main
```

## Main Menu

| Option | Action                                                |
| ------ | ----------------------------------------------------- |
| 1      | Play using a character created during the current run |
| 2      | Create a new character                                |
| 3      | Display characters created during the current run     |
| 4      | Exit the game                                         |

Character data is stored in memory and will be cleared when the program closes.

The game supports up to **five character slots**.

## Character Creation

Choose one of three available races:

* Human
* Elf
* Dwarf

Then choose a class and one of its starting skills.

| Class   | Skills                  |
| ------- | ----------------------- |
| Warrior | Sword Slash, Sword Stab |
| Archer  | Long Shot, Arrow Rain   |
| Mage    | Fireball, Ice Shard     |

Each class starts with a class-specific weapon.

Your character's stats are displayed while exploring the dungeon.

## Dungeon Exploration

The adventure starts at **Floor 1**.

Each floor displays your character's current stats and generates a random event.

Possible encounters include:

* **Chest:** Find items or possibly a new weapon.
* **Goblin:** Fight a dangerous enemy.
* **Skeleton:** Battle an undead enemy.
* **Slime:** Encounter a slime monster.
* **Merchant:** Meet a merchant and interact with their available items.

After each event, you can choose whether to continue to the next floor or stop exploring.

## Game Features

* Character creation
* Three playable races
* Three character classes
* Multiple starting skills
* Class-specific weapons
* Character stats
* Random dungeon events
* Multiple enemy types
* Chests and weapons
* Merchant encounters
* Up to five character slots
* Command-line gameplay
