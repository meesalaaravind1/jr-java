#!/bin/bash

# driver.sh - The simplest autograder we could think of. It checks
#   that students can write a C program that compiles, and then
#   executes with an exit status of zero.
#   Usage: ./driver.sh

# Compile the code
(make clean;make javac)
# To save the output of the previous command in shell
status=$?
if [ ${status} -ne 0 ]; then
    echo "Failure: Unable to compile (return status = ${status})"
    echo "{\"scores\": {\"Correctness\": 0}}"
    exit
fi

status=$(make java)
echo "====================================================================================="
output="output.txt"
echo $status > $output
final_status=$(python3 format.py < $output)

if [[ ${final_status} == *"All testcases passed"* ]]; then
    echo ${final_status}
    echo "{\"scores\": {\"Correctness\": 20}}"
elif [[ ${final_status} == *"failed"* ]]; then
    echo ${final_status}
    echo "{\"scores\": {\"Correctness\": 0}}"
else
    echo "Some issues with testcases. Please contact course incharge."
    echo "{\"scores\": {\"Correctness\": 0}}"
fi

exit

