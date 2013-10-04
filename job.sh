#!/bin/bash
# =====================================
# Author : Luxing Huang
# Licence: GPL v3
# =====================================
#
# Description
# This file creates/removes/runs/edits/updates a java project insdie of 
# ~cs/comp1123/codes directory and copy the Makefile over to its src directory.
#
# You need to have alias jl='cd /path/to/your/code' set up in 
# your bashrc.
#

usage()
{
   echo 'Usage: To run this bash with the following syntax'
   echo '-c: To Create a java project.'
   echo '-r: To Run a java project.'
   echo '-e: To Edit a .java file'
   echo '-h or --help: Display this message.'
   echo '-u: To update from git.'
}

update()
{
   echo 'updateing... '
   git pull
}

create()
{
   echo 'Creating new dirs...'
   mkdir -p $PROJ_NAME/src
   echo 'Copy over the Makefile...'
   cp Makefile $PROJ_NAME/src
   cp Template.java $PROJ_NAME/src/$PROJ_NAME.java
   echo 'Entering src directory...'
   cd $PROJ_NAME/src
   echo "Replacing Makefile keywords to $PROJ_NAME..."
   sed -i "s/HelloWorld/$PROJ_NAME/g" Makefile
   echo "Copying the Template.java over..."
   sed -i "s/Template/$PROJ_NAME/g" $PROJ_NAME.java
   vim $PROJ_NAME.java
   echo 'Done!'
}

run()
{
   if [ -d "$PROJ_NAME" ] || [ -L "$PROJ_NAME" ]; then
      cd $PROJ_NAME/src
      if [ -e "$PROJ_NAME.java" ]; then
         javac $PROJ_NAME.java
         java $PROJ_NAME
         exit 0
      else 
         echo 'Source file not found.'
         exit 1
      fi
   else
      echo "$PROJ_NAME not existed"
      exit 1
   fi
}

edit()
{
   cd $PROJ_NAME/src
   if [ -e "$PROJ_NAME.java" ]; then
      vim $PROJ_NAME.java
   else
      echo 'No file found!'
      exit 1
   fi
}

if [ "$1" == "-h" ] || [ "$1" == "--help" ] || [ "$1" == "" ]; then
   usage
   exit 0

elif [ "$1" != "-h" ] && [ "$1" != "-c" ] && [ "$1" != "-r"   ] && [ "$1" \
   != "--help" ] && [ "$1" != "-e" ] && [ "$1" != "-u" ]; then
   usage
   exit 1
elif [ "$1" == "-r" ]; then
   if [ "$2" == "" ]; then
      echo 'Please enter project name'
      read -p 'here: ' PROJ_NAME
      run
   else
      PROJ_NAME=$2
      run
   fi
elif [ "$1" == "-c" ]; then
   if [ "$2" == "" ]; then
      echo 'Please enter your project name...'
      read -p "here:" PROJ_NAME
      if [ "$1" == "-c" ]; then
         if [ -d "$PROJ_NAME" ] || [ -L "$PROJ_NAME" ]; then
            echo "$PROJ_NAME exists"'\!'
            exit 1
         else
            create
            exit 0
         fi
      fi
   else 
      PROJ_NAME=$2
      if [ -d "$PROJ_NAME" ] || [ -L "$PROJ_NAME" ]; then
         echo "$PROJ_NAME exists"'!'
         exit 1
      else
         create
         exit 0
      fi
   fi
elif [ "$1" == "-e" ]; then
   if [ "$2" == "" ]; then
      echo 'Please enter your project name...'
      read -p 'here...' PROJ_NAME
      edit
   else 
      PROJ_NAME=$2
      edit
   fi
elif [ "$1" == "-u" ]; then
   update
else
   usage 
   exit 0
fi

exit 0


