"""
Library for the Escape game
"""
import random
import sys
import json
import os
import gc
from pygame import mixer
from time import sleep
from os import system
from colorama import Fore, Style, Back

mixer.init()

RED = Fore.RED
YELLOW = Fore.YELLOW
BLUE = Fore.BLUE
GREEN = Fore.GREEN
MAGENTA = Fore.MAGENTA
CYAN = Fore.CYAN
BLACK = Fore.BLACK
BACK_RED = Back.RED
DIM = Style.DIM
RESET_COLOR = Style.RESET_ALL

def music():
    """Takes in nothing, plays music"""
    mixer.music.load("scarymusic.mp3")
    mixer.music.play(-1)

def typewriter(string, time):
    """Takes in a string and a time, prints out the string with a typewriter effect"""
    for char in string:
        sleep(time)
        sys.stdout.write(char)
        sys.stdout.flush()

def commands():
    """Takes in nothing, prints out the commands"""
    print("""
================
Commands: """ + YELLOW + """
  - go """ + CYAN + """ [direction] """ + YELLOW + """
  - get """ + CYAN + """[item] """ + YELLOW  + """
  - look
  - quit """ + RESET_COLOR + """
================
        """)

def resize():
    """Take in nothing, resizes the window"""
    system('mode con: cols=100 lines=30')

def clear():
    """Takes in nothing, clears the screen"""
    system("cls")

def banner():
    """Takes in nothing, prints out the banner"""
    print("")
    banner = """
        ----------------------------------------------------------------------------------
        |    ▄████████    ▄████████  ▄████████    ▄████████    ▄███████▄    ▄████████    |
        |    ███    ███   ███    ███ ███    ███   ███    ███   ███    ███   ███    ███   |
        |    ███    █▀    ███    █▀  ███    █▀    ███    ███   ███    ███   ███    █▀    |
        |    ███▄▄▄       ███        ███          ███    ███   ███    ███  ▄███▄▄▄       |
        |    ███▀▀▀     ▀███████████ ███        ▀███████████ ▀█████████▀  ▀▀███▀▀▀       |
        |    ███    █▄           ███ ███    █▄    ███    ███   ███          ███    █▄    |
        |    ███    ███    ▄█    ███ ███    ███   ███    ███   ███          ███    ███   |
        |    ██████████  ▄████████▀  ████████▀    ███    █▀   ▄████▀        ██████████   |
        ----------------------------------------------------------------------------------
                                Made By: Parker Cranfield
                            Music: Scary Horror Music - Haunted
"""
    x = banner
    print(RED + x + RESET_COLOR)

def ending():
    """Takes in nothing, prints out the ending"""
    clear()
    print("")
    endbanner = """
            ------------------------------------------------------------------------
            |     ▄█     █▄   ▄█  ███▄▄▄▄   ███▄▄▄▄      ▄████████    ▄████████    |
            |    ███     ███ ███  ███▀▀▀██▄ ███▀▀▀██▄   ███    ███   ███    ███    |
            |    ███     ███ ███▌ ███   ███ ███   ███   ███    █▀    ███    ███    |
            |    ███     ███ ███▌ ███   ███ ███   ███  ▄███▄▄▄      ▄███▄▄▄▄██▀    |
            |    ███     ███ ███▌ ███   ███ ███   ███ ▀▀███▀▀▀     ▀▀███▀▀▀▀▀      |
            |    ███     ███ ███  ███   ███ ███   ███   ███    █▄  ▀███████████    |
            |    ███ ▄█▄ ███ ███  ███   ███ ███   ███   ███    ███   ███    ███    |
            |     ▀███▀███▀  █▀    ▀█   █▀   ▀█   █▀    ██████████   ███    ███    |
            |                                                        ███    ███    |
            ------------------------------------------------------------------------
    """
    x = endbanner
    for i in range(1, 20):
        print(RED + x)
        clear()
        print(YELLOW + x)
        clear()
    print("Good for you... Now go away")
    sleep(3)
    exit()