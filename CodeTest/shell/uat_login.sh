#!/bin/expect
spawn ssh -p 60022 xxxx@120.xxx.xxx.xxx
expect "*password:"
send "xxxxxxxxxxx\r"
interact
