""" 
'Escape' -- RPG made in python
Coded by Parker Cranfield
02/13/2020
"""

from escapelib import *
from rooms import *

inventory = []
currentRoom = "your room"

def status():
  """Takes in nothing, prints out the status of the player"""
  print("---------------------------")
  print("You are in " + YELLOW + currentRoom + RESET_COLOR)
  print("Inventory : " + BLUE + str(inventory) + RESET_COLOR)
  if "item" in rooms[currentRoom]:
    print("You see a " + MAGENTA + rooms[currentRoom]["item"] + RESET_COLOR)
  print("---------------------------")
  print()

def start():
    """Takes in nothing, begins the game loop"""
    music()
    commands()
    global currentRoom
    global inventory


    while True:
        status()

        move = ""
        while move == "":
            move = input(GREEN + ">> " + RESET_COLOR)
            move = move.lower().split(" ", 1)

            if move[0] == "go":
                if len(move) != 1:
                    if move[1] in rooms[currentRoom]:
                        newCurrRoom = currentRoom
                        currentRoom = rooms[currentRoom][move[1]]
                        if rooms[currentRoom]["end"] != True:
                            if rooms[currentRoom]["needed item"] != None:
                                if len(inventory) != 0:
                                    check = False
                                    for item in inventory:
                                            if item in rooms[currentRoom]["needed item"]:
                                                currentRoom = currentRoom
                                                check = True
                                    if not check:
                                        print("You do not have the item needed.")
                                        currentRoom = newCurrRoom
                                else:
                                    print("You do not have the correct item to go this direction.")
                                    currentRoom = newCurrRoom
                            else:
                                currentRoom = currentRoom
                        else:
                            ending()
                    else:
                        print("You can\'t go that way.")
                else:
                    print("Please Enter a direction to go.")

            if move[0] == "get" :
                if len(move) != 1:
                    if "item" in rooms[currentRoom] and move[1] in rooms[currentRoom]["item"]:
                        if rooms[currentRoom]["item"] == move[1]:
                            inventory += [move[1]]
                            print(move[1] + " got!")
                            del rooms[currentRoom]["item"]
                        else:
                            print("Can\'t get " + move[1] + "!")
                    else:
                        print("Can\'t get " + move[1] + "!")
                else:
                    print("Please Enter an item to get.")

            if move[0] == "look":
                print(rooms[currentRoom]["look"])

            if move[0] == "quit":
                clear()
                json.dump(inventory, open("saveinventory.txt", "w"))
                json.dump(currentRoom, open("saveroom.txt", "w"))
                del inventory
                del currentRoom
                print("Guess you will never " + RED + "Escape" + RESET_COLOR + "!")
                sleep(3)
                exit()

            if move[0] != "go" or move[0] != "get" or move[0] != "look" or move[0] != "quit":
                print()


def main():
    """Takes in nothing, prints intro and menu"""
    global inventory
    global currentRoom
    if os.stat("saveinventory.txt").st_size == 0:
        json.dump(inventory, open("saveinventory.txt", "w"))
    elif os.stat("saveroom.txt").st_size == 0:
        json.dump(currentRoom, open("saveroom.txt", "w"))
    else:
        clear()
        resize()
        print("when you want to quit, type the quit command!")
        sleep(3)
        clear()
        answers = ["y", "Y", "n", "N"]
        while True:
            pastlife = input("Do you want to load a past life, [y/n]? ")
            if pastlife not in answers:
                continue
            elif pastlife == "y":
                loadedinventory = json.load(open("saveinventory.txt", "r"))
                loadedroom = json.load(open("saveroom.txt", "r"))
                inventory = loadedinventory
                currentRoom = loadedroom
                clear()
                typewriter("You are all alone in your house...\n", 0.05)
                typewriter("You only have one simple task...", 0.05)
                sleep(1.5)
                clear()
                banner()
                start()
            else:
                clear()
                typewriter("You are all alone in your house...\n", 0.05)
                typewriter("You only have one simple task...", 0.05)
                sleep(1.5)
                clear()
                banner()
                start()
if __name__ == "__main__":
    main()